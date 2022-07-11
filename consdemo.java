class const_over{
    double h,l,b;
   
    const_over(double l,double b,double h) //constructor overloading
    {
     this.l=l;
     this.b=b;
     this.h=h;

    }
    const_over(double l)
    {
        l=b=h=l;
    }
    double volume()
    {
      return l*b*h;
    }
    
    
    void print() //method overloading
    {
        System.out.println("methon overloading");
    }
    /**
     * @param v
     */
    void print(double v)
    {
        System.out.println("volume of box="+v);
    }
}
    

public class consdemo {
     public static void main(String[] args) {
        const_over cuboid=new const_over(10,20,10);
        const_over cube=new const_over(10);
        var v1=cuboid.volume();
        double v2=cube.volume();
        cuboid.print();
        cube.print();
        cube.print(v1);
        cuboid.print(v2);
        

     }
        
     
     }


    

    
