
import java.text.DecimalFormat;
import java.util.Scanner;

public class Quiz1 {
	
public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("How many touchdowns?");
		double TD = s.nextDouble();
		
		System.out.println("How many total yards?");
		double Yards = s.nextDouble();
		
		System.out.println("How many interceptions?");
		double INT = s.nextDouble();
		
		System.out.println("How many completions?");
		double comp = s.nextDouble();
		
		System.out.println("What's the number of passes attempted?");
		double ATT = s.nextDouble();
		
		
		double a = (comp/ATT - 0.3) * 5;
		double b = (Yards/ATT - 3) * 0.25;
		double c = (TD/ATT) * 20;
		double d = 2.375 - ((INT/ATT) * 25);
		
		double PasserRating = ((a + b + c + d)/6) * 100;
		
		DecimalFormat score = new DecimalFormat("0.000");
		System.out.println("This is the Passer Rating score: " + score.format(PasserRating));
		s.close();
	}


}
