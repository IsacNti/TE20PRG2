import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class terapi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hur mår du");
        String l = scanner.nextLine();
        Random rand = new Random();
        String[] animals = {"Ok", "Mhm", "Yeah", "Alright"}; // array of animals
        String a = null;
        String b = ("klar");
        for (int i = 0; i < 10; i++) {
            if (b.equals(a)) {
                break;
            }
            else{
                System.out.println(animals[rand.nextInt(animals.length)]);
                System.out.println("När du är nöjd för idag skriv 'klar'");
                a = scanner.nextLine();
                l = l + a;

            }
        }
    }
}
