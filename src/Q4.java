import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int size;
        int results;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length : ");
        size=sc.nextInt();
        int [] numbers = new int[size] ;
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("Enter a number : ");
            numbers[i]=sc.nextInt();
        }
        results=numbers[0]+numbers[size-1];
        System.out.println("The result = "+ results);
    }
}
