import java.util.Scanner;
import java.util.*;
import java.lang.*;

/**
 * Created by kaitlynchilders on 2/11/15.
 */
public class Runes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        boolean multi = false, add = false, subtract = false;
        int Q = -1, opindex = 0, equalindex = 0;

        boolean[] nums = {true, true, true, true, true, true, true, true, true, true};

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '+') {
                add = true;
                opindex = i;
            }
            if (line.charAt(i) == '*') {
                multi = true;
                opindex = i;
            }
            if (line.charAt(i) == '-' && i > 0 && !multi && !add && !subtract) {
                subtract = true;
                opindex = i;
            }
            if (line.charAt(i) == '-' && (i == 0 || multi || add || subtract)) {
                nums[0] = false;
            }
            if (line.charAt(i) == '=') {
                equalindex = i;
            }
            for (int j = 0; j <= 9; j++)
                if (line.charAt(i) == j + 48) {
                    nums[j] = false;
                }
        }

        char[] first, second, third;

        first = line.substring(0, opindex).toCharArray();
        second = line.substring(opindex + 1, equalindex).toCharArray();
        third = line.substring(equalindex+1, line.length()).toCharArray();

        boolean[] firstQ = new boolean[first.length], secondQ = new boolean[second.length],
                thirdQ = new boolean[third.length];

        for (boolean a : firstQ)
            a = false;
        for (boolean a : secondQ)
            a = false;
        for (boolean a : thirdQ)
            a = false;

        for (int i = 0; i < first.length; i++)
            if (first[i] == '?')
                firstQ[i] = true;
        for (int i = 0; i < second.length; i++)
            if (second[i] == '?')
                secondQ[i] = true;
        for (int i = 0; i < third.length; i++)
            if (third[i] == '?')
                thirdQ[i] = true;

        outerloop:
        for (int i = 0; i <= 9; i++)
        {
            if (nums[i]) {
                for (int j = 0; j < first.length; j++)
                    if (firstQ[j])
                        first[j] = (char) (((int) '0') + i);
                for (int j = 0; j < second.length; j++)
                    if (secondQ[j])
                        second[j] = (char) (((int) '0') + i);
                for (int j = 0; j < third.length; j++)
                    if (thirdQ[j]) {
                        third[j] = (char) (((int) '0') + i);
                    }

                String f = new String(first);
                String s = new String(second);
                String t = new String(third);

                long num1 = Long.parseLong(f);
                long num2 = Long.parseLong(s);
                long num3 = Long.parseLong(t);
                //System.out.println(num3);
                if (Math.abs(num1) > 999999 || Math.abs(num2) > 999999 || Math.abs(num3) > 999999) {
                    System.out.println("Stwp");
                    break outerloop;
                }

                if (multi)
                    if (num1 * num2 == num3) {
                        Q = i;
                        break outerloop;
                    }
                if (add)
                    if (num1 + num2 == num3) {
                        Q = i;
                        break outerloop;
                    }
                if (subtract)
                    if (num1 - num2 == num3) {
                        Q = i;
                        break outerloop;
                    }
            }
        }
        System.out.println(Q);
    }
}