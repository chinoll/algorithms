import edu.princeton.cs.algs4.*;
public class swap {
    public static void main(String[] args) {
        int array[][] = {{0,1,2,3,4,5,6,7,8,9},{9,8,7,6,5,4,3,2,1,0},{8,7,6,5,4,3,2,1,0,9},{7,6,5,4,3,2,1,0,8,9},{6,5,4,3,2,1,0,9,8,7}};
        // int array[][] = new int[5][10];
        StdOut.println("  01234");
        for (int i = 0;i < 10;i++) {
            StdOut.print(i);
            StdOut.print(" ");
            for (int j = 0;j < 5;j++) {
                StdOut.print(array[j][i]);
            }
            StdOut.println();
        }
    }
}