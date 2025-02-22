public class Rectangle {
    double width, height;

    public Rectangle() {
    width = 60.00;
    height = 40.00;
    }

    public static void main (String[] args) {
        Rectangle dimension = new Rectangle();

        System.out.println("This rectangle's area is: " + dimension.width * dimension.height);
        System.out.println("This rectangle's perimeter is : " + 2 * (dimension.width + dimension.height));
    }
}
