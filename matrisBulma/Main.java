package matrisBulma;
import java.util.Arrays;

public class Main {
    static void toPrint ( int[][] a){
        for( int[] row: a){
            for (int column: row){
                System.out.print(column);
            }
            System.out.println();
        }
        System.out.println("------------");
    }

    public static void main(String[] args) {

        int [][] arr = {
                { 2,3,4 },
                { 5,6,4}
        };

        toPrint(arr);

//        for( int[] row: arr){
//            for (int column: row){
//                System.out.print(column);
//            }
//            System.out.println();
//        }

        int [][] arr2 = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr2[i][j] = arr[j][i];
            }
        }

        toPrint(arr2);
    }
}
