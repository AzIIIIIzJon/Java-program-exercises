// Your names here

public class GCD {

    private static int  recursionDepth = 0;

    int a;
    int b;




    public int getA() {
        return a;
    }



    public int getB() {
        return b;
    }

    public int getRecursionDepth() {
        return recursionDepth;
    }

    public static int gcd(int a, int b){
        recursionDepth++;
        System.out.printf("Ermittlung des ggT mit" + a, "und "+  b  + recursionDepth);
        if (b == 0) {
            return a;
        } else if (a == 0) {
            return b;
        } else if (a > b ) {
            return gcd(a -b,b);
        } else {
            return gcd(a,b - a);
        }
    }


    public   void main(String[] args) {


        System.out.println(gcd(a = 84, b= 66));
        System.out.println(gcd(a = 910, b= 526));
        System.out.println(gcd(a = 396, b= 526));



    }


}




