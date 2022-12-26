import java.util.Scanner;

public class Factorial {
static int factor(int N) {
     if (N == 0)

return 1;
     else
         return N * factor(N - 1);




 }
    public static void main(String[] args) {
Scanner fact=new Scanner(System.in);
int factor=fact.nextInt();
       factor = factor(factor);

        System.out.println(factor);
    }
}
