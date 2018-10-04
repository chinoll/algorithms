import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class boolarray {
    public static void main(String[] args) {
        boolean array[][] = new boolean[10][10];
        StdOut.println(" 0123456789");
        for(int i = 0;i < 10;i++) {
            StdOut.print(i);
            for(int j = 0;j < 10;j++) {
                if (array[i][j] == true) {
                    StdOut.print("*");
                } else {
                    StdOut.print(" ");
                }
            }
            StdOut.print("\n");
        }
    }
}