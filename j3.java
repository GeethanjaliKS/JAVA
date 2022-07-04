import javax.print.DocFlavor.STRING;
import javax.xml.crypto.dsig.SignatureMethod;

class student
{
    int USN;
    String Name;
    void getdata(int u,String N) //local variable u,n
    {
        this.USN=u;
        this.Name=N;
    }
    void printdata()
    {
        System.out.println(Name+"\t"+USN);
    }
}

public class j3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        student s=new student();
        s.getdata(10, "smith");
        s.printdata();
    }
    
}
