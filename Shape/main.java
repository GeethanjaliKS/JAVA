package Shape;

public class main {
    public static void main(String[] args) {
        circle Circle=new circle();
        Circle.getData(5.5);
        System.out.println("The values circle"+Circle.area());
        square Square=new square();
        Square.getData(5);
        System.out.println("The values of Sqaure"+Square.area());
        triangle tr=new triangle();
        tr.getData(5,4);
        System.out.println("The value of Triangle"+tr.area());

    }
    
}
