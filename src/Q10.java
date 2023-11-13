import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        int size;
        //int [] large;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length : ");
        size=sc.nextInt();
        int [] numbers = new int[size] ;
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("Enter a number : ");
            numbers[i]=sc.nextInt();
        }

        for (int i = 0; i <size ; i++) {
            if (numbers[i]>numbers[i+1]){

            }
        }
    }
}
