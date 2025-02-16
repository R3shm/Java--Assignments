import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number: ");
        int num=sc.nextInt();
        int j=0;

        if(num>1){
            for(int i=1; i<=num; i++){
                if (num%i==0) {
                    j++;
                }
            }
        }

        if (j==2) {
            System.out.println(num+ " is a prime num");
        }else{
            System.out.println(num+ " is not a prime num");
        }
    }
}
