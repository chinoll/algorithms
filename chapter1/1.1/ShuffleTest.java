import edu.princeton.cs.algs4.*;
public class ShuffleTest {
    public static void main(String[] args) {
        if (args.length != 2) {
            StdOut.printf("ShuffleTest m n\n");
        }
        int j = Integer.parseInt(args[0]);
        int array[] = new int[j];
        for(int n = 0;n < Integer.parseInt(args[1]);n++) {
            for(int i = 0;i < j;i++)
                array[i] = i;
            StdRandom.shuffle(array);
            for(int i = 0;i < j;i++) {
                StdOut.printf("%d ",array[i]);
            }
            StdOut.printf("\n");
        }
    }
}