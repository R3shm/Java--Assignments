import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.print("the sum of two number is ");
        int sum=a+b;
        System.out.println(sum);
 
    }
}
