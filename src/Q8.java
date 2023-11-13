import java.util.Arrays;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        int size;
       int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length : ");
        size=sc.nextInt();
        int [] numbers = new int[size] ;
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("Enter a number : ");
            numbers[i]=sc.nextInt();
        }
//        for (int i = 0; i < size; i++) {
//            sum = sum + numbers;
//        }

        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
}
