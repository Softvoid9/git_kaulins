import java.util.Random;
import java.util.Scanner;
public class Kaulins {
    static void mestKaulinu(int reizes) {
        int skaitlis;
        Random rand = new Random();
        int min = 6;
        int max = 1;
        int suma = 0;
        for (int i = 1; i <= reizes; i++) {
            skaitlis = rand.nextInt(6) + 1;
            System.out.println(i + ". metiens: " + skaitlis);
            if (skaitlis < min) {
                min = skaitlis;
            }
            if (skaitlis > max) {
                max = skaitlis;
            }
            suma += skaitlis;
        }
        System.out.println("--------------------------------");
        System.out.println("Mazākais skaitlis: " + min);
        System.out.println("Lielākais skaitlis: " + max);
        System.out.println("Visu metienu summa: " + suma);
    }
    public static void main(String[] args) {
        int reizes;
        Scanner scan = new Scanner(System.in);
        System.out.println("Cik reizes mest kauliņu?");
        reizes = scan.nextInt();
        if (reizes > 0) {
            mestKaulinu(reizes);
        } else {
            System.out.println("Mēģinājumu skaitam jābūt lielākam par 0!");
        }
        scan.close();
    }
}