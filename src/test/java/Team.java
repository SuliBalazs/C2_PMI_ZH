import java.util.ArrayList;
public class Team {
    private String nev;
    private int pozi;

    public Team(String nev, int pozi) {
        this.name = nev;
        this.price = pozi;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.name = nev;
    }

    public int getPozi() {
        return pozi;
    }

    public void setPozi(int pozi) {
        this.pozi = pozi;
    }

    public static void newMember(Matrix, int[][] matrix){
        int x = 10;

        matrix = addX(matrix, x);

    }
    public static void leaveTeam(Matrix, int[][] matrix){
        int index=2;
        matrix = removeTheElement(matrix, index);
    }

    public static void getMembers(Matrix,int[][] matrix){
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                System.out.println(matrix[i][j]);
            }
        }
    }

}

