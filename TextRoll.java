/**
 * Created by kaitlynchilders on 10/10/14.
 */
import java.util.*;
public class TextRoll
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();

        while(x != 0)
        {
            String line = scan.nextLine();
            int counter = 1;

            for (int i = 0; i < x; i++)
            {
                line = scan.nextLine();
                counter = lines(line, counter);
            }

            System.out.println(counter);
            x = scan.nextInt();
        }
    }

    public static int lines(String line, int counter)
    {
        line = line + " ";
        int k = 0, j = 1;
        int tempcounter = 0;
        String ch = line.substring(k, k + 1);
        while (k < line.length())
        {
            if (ch.compareTo(" ") != 0)
            {
                tempcounter++;
                ch = line.substring(k, k + 1);
                k++;
            }
            else if (tempcounter < counter)
            {
                tempcounter++;
                ch = line.substring(k, k + 1);
                k++;
            }
            else
                break;
        }

        if (tempcounter > counter)
            return tempcounter;
        return counter;
    }
}
