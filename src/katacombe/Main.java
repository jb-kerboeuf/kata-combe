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
        // init the possible drinks with their price
        Drink tea = new Drink("tea", 0.4);
        Drink coffee = new Drink("coffee", 0.6);
        Drink chocolate = new Drink("chocolate", 0.5);
        
        // test first iteration
        Instruction instruction1 = new Instruction(tea, 1);
        System.out.println(mapForDrinkMaker(instruction1));
        
        Instruction instruction2 = new Instruction(chocolate, 0);
        System.out.println(mapForDrinkMaker(instruction2));
        
        Instruction instruction3 = new Instruction(coffee, 2);
        System.out.println(mapForDrinkMaker(instruction3));
        
        Instruction instruction4 = new Instruction("test message");
        System.out.println(mapForDrinkMaker(instruction4));
        
        // test second iteration
        Instruction instruction5 = new Instruction(tea, 1, 0.5);
        System.out.println(mapForDrinkMaker(instruction5));
        
        Instruction instruction6 = new Instruction(chocolate, 0, 0.5);
        System.out.println(mapForDrinkMaker(instruction6));
        
        Instruction instruction7 = new Instruction(coffee, 2, 1);
        System.out.println(mapForDrinkMaker(instruction7));
    }
    
    public static String mapForDrinkMaker(Instruction in) {
        String drinkMakerString;
        
        if (in.message != null) {
            drinkMakerString = "M:" + in.message;
            return drinkMakerString;
        }
        
        double moneyDue = in.drink.price - in.providedMoney;
        if (moneyDue > 0) {
            drinkMakerString = String.format(
                    "M:The price is %s €, you have to add %s €",
                    in.drink.price,
                    moneyDue
            );
            return drinkMakerString;
        }
        
        switch (in.drink.name) {
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
