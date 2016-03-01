import java.util.Scanner;

/**
 * Created by kaitlynchilders on 10/12/14.
 */
public class LottoTickets
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
        while (n != 0)
        {
            int count = 0;

                int[] nums = new int[49];
                for (int i = 0; i < (n*6); i++)
                {
                    int x = scan.nextInt();
                    nums[x-1] = x;
                }

                for (int i = 0; i < 49; i++)
                {
                    if (!(nums[i] == 0))
                    {
                        count++;
                    }
                }
                if (count == 49)
                    System.out.println("Yes");
                else
                    System.out.println("No");


            n = scan.nextInt();
        }
    }
}
