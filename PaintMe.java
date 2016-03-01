import java.util.*;

public class PaintMe
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int w = scan.nextInt(), l = scan.nextInt(), h = scan.nextInt(),
                p = scan.nextInt(), m = scan.nextInt();
        int[] doorsH = new int[m];
        int[] doorsW = new int[m];

        while (n != 0)
        {
            for (int i = 0; i < m; i++)
            {
                doorsH[i] = scan.nextInt();
                doorsW[i] = scan.nextInt();
            }
            int x = paint(surfaceArea(w, l, h), doorsWindows(doorsH, doorsW), n, p);
            System.out.println(x);
            n = scan.nextInt();
            w = scan.nextInt();
            l = scan.nextInt();
            h = scan.nextInt();
            p = scan.nextInt();
            m = scan.nextInt();
            doorsH = new int[m];
            doorsW = new int[m];
        }

    }

    public static int surfaceArea(int w, int l, int h)
    {
        int w1 = w * l;
        int w2 = 2 * w * h;
        int w3 = 2 * h * l;

        return w1 + w2 + w3;
    }

    public static int doorsWindows(int[] H, int[] W)
    {
        int x = 0;
        for (int i = 0; i < H.length; i++)
        {
            x = x + H[i] * W[i];
        }
        return x;
    }

    public static int paint(int s, int d, int n, int p)
    {
        int roomArea = s - d;
        double paint = ((roomArea * n) / (double) p);
        return (int) Math.ceil(paint);
    }


}
