import java.util.Scanner;

public class PositionChanges extends Team{

    public static void promote(Matrix,int[][] matrix){
        Scanner bill = new Scanner(System.in);
        System.out.println("kérem a tömb 2 indexét:");
        int index1 = bill.nextInt();
        int index2 = bill.nextInt();

        System.out.println("kérem az adatot amire megakarja változtatni:");
        matrix[index1][index2]=bill.nextInt();

    }
}
