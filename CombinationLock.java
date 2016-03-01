import java.util.*;
public class CombinationLock
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();


        while (x != 0)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();


            int clicks = (2*x) + (x-1); // 20

            if (b-a > 0)
                clicks += x + (b-a); //220 + 80 + 20
            else
                clicks += x + (x + (b - a));

            if (b-c > 0)
                clicks += (b-c);
            else
                clicks += (x + (b - c)); //320 +

            System.out.println(clicks);

            x = scan.nextInt();
        }

    }
}
