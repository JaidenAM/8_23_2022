import java.util.Random;


public class ComputeMethods {
    public void hypotenuse(int a, int b){
        double A = Math.pow(a, 2);
        double B = Math.pow(b, 2);
        double C = A + B;
        double asnw = Math.sqrt(C);
        System.out.println(asnw);
    }
    public void fToC(double degreesF){
        double c = 5/9*(degreesF-32);
        System.out.println(c);
    }
    public void roll(){
        Random rand = new Random();
        int chance = rand.nextInt(6)+1;
        System.out.println(chance);
        Random rand2 = new Random();
        int chance2 = rand2.nextInt(6)+1;
        System.out.println(chance2);
    }
}
