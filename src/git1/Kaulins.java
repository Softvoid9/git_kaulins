package git1;
import java.util.Random;
import java.util.Scanner;
public class Kaulins {
	static int mestKaulinu(int reizes) {
	int skaitlis;
	Random rand=new Random();
	int min = 6;
	
	for(int i=1;i<=reizes;i++) {
		skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzraksta skaitli: "+skaitlis);
		if(skaitlis < min)
			min = skaitlis;
	}
		return min; 
	}
	public static void main(String[] args) {
		int reizes;
		Scanner scan = new Scanner(System.in);
		System.out.println("Cik reizes mest kauliņu?");
		reizes=scan.nextInt();
		System.out.println("Mazākais skaitlis no visiem meitieniem: "+ mestKaulinu(reizes));
		
		scan.close();
}
}