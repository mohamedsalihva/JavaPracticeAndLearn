package thisSample;

public class Sample {

    //global variable (using (this) to call global variables )
    int a=200,b=400;

    //local variable
    Sample(int a, int b){
        System.out.println(+this.a+   "  "   +this.b);
        this.a=a;
        this.b=b;
        System.out.println(a+   "  "   +b);
    }
}
