package LSP.Avant;

public class Mainlsp {
    public static void main(String[] args) {
       
        Rectangle r = new Rectangle();
        r.setWidth(5);
        r.setHeight(4);
        System.out.println("Aire Rectangle (5x4) = " + r.getArea());

        
        Rectangle s = new Square();
        s.setWidth(5);
        s.setHeight(4); 
        
        System.out.println("Aire Square via Rectangle (5x4) = " + s.getArea());
    }
}
