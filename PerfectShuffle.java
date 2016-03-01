import java.util.Scanner;

/**
 * Created by kaitlynchilders on 10/11/14.
 */
public class PerfectShuffle
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();

        scan.nextLine();


        while(x != 0)
        {
            String[] s1 = new String[(x / 2) + 1];
            String[] s2 = new String[x / 2];
            String[] s3 = new String[x];

            int j = x%2;

            if (j != 0) {
                for (int i = 0; i < ((x / 2) + 1); i++) {
                    s1[i] = scan.nextLine();
                }
                for (int i = 0; i < (x / 2); i++) {
                    s2[i] = scan.nextLine();
                }
            } else {
                for (int i = 0; i < (x / 2); i++) {
                    s1[i] = scan.nextLine();
                }
                for (int i = 0; i < (x / 2); i++) {
                    s2[i] = scan.nextLine();
                }
            }

            for (int i = 0; i < x; i += 2) {
                s3[i] = s1[i / 2];
            }
            for (int i = 1; i < x; i += 2) {
                s3[i] = s2[i / 2];
            }

            for (int i = 0; i < x; i++) {
                System.out.println(s3[i]);
            }

            x = Integer.parseInt(scan.nextLine());
        }

    }

}
