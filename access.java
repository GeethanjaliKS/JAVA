class outer{
    int outer_x=100;
    class inner
    {
        int inner_y=200;
        void imethod()
        {
            System.out.println("Accessing from inner class");
            System.out.println(outer_x);
            System.out.println(inner_y+outer_x);
        }
    }
    void display()
    {
        inner ob1=new inner();
        System.out.println("The vlaue of variable"+ob1.inner_y);
        System.out.println("The value of variable"+outer_x);
    }
}
public class access {
    public static void main(String[] args) {
        outer obname=new outer();
        obname.display();
        outer.inner obj2=obname.new inner();
        obj2.imethod();
    }
    
}
