package question19Shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius()); // Output: circle.radius= 3.75
        System.out.println("circle.area= " + circle.getArea()); // Output: circle.area= 44.178646691106465

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius()); // Output: cylinder.radius= 5.55
        System.out.println("cylinder.height= " + cylinder.getHeight()); // Output: cylinder.height= 7.25
        System.out.println("cylinder.area= " + cylinder.getArea()); // Output: cylinder.area= 96.76890771219959
        System.out.println("cylinder.volume= " + cylinder.getVolume()); // Output: cylinder.volume= 701.574580913447
    }
}
