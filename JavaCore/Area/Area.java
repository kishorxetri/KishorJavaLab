package Area;

public class Area {

    public double rectangle(double length, double breadth) {
        return length * breadth;
    }

    public double circle(double radius) {
        return Math.PI * radius * radius;
    }

    public double square(double side) {
        return side * side;
    }

    public static void main(String[] args) {
        Area areaCalc = new Area();

        double rectArea = areaCalc.rectangle(5, 3);
        double circleArea = areaCalc.circle(4);
        double squareArea = areaCalc.square(6);

        System.out.println("Area of Rectangle: " + rectArea);
        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Square: " + squareArea);
    }
}
