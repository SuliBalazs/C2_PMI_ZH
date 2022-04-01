public class Matrix {

    public static void numberOfNonZeroValues(MatrixTest, int[][]matrix){
        int db=0;

        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    db++;
                }
            }
        }



    }
    public static void indexOfColumnsWithSameValues(MatrixTest, int[][]matrix){
        int dboszlop=0;

        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == matrix[i][j+1]) {
                    dboszlop++;
                }
            }
        }
    }
}
