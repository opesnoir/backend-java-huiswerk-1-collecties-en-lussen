import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        // maak een arrayList type [] naam = {array inhoud}
        Integer [] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String [] alphabetic = { "een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        Translator translator = new Translator(numeric, alphabetic);

        boolean play = true;
        /*String ongeldig = "ongeldige invoer";*/
        Scanner scanner = new Scanner(System.in);

        // zegt while (play) zegt (play == true)
        while (play) {

            System.out.println("type x om te stoppen");
            System.out.println("type v om te vertalen");
            String input = scanner.nextLine();

            //syntax voor strings - gebruik input.equalsIgnoreCase() om hoofdlettergevoeligheid uit te zetten:
            /*if (input.equalsIgnoreCase(input, "x"))*/
            if (Objects.equals(input, "x")){
               play = false;
            }
            else if (Objects.equals(input, "v")){
                // hij blijft true, hier wil je vragen of iemand een cijfer invoert
                System.out.println("voer een cijfer in van 0 t/m 9");
                // integer of int om het cijfer dat is ingevoerd op te halen
                int inputGrade = scanner.nextInt();
                scanner.nextLine();

                //geneste if statement
                if (inputGrade < 10) {
                    //methode Translate ophalen
                    String result = translator.translate(inputGrade);
                    System.out.println(result);
                } else {
                    System.out.println("Voer een cijfer tussen de 0 en 9 in");
                }
            } else {
                System.out.println("Ongeldige invoer, voer een x of v in");
            }
        }
    }
}
