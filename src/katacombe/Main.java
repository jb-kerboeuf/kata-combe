package katacombe;

/**
 *
 * @author JB Kerboeuf
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    
    public static String mapForDrinkMaker(Instruction in) {
        String drinkMakerString;
        
        if (in.message != null) {
            drinkMakerString = "M:" + in.message;
            return drinkMakerString;
        }
        
        switch (in.drink) {
            case "tea": drinkMakerString = "T";
                break;
            case "chocolate": drinkMakerString = "H";
                break;
            case "coffee": drinkMakerString = "C";
                break;
            default: drinkMakerString = "M:Error";
        }
        switch (in.sugar) {
            case 0: drinkMakerString += "::";
                break;
            case 1: drinkMakerString += ":1:0";
                break;
            case 2: drinkMakerString += ":2:0";
                break;
            default: drinkMakerString = "M:Error";
        }
        
        return drinkMakerString;
    }
}
