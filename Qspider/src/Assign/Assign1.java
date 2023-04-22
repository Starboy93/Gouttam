package Assign;

public class Assign1 {

	public static void main(String[] args) {
		
		int no = 20152019;
		int a = no;
		int h = a;
		int sum = 0;
		while (no != 0)
		{
			int rem = no % 100;
			if (rem % 2 == 0)
			{
				sum = sum + (rem*rem);
			}
			no = no / 100;
		}
		System.out.println(sum);
		int s = 0;
		while (sum != 0)
		{
			int q = sum % 10;
			s = s + q;
			sum = sum / 10;
		}
		System.out.println(s);
		if (s % 2 == 0)
		{
			System.out.println("NOT PRIME");
		}
		else
		{
			System.out.println("PRIME");
		}
		while (a != 0)
		{
			int p = a % 100;
			if (p % 2 == 1)
			{
				System.out.print(p);
			}
			a = a / 100;
		}
		System.out.println();
		int b = 0;
		int c=0;
		int fact = 1;
		while (h != 0)
		{
			int rev = h % 100;
			if (rev % 2 == 1)
			{
				while (rev != 0)
				{
					int rem = rev % 10;
					b = b + rem;
					rev = rev / 10;
				}
			}
			h = h / 100;
		}
		System.out.println(b);
		while (b != 0)
		{
			int v = b % 10;
			c = c + v;
			b = b / 10;
		}
		System.out.println(c);
		for (int i = 1; i <= c; i++)
		{
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
