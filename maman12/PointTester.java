public class PointTester {

    public static void main(String[] args) {

        // Test 1: Create a point with valid and invalid coordinates
        System.out.println("Test 1: Create point with valid and invalid coordinates");
        Point p1 = new Point(2, 3);
        System.out.println("p1 = " + p1);
        Point p2 = new Point(-1, 4);
        System.out.println("p2 = " + p2);
        Point p3 = new Point(5, -2);
        System.out.println("p3 = " + p3);
        Point p4 = new Point(-3, -4);
        System.out.println("p4 = " + p4);

        // Test 2: Get and set x and y coordinates
        System.out.println("\nTest 2: Get and set x and y coordinates");
        System.out.println("p1 before: " + p1);
        p1.setX(4);
        p1.setY(5);
        System.out.println("p1 after: " + p1);

        // Test 3: Check if two points are equal
        System.out.println("\nTest 3: Check if two points are equal");
        Point p5 = new Point(2, 3);
        System.out.println("p1: " + p1);
        System.out.println("p5: " + p5);
        System.out.println("p1.equals(p5): " + p1.equals(p5));

        // Test 4: Check if one point is above, under, left or right of another point
        System.out.println("\nTest 4: Check if one point is above, under, left or right of another point");
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p1.isAbove(p2): " + p1.isAbove(p2));
        System.out.println("p1.isUnder(p2): " + p1.isUnder(p2));
        System.out.println("p1.isLeft(p2): " + p1.isLeft(p2));
        System.out.println("p1.isRight(p2): " + p1.isRight(p2));

        // Test 5: Move a point and calculate its middle point and distance from another point
        System.out.println("\nTest 5: Move a point and calculate its middle point and distance from another point");
        System.out.println("p3 before move: " + p3);
        p3.move(-3, 4);
        System.out.println("p3 after move: " + p3);
        System.out.println("Middle point between p1 and p3: " + p1.middle(p3));
        System.out.println("Distance between p1 and p3: " + p1.distance(p3));

    }
}
