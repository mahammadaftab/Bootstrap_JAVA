import java.util.Scanner;

class Rectangle {

    double length;
    double breadth;
    public Rectangle(double length, double breadth) {
        System.out.println("--- Constructor Called ---");
        System.out.println("Assigning parameter 'length' (" + length + ") to instance variable 'this.length'");
        this.length = length;

        System.out.println("Assigning parameter 'breadth' (" + breadth + ") to instance variable 'this.breadth'");
        this.breadth = breadth;
        System.out.println("--- Constructor Finished ---");
    }
    public double calculateArea() {
        return length * breadth;
    }
}
public class RectangleDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        double userLength = scanner.nextDouble();

        System.out.println("Enter the breadth of the rectangle:");
        double userBreadth = scanner.nextDouble();
        Rectangle myRect = new Rectangle(userLength, userBreadth);
        double area = myRect.calculateArea();
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The object's length is: " + myRect.length);
        System.out.println("The object's breadth is: " + myRect.breadth);

        scanner.close();
    }
}