/**
 * Created by kaitlynchilders on 9/20/14.
 */
import java.util.*;

public class NDaysOfChristmas
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        long total;
        while(x != 0)
        {
            total = x * (x+1) * (x+2)/6;

            System.out.println(total);
            x = scan.nextLong();
        }

    }
}
