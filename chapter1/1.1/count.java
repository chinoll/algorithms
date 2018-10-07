import edu.princeton.cs.algs4.*;
public class count {
    public static int[] histogram(int[] a,int m) {
        int array[] = new int[m];
        for(int i = 0;i < a.length;i++) {
            if (a[i] < m) {
                array[a[i]]++;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,1,1,1,1,1,2,2,2,2,4,4,4,4,7,8,8,8,8,8,8,8,10,10,10,12,13,1,1,1,1,1,0,0,0,0,0};
        int b[] = histogram(a, 20);
        StdOut.println(a.length);
        for (int i = 0;i < 20;i++){
            StdOut.print(b[i]);
            StdOut.print(" ");
        }
    }
}