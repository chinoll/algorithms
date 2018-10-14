import edu.princeton.cs.algs4.*;
public class table {
    private static String[] name;
    private static int[] n;
    private static int[] m;
    private static int N;
    private static int maxlen,maxlen2,maxlen3;
    private static int count;

    private static void expandTable() {
        N += 10;
        String[] name2 = (String[])new String[N];
        int[] n2 = (int[])new int[N];
        int[] m2 = (int[])new int[N];
        System.arraycopy(name, 0, name2, 0, name.length);
        System.arraycopy(n, 0, n2, 0, n.length);
        System.arraycopy(m, 0, m2, 0, m.length);
        name = name2;
        n = n2;
        m = m2;
    }
    public static void printLine(String str,int len) {
        StdOut.print(str);
        for(int i = 0;i < Math.abs(len - str.length() + 9);i++)
            StdOut.print(" ");
        StdOut.print("|");
    }
    public static void printTable() {
        for(int i = 0;i < maxlen + maxlen2 + maxlen3 + 30;i++)
            StdOut.print("-");
        StdOut.print("\n|");
        printLine("name",maxlen - 1);
        printLine("n",maxlen2);
        printLine("m", maxlen3);
        for(int i = 0;i < count;i++) {
            StdOut.print("\n|");
            printLine(name[i],maxlen - 1);
            printLine(n[i] + "",maxlen2);
            printLine(m[i] + "",maxlen3);
        }
        StdOut.print("\n");
        for (int i = 0; i < maxlen + maxlen2 + maxlen3 + 30; i++)
            StdOut.print("-");
        StdOut.print("\n");
        StdOut.printf("count:%d",count);
    }
    public static void main(String[] args) {
        N = 3;
        name = new String[N];
        n = new int[N];
        m = new int[N];
        while(true) {
            String line = StdIn.readLine();
            if (line.equals("print")) {
                printTable();
                return;
            }
            int len = line.length();
            for(int i = 0;i < len;i++) {
                if(line.charAt(0) != ' ')
                    break;
                else 
                    line = line.substring(1);
            }
            String x[] = line.split(" ");
            name[count] = x[0];
            n[count] = Integer.parseInt(x[1]);
            m[count] = Integer.parseInt(x[2]);
            if (x[0].length() > maxlen)
                maxlen = x[0].length();
            if (x[1].length() > maxlen2)
                maxlen2 = x[1].length();
            if (x[2].length() > maxlen3)
                maxlen3 = x[2].length();
            count++;
            if(count == (N - 1)) {
                expandTable();
            }

        }

    }
}