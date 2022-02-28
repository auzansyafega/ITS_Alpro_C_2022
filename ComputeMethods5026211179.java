import java.util.Random;

public class ComputeMethods5026211179 {

    public double fToC(double degreesF) {
        return 5/9.0*(degreesF-32);
    }

    public  double hypotenuse(double a, double b){
        return Math.sqrt((a*a)+(b*b));
    }

    public int roll() {
        Random dadu = new Random();
        int dadu1 = dadu.nextInt(6)+1;
        int dadu2 = dadu.nextInt(6)+1;
        return dadu1+dadu2;
    }
    public static void main(String[]args){

    } 
}