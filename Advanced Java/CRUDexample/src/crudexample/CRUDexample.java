package crudexample;
import java.sql.*;
import java.util.Scanner;
public class CRUDexample {
    static final String URL = "jdbc:mysql://localhost:3306/kishorjavadb";
    static final String USER = "root";
    static final String PASSWORD = ""; // replace with your MySQL password
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to Database: kishorjavadb");

            while (true) {
                
                System.out.println("1. Insert Student");
                System.out.println("2. View Students");
                System.out.println("3. Update Student Age");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                    case 1: // INSERT
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Email: ");
                        String email = sc.nextLine();
                        String insertQuery = "INSERT INTO students(name, age, email) VALUES (?, ?, ?)";
                        PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
                        insertStmt.setString(1, name);
                        insertStmt.setInt(2, age);
                        insertStmt.setString(3, email);
                        int rowsInserted = insertStmt.executeUpdate();
                        System.out.println(rowsInserted + " row(s) inserted.");
                        break;

                    case 2: // SELECT
                        String selectQuery = "SELECT * FROM students";
                        Statement selectStmt = conn.createStatement();
                        ResultSet rs = selectStmt.executeQuery(selectQuery);
                        System.out.println("\nID\tName\tAge\tEmail");
                        while (rs.next()) {
                            System.out.println(rs.getInt("id") + "\t" +
                                               rs.getString("name") + "\t" +
                                               rs.getInt("age") + "\t" +
                                               rs.getString("email"));
                        }
                        break;

                    case 3: // UPDATE (by ID)
                        System.out.print("Enter Student ID to Update Age: ");
                        int uId = sc.nextInt();
                        System.out.print("Enter New Age: ");
                        int newAge = sc.nextInt();
                        sc.nextLine();

                        String updateQuery = "UPDATE students SET age=? WHERE id=?";
                        PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
                        updateStmt.setInt(1, newAge);
                        updateStmt.setInt(2, uId);
                        int rowsUpdated = updateStmt.executeUpdate();
                        System.out.println(rowsUpdated + " row(s) updated.");
                        break;

                    case 4: // DELETE (by ID)
                        System.out.print("Enter Student ID to Delete: ");
                        int dId = sc.nextInt();
                        sc.nextLine();

                        String deleteQuery = "DELETE FROM students WHERE id=?";
                        PreparedStatement deleteStmt = conn.prepareStatement(deleteQuery);
                        deleteStmt.setInt(1, dId);
                        int rowsDeleted = deleteStmt.executeUpdate();
                        System.out.println(rowsDeleted + " row(s) deleted.");
                        break;

                    case 5: // EXIT
                        System.out.println("Exiting program...");
                        conn.close();
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Try again!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
