public class Test{


    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(3, 4, 5);
        Triangle triangle2 = new Triangle(0, 4, 5);

        try {
            System.out.println(triangle1.getArea());
            System.out.println(triangle2.getArea());

        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
