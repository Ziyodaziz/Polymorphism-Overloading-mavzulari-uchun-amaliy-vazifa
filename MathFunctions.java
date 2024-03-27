package PolymorphismOverloading;

public class MathFunctions {

    double a;
    double b;
    double c;

    public MathFunctions(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public void add(){
        c = a + b;
        System.out.println("Yig'indisi: " + c);
    }

    public void sub(){
        c = a - b;
        System.out.println("Ayirmasi: " + c);
    }

    public void multiply(){
        c = a * b;
        System.out.println("Ko'paytmasi: " + c);
    }

    public void div(){
        c = a / b;
        System.out.println("Bo'linmasi: " + c);
    }

    public void abs(){
        if(a<0){
            a = a * (-1);
        }
        System.out.println("a sonini absolyut qiymati:" + a);
    }

    public void pow(){
        a = a*a;
        System.out.println("a sonini kvadrati: " + a);
    }

}
