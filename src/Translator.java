import java.util.HashMap;

public class Translator {

    HashMap<Integer, String> numericAlpha = new HashMap<>();

    // maak een constructor
    public Translator(Integer[] numeric, String [] alphabetic){
        for (int i = 0; i <numeric.length ; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    // public methode die een string terug geeft, met de naam translate en parameter: integer number
    // je maakt een string result en uit de hasmap haal je de string die correspondeert met de nummer van de key
    // met een kleine letter omdat het een methode is
    public String translate (Integer number){
        String result = numericAlpha.get(number);
        return result;
    }

    // verkorte versie van schrijven:
/*    public String Translate (Integer number){
        return numericAlpha.get(number);
    }*/
}
