package Super;

public class Sample extends Hello{
    int a;

    
        Sample(){
            System.out.println("this is sample constructor");
           }
           
    
        Sample(int a){
            super(10);
            System.out.println("this is argument sample constructor");
           }


    void display(){
        System.out.println("this is b");


        a=20; //sample class
        super.a=10; //HELLO class
        int c =a+super.a;
        System.out.println(+c);

        super.display();
    }



    public static void main(String[] args) {
        Sample s=new Sample(10);
        
       s.display();  
    } 

}
