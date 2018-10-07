import edu.princeton.cs.algs4.*;
//import Math.*;
public class lnfactorial {
    public static long factorial(int n) {
        if (n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
    public static long lnfact(int n) {
        return (long)Math.log((double)factorial(n));
    }
    public static void main(String[] args) {
        /*
            input:1
            output:0
            input:2
            output:0
            input:3
            output:1
            input:4
            output:3
            input:10
            output:15
            input:100
            output:-9223372036854775808(wrong answer)
            Should output:363
        */  
        StdOut.print("Please enter a number:");
        int n = StdIn.readInt();
        StdOut.println(lnfact(n));
    }
}