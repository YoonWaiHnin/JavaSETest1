import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the number : ");
            num=sc.nextInt();
            if (num%2==0){
                System.out.println(num + "is even number.");
            }
            else {
                System.out.println(num + " is odd number.");
            }
        }

    }
}
