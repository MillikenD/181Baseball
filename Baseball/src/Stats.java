import java.util.Scanner;

public class Stats {
	
	private static int AB, H, B2, B3, HR, R, BB;
	
	public static double BA()
	{
		return (double) H / AB;
	}
	
	public static double OBP()
	{
		return (double) (H+BB) / (AB + BB);
	}
	
	public static double SLG()
	{
		return (double) TB() / AB;
	}
	
	public static double OBS()
	{
		return (OBP() + SLG());
	}
	
	public static int TB()
	{
		return H + B2 + (2 * B3) + (3 * HR);
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is the player's name?");
		String name = input.nextLine();
		System.out.println("What is the player's at bats?");
		AB = input.nextInt();
		System.out.println("What is the player's hits?");
		H = input.nextInt();
		System.out.println("What is the player's doubles?");
		B2 = input.nextInt();
		System.out.println("What is the player's triples?");
		B3 = input.nextInt();
		System.out.println("What is the player's home runs?");
		HR = input.nextInt();
		System.out.println("What is the player's runs?");
		R = input.nextInt();
		System.out.println("What is the player's walks?");
		BB = input.nextInt();
		System.out.println(name+"'s stats are:");
		System.out.println("Batting Average: " + BA());
		System.out.println("One Base Percentage: " + OBP());
		System.out.println("Slugging Percentage: " + SLG());
		System.out.println("On Base and Slugging Percentage: " + OBS());
		System.out.println("Total Bases: " + TB());
	}

}
