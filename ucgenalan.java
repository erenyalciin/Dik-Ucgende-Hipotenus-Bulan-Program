
import java.util.Scanner;
public class ucgenalan {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b, c;
		double u, alan, cevre;
		
		
		System.out.println("a köşesinin uzunluğunu giriniz: ");
		a = input.nextInt();

		System.out.println("b köşesinin uzunluğunu giriniz: ");
		b = input.nextInt();
		
		System.out.println("c köşesinin uzunluğunu giriniz: ");
		c = input.nextInt();
		
		
		u = (a+b+c)/2.0;
		cevre = 2*u;
		alan = Math.sqrt((u*(u-a)*(u-b)*(u-c)));
		
		
		System.out.println("Üçgenin çevresi : " + cevre);
		System.out.println("Üçgenin alanı : " +  alan);
	
		

	}

}
