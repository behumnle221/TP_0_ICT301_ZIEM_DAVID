public class Main {
    public static void main(String[] args) {
        Shape myRectangle = (Shape) new Rectangle(4, 3);
        Shape myCircle = (Shape) new Circle(5);

        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Area Rectangle = " + calculator.calculateArea(myRectangle));
        System.out.println("Area Circle = " + calculator.calculateArea(myCircle));
    }
}