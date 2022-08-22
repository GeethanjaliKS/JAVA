import java.util.Queue;
import java.util.Scanner;
class queue_demoException extends Exception{
        public void Error(){
            System.out.println("queue is full");
        }
}
class queue_demo{
    int rear;
    int front;
    int q[];
    queue_demo(int n){
        q=new int[n];
    }
    void insert(int ele)throws queue_demoException
    {
        if(rear>=q.length-1)
        {
            throw new queue_demoException();

        }
        if(front==-1)
            front=0;
        q[rear++]=ele;
    }
       
    int delete()
    {
        int ele;
         if(front==-1){
            throw new ArrayIndexOutOfBoundsException();
         }
         if(front==rear)
         {
            ele=q[front];
            rear=front=-1;
         }
         else{
            ele=q[front++];
         }
         return ele;}
    
        void display(){
            if(front==-1){
                System.out.println("queue is empty");
                return;

            }
            for(int i=front;i<=rear;i++)
            System.out.println(q[i]+"\t");
            }
        }
        




public class queue {
    public static void main(String[] args) throws queue_demoException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of queue array");
        int size=sc.nextInt();
        queue_demo q=new queue_demo(size);
        try{
         while(true){
            System.out.println("1.insert 2.delete 3.display 4.exit");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch){
                case 1:System.out.println("Enter elements");
                    q.insert(sc.nextInt());
                    break;
                case 2:q.delete();
                     break;
                case 3:q.display();
                      break;   
                default:System.out.println("invalid choice");          
                      return;        
            }
         }}catch(queue_demoException e){
            e.Error();
         }
         catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Queue is empty");
         }}}

   
    
    

