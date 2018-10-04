import edu.princeton.cs.algs4.StdOut;
public class equal {
    public static void main(String[] args) {
        int a,b,c;
        if (args.length != 3) {
            StdOut.println("java equal x y z");
            return;
        }
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        if (a == b && b == c) {
            StdOut.println("equal");
        } else {
            StdOut.println("not equal");
        }
    }
}