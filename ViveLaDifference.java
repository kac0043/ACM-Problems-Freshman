import java.util.*;
public class ViveLaDifference 
{

	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		while (a != 0 || b != 0 || c != 0 || d != 0)
		{
			System.out.println(steps(a, b, c, d));
			
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			d = scan.nextInt();
		}
			
	}
	
	public static int steps (int a, int b, int c, int d)
	{
		int steps = 0;
		int tempa,tempb, tempc, tempd;
		while(a != b || b != c || c != d || d != a)
		{
			tempa = Math.abs(a-b);
			tempb = Math.abs(b-c);
			tempc = Math.abs(c-d);
			tempd = Math.abs(d-a);
			a = tempa;
			b = tempb;
			c = tempc;
			d = tempd;
			steps++;
		}
		
		return steps;
	}
}
