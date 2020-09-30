import java.util.Scanner;
import static java.lang.System.out;

public class Maanden {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        int month;

        do {
            out.println("Kies een getal tussen 1 en 12:");
            month = keyboard.nextInt();
        } while (month > 12 | month <= 0) ;


        switch (month) {
            case 1:
                out.println("1 is de maand januari");
                break;
            case 2:
                out.println("2 is de maand februari");
                break;
            case 3:
                out.println("3 is de maand maart");
                break;
            case 4:
                out.println("4 is de maand april");
                break;
            case 5:
                out.println("5 is de maand mei");
                break;
            case 6:
                out.println("6 is de maand juni");
                break;
            case 7:
                out.println("7 is de maand juli");
                break;
            case 8:
                out.println("8 is de maand augustus");
                break;
            case 9:
                out.println("9 is de maand september");
                break;
            case 10:
                out.println("1 is de maand oktober");
                break;
            case 11:
                out.println("11 is de maand november");
                break;
            case 12:
                out.println("12 is de maand december");
                break;
        }
        keyboard.close();
    }
}
