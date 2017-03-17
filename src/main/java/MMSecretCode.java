/**
 * Created by Artur on 2017-03-17.
 */
public class MMSecretCode {
    // Wybór 4 elementowego kodu ze zbioru 6 kolorów R,G,B,Y,P,O

    String[][] secretCode = {{"R"}, {"G"}, {"B"}, {"Y"}};

    public static void secretCodeCheck() {
        String[][] secretCode = {{"R"}, {"G"}, {"B"}, {"Y"}};

        for (int i = 0; i < secretCode.length; i++) {
            for (int j = 0; j < secretCode[i].length; j++) {
                String secretCodePass = secretCode[i][j];
                System.out.print(secretCodePass);
            }
        }
    }
}
