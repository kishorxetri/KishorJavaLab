// Superclass
class Box {
    double length, breadth, height;

    // Constructor
    Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Method to compute volume
    double getVolume() {
        return length * breadth * height;
    }
}

// Subclass
class BoxWeight extends Box {
    double weight;

    // Constructor using super
    BoxWeight(double length, double breadth, double height, double weight) {
        super(length, breadth, height);  // Call to superclass constructor
        this.weight = weight;
    }

    // Method to display weight
    void displayWeight() {
        System.out.println("Weight: " + weight);
    }
}

// Main class
public class BoxDemo {
    public static void main(String[] args) {
        // Create first BoxWeight object
        BoxWeight box1 = new BoxWeight(3.0, 5.0, 4.0, 11);

        // Create second BoxWeight object
        BoxWeight box2 = new BoxWeight(1.0, 4.0, 3.5, 7.0);

        // Display volume and weight of box1
        System.out.println("Box 1 Volume: " + box1.getVolume());
        box1.displayWeight();

        // Display volume and weight of box2
        System.out.println("Box 2 Volume: " + box2.getVolume());
        box2.displayWeight();
    }
}
