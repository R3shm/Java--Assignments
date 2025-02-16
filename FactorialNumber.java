import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(("enter a number: "));
        int x=sc.nextInt();
        int fact=1;

        for(int i=x; i>=1; i--){
            fact=fact*i;
        }
        System.out.println("the factorial of the number is "+fact);

    }
}
