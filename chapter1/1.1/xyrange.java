import edu.princeton.cs.algs4.*;
public class xyrange {
    public static void main(String[] args) {
        double x,y;
        StdOut.print("Please enter a number:");
        x = StdIn.readDouble();
        StdOut.print("Please enter a number:");
        y = StdIn.readDouble();
        if (x > 0.0 && x < 1.0 && y > 0.0 && y < 1.0) {
            StdOut.println("true");
        } else {
            StdOut.println("false");
        }
    }
}