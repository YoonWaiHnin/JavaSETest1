import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length : ");
        size=sc.nextInt();
        int [] numbers = new int[size] ;
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("Enter a number : ");
            numbers[i]=sc.nextInt();
        }
        for (int i = numbers.length-1;i>=0;i--){
            System.out.print(numbers[i] + " ");
        }
    }
}
