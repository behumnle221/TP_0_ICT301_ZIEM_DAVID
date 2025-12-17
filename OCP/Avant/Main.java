public class Main {
    public static void main(String[] args) {
       
        AreaCalculator calc = new AreaCalculator();

       
        Rectangle rect = new Rectangle(4, 3);
        double area = calc.calculateArea(rect);
        
        System.out.println("Area = " + area);
    }
}