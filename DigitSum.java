/**
 * Created by kaitlynchilders on 1/29/15.
 */

import java.util.*;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while (n != 0) {
            int[] digits = new int[n];
            for (int i = 0; i < n; i++) {
                digits[i] = scan.nextInt();
            }

            Arrays.sort(digits);
            int zeroCount = 0;

            while(digits[zeroCount] == 0)
            {
                zeroCount++;
            }


            for (int i = 0; i < 2; i++) {
                if (digits[i] == 0) {
                    int temp = digits[zeroCount + i];
                    digits[zeroCount + i] = 0;
                    digits[i] = temp;
                }
            }

            //System.out.println(Arrays.toString(digits));

            int sum = 0;
            for (int i = n - 1; i >= 0; i -= 2) {
                sum += digits[i] * Math.pow(10, ((n - i) / 2));
            }
            for (int i = n - 2; i >= 0; i -= 2) {
                sum += digits[i] * Math.pow(10, ((n - i - 1) / 2));
            }

            System.out.println(sum);

            n = scan.nextInt();
        }
    }
}