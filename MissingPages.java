/**
 * Created by kaitlynchilders on 1/29/15.
 */
import java.util.*;

public class MissingPages
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        while (N != 0) {
            int P = scan.nextInt();
            if (P <= N/2)
                if (P%2 == 0)
                    System.out.format("%d %d %d%n", P-1, N+1-P, N-P+2);
                else
                    System.out.format("%d %d %d%n", P+1, N-P, N-P+1);
            else
            if (P%2 == 0)
                System.out.format("%d %d %d%n", N-P+1, N-P+2, P-1);
            else
                System.out.format("%d %d %d%n", N-P, N-P+1, P+1);
            N = scan.nextInt();
        }

    }
}
