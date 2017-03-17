import java.util.Scanner;

/**
 * Created by Artur on 2017-03-17.
 */
public class MMEngine {
    public static void main(String[] args) {

        final int[] secretCode = {1, 2, 3, 4};


        System.out.println("Podaj 4 cyfry z 1,2,3,4,5,6");

        Scanner enterYourCode01 = new Scanner(System.in);
        int yourCode01 = enterYourCode01.nextInt();

        Scanner enterYourCode02 = new Scanner(System.in);
        int yourCode02 = enterYourCode02.nextInt();

        Scanner enterYourCode03 = new Scanner(System.in);
        int yourCode03 = enterYourCode03.nextInt();

        Scanner enterYourCode04 = new Scanner(System.in);
        int yourCode04 = enterYourCode04.nextInt();

        int[] yourCode = {yourCode01, yourCode02, yourCode03, yourCode04};
        for (int i = 0; i < yourCode.length; i++) {
            int yourNewCode = yourCode[i];
            System.out.print(yourNewCode);

            if (yourCode01 == secretCode[0]) {
                System.out.print("1");
            } else if (yourCode01 == secretCode[1] | yourCode01 == secretCode[2] | yourCode01 == secretCode[3]) {
                System.out.print("0");
            }

            if (yourCode02 == secretCode[1]) {
                System.out.print("1");
            } else if (yourCode02 == secretCode[0] | yourCode02 == secretCode[2] | yourCode02 == secretCode[3]) {
                System.out.print("0");
            }

            if (yourCode03 == secretCode[2]) {
                System.out.print("1");
            } else if (yourCode03 == secretCode[0] | yourCode03 == secretCode[1] | yourCode03 == secretCode[3]) {
                System.out.print("0");
            }

            if (yourCode04 == secretCode[3]) {
                System.out.print("1");
            } else if (yourCode04 == secretCode[0] | yourCode04 == secretCode[1] | yourCode04 == secretCode[2]) {
                System.out.print("0");
            }
        }
    }
}

