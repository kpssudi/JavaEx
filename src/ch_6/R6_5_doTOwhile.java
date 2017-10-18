package ch_6;

public class R6_5_doTOwhile {

	public static void main(String[] args) {
		int n = 1;
		double x = 0;
		double s;
		do
		{
			s = 1.0 / (n * n);
			x = x + s;
			System.out.println(x);
			n++;
		}
		while (s > 0.01);
		s = 0.02;
		while (s > 0.01) {
			s = 1.0 / (n * n);
			x = x + s;
			System.out.println(x);
			n++;
			
		}
	}
}
