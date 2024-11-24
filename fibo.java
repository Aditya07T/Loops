import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);
        double n = in.nextInt();
        double a =0;
        double i=1;
        double count =2;

        while(count <= n){
             double temp =i;
               i=  i+a;
             a =temp;
             count++;

        }

        System.out.println(i);
    }
}
