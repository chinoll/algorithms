import edu.princeton.cs.algs4.*;
public class circular {
    public static void main(String[] args) {
        if (args.length != 2) {
            StdOut.printf("circular str1 str2\n");
        }
        if((args[0].length() == args[1].length()) && (args[0].concat(args[0]).indexOf(args[1]) >= 0)) {
            StdOut.printf("yes!\n");
        }
    }
}