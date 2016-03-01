/**
 * Created by kaitlynchilders on 10/12/14.
 */
import java.util.*;
public class ReverseNonogram
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            scan.nextLine();
        while (n != 0)
        {
            String[] nums = new String[2*n];
            for (int i = 0; i < n*2; i++)
            {
                nums[i] = "";
            }

            String[] rows = new String[n];
            String[] cols = new String[n];

            for (int i = 0; i < n; i++)
            {
                cols[i] = "";
            }

            int count = 0;

            for (int i = 0; i < n; i++)
            {
                rows[i] = scan.nextLine();
            }

            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    cols[j] += rows[i].substring(j, j+1);
                }
            }

            for (int i = 0; i < n; i++)
            {
                count = 0;
                String row = rows[i];

                for (int j = 0; j < n; j++)
                {
                    if (row.charAt(j) == 'X')
                    {
                        count++;
                    }
                    else if (count != 0)
                    {
                        nums[i] += "" + count + " ";
                        count = 0;
                    }
                }
                if (count != 0)
                {
                    nums[i] += "" + count;
                }
            }

            for (int i = n; i < n*2; i++)
            {
                count = 0;
                String col = cols[i - n];

                for (int j = 0; j < n; j++)
                {
                    if (col.charAt(j) == 'X')
                    {
                        count++;
                    }
                    else if (count != 0)
                    {
                        nums[i] += "" + count + " ";
                        count = 0;
                    }
                }
                if (count != 0)
                {
                    nums[i] += "" + count;
                }
                if (count == 0 && nums[i] == "")
                {
                    nums[i] += "" + count;
                }

            }

            for (int i = 0; i < n*2; i++)
            {
                System.out.println(nums[i]);
            }

            n = Integer.parseInt(scan.nextLine());

        }

    }
}

