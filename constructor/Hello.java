package constructor;

public class Hello {
    public static void main(String[]arg){
        Sample s =new Sample();
        Hello h= new Hello();
    }

    Hello(){
        System.out.println("this is constructor hello");
    }
}
