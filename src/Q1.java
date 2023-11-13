import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int num;
        int a = 0,b = 1;
        int ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num=sc.nextInt();
        for (int i = 0; i < num; i++) {

            System.out.print(a +"    ");
            ans = a+b;
            a=b;
            b=ans;
            if (i>num){
                break;
            }


//            if (i % 1 == 0 && 0 == 0){
//                System.out.print(num + "  ");
//            }
        }

    }
}
