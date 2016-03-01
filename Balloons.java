/**
 * Created by kaitlynchilders on 10/10/14.
 */
import java.util.*;

import static java.util.Arrays.sort;

public class Balloons
{
    public static class tables extends Object implements Comparable<tables>
    {
        public int diff;
        public int k;
        public int DB;
        public int DA;

        public tables(int kI, int DAI, int DBI)
        {
            k = kI;
            DA = DAI;
            DB = DBI;

            diff = Math.abs(DA-DB);
        }

        @Override
        public int compareTo(tables that)
        {
            return that.diff - this.diff;
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int distance = 0;

        tables[] teams = new tables[n];

        while (n!= 0)
        {
            for (int i = 0; i < n; i++)
            {
                int k = scan.nextInt();
                int DA = scan.nextInt();
                int DB = scan.nextInt();
                tables team = new tables(k, DA, DB);
                teams[i] = team;
            }

            sort(teams);

            for (int i = 0; i < teams.length; i++)
            {
                if (teams[i].DA <= teams[i].DB)
                {
                    if (teams[i].k <= a)
                    {
                        a = a - teams[i].k;
                        distance += (teams[i].k * teams[i].DA);
                    }
                    else
                    {
                        teams[i].k = teams[i].k - a;
                        distance += (a * teams[i].DA);
                        a = 0;

                        b = b - teams[i].k;
                        distance += (teams[i].k * teams[i].DB);
                    }
                }
                else
                {
                    if (teams[i].k <= b)
                    {
                        b = b - teams[i].k;
                        distance += (teams[i].k * teams[i].DB);
                    }
                    else
                    {
                        teams[i].k = teams[i].k - b;
                        distance += (b * teams[i].DB);
                        b = 0;

                        a = a - teams[i].k;
                        distance += (teams[i].k * teams[i].DA);
                    }
                }
            }
            System.out.println(distance);
            n = scan.nextInt();
            a = scan.nextInt();
            b = scan.nextInt();
            distance = 0;

            teams = new tables[n];

        }

    }


}
