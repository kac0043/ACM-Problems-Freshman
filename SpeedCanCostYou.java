/**
 * Created by kaitlynchilders on 10/10/14.
 */
import java.util.*;

public class SpeedCanCostYou
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();

        while (m != 0)
        {
            double time1 = (double) m/s1;
            double time2 = (double) m/s2;
            double diff = Math.abs(time1-time2);

            int hours = (int) diff;

            int min = (int) ((diff-hours) * 60.0);

            int sec = (int) Math.round(((diff - hours - (min/60.0)) * 3600.0));

            String minutes = "" + min;
            String seconds = "" + sec;

            if (minutes.length() < 2)
                minutes = "0" + minutes;
            if (seconds.length() < 2)
                seconds = "0" + seconds;

            System.out.println(hours + ":" + minutes + ":" + seconds);

            m = scan.nextInt();
            s1 = scan.nextInt();
            s2 = scan.nextInt();

        }

    }
}
