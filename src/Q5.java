import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
//        int row,col;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the two dimensional array of row : ");
//        row = sc.nextInt();
//        System.out.println("Enter the two dimensional array of column : ");
//        col = sc.nextInt();

        int [][] Two = {{1,2,3,4,5},
                {5,4,3,2,1},
                {7,8,9,1,5,7,7}
        };



        for (int i = Two.length-1; i >= 0  ; i--) {
            for (int j = 0; j < Two[i].length; j++) {
                System.out.print(Two[i][j]+ "   ");
            }
            System.out.println();
        }
    }
}
