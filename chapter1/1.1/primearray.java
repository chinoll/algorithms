import edu.princeton.cs.algs4.*;
public class primearray {
    private static int N = 10;
    private static int GCD(int n,int m) {
        int t;
        while(m != 0) {
            t = m;
            m = n%m;
            n = t;
        }
        return n;
    }
    private static boolean isPrime(int n,int m) {
        if (GCD(n,m) == 1) 
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        boolean array[][] = new boolean[N][N];
        StdOut.print("  ");
        for(int i = 0;i < N;i++) {
            StdOut.print(i);
            StdOut.print("     ");
        }
        StdOut.print("\n");
        for(int i = 0;i < N;i++) {

            StdOut.printf("%d ",i);
            for(int j = 0;j < N;j++) {
                if (isPrime(i,j)) {
                    array[i][j] = true;
                    StdOut.print(array[i][j]);
                    StdOut.print(" ");
                } else {
                    StdOut.print(array[i][j]);
                }
                StdOut.print(" ");
            }
            StdOut.print("\n");
        }
    }
}