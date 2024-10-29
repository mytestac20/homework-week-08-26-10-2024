package homework;

/**
 * You have to represent a point in 2D space. Write a class with the name homework.Point. The class needs two
 * fields (instance variables) with name x and y of type int.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters x and y of type int and it needs to initialize the
 * fields.
 * Write the following methods (instance methods):
 * * Method named getX without any parameters, it needs to return the value of x field.
 * * Method named getY without any parameters, it needs to return the value of y field.
 * * Method named setX with one parameter of type int, it needs to set the value of the x field.
 * * Method named setY with one parameter of type int, it needs to set the value of the y field.
 * * Method named distance without any parameters, it needs to return the distance between this
 * homework.Point and homework.Point 0,0 as double.
 * * Method named distance with two parameters x, y both of type int, it needs to return the distance
 * between this homework.Point and homework.Point x,y as double.
 * * Method named distance with parameter another of type homework.Point, it needs to return the distance
 * between this homework.Point and another homework.Point as double.
 * How to find the distance between two points?
 * To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
 * d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
 * Where √ represents square root.
 * TEST EXAMPLE
 * → TEST CODE:  Write the below code into the main method.
 * homework.Point first = new homework.Point(6, 5);
 * homework.Point second = new homework.Point(3, 1);
 * System.out.println("distance(0,0)= " + first.distance());
 * System.out.println("distance(second)= " + first.distance(second));
 * System.out.println("distance(2,2)= " + first.distance(2, 2));
 * homework.Point point = new homework.Point();
 * System.out.println("distance()= " + point.distance());
 * OUTPUT
 * distance(0,0)= 7.810249675906654
 * distance(second)= 5.0
 * distance(2,2)= 5.0
 * distance()= 0.0
 * NOTE: Use Math.sqrt to calculate the square root √.
 * NOTE: Try to avoid duplicated code.
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 7 methods.
 */

public class Point {
        // Instance variables
        private int x;
        private int y;

        // No-arg constructor
        public Point() {
            this.x = 0;
            this.y = 0;
        }

        // Constructor with parameters
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // Getter for x
        public int getX() {
            return x;
        }

        // Getter for y
        public int getY() {
            return y;
        }

        // Setter for x
        public void setX(int x) {
            this.x = x;
        }

        // Setter for y
        public void setY(int y) {
            this.y = y;
        }

        // Distance to (0,0)
        public double distance() {
            return Math.sqrt(x * x + y * y);
        }

        // Distance to point (x, y)
        public double distance(int x, int y) {
            return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
        }

        // Distance to another homework.Point
        public double distance(Point another) {
            return Math.sqrt((another.x - this.x) * (another.x - this.x) + (another.y - this.y) * (another.y - this.y));
        }

        public static void main(String[] args) {
            // Test code
            Point first = new Point(6, 5);
            Point second = new Point(3, 1);
            System.out.println("distance(0,0)= " + first.distance());
            System.out.println("distance(second)= " + first.distance(second));
            System.out.println("distance(2,2)= " + first.distance(2, 2));
            Point point = new Point();
            System.out.println("distance()= " + point.distance());
        }
}
