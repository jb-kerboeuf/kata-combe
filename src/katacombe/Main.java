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
        Drink orange = new Drink("orange juice", 0.6);
        
        // test first iteration
        System.out.println("test first iteration");
        
        Instruction instruction1 = new Instruction(tea, 1);
        System.out.println(mapForDrinkMaker(instruction1));
        
        Instruction instruction2 = new Instruction(chocolate, 0);
        System.out.println(mapForDrinkMaker(instruction2));
        
        Instruction instruction3 = new Instruction(coffee, 2);
        System.out.println(mapForDrinkMaker(instruction3));
        
        Instruction instruction4 = new Instruction("test message");
        System.out.println(mapForDrinkMaker(instruction4));
        
        // test second iteration
        System.out.println("\ntest second iteration");
        
        Instruction instruction5 = new Instruction(tea, 1, 0.5);
        System.out.println(mapForDrinkMaker(instruction5));
        
        Instruction instruction6 = new Instruction(chocolate, 0, 0.5);
        System.out.println(mapForDrinkMaker(instruction6));
        
        Instruction instruction7 = new Instruction(coffee, 2, 1);
        System.out.println(mapForDrinkMaker(instruction7));
        
        // test third iteration
        System.out.println("\ntest third iteration");
        
        Instruction instruction8 = new Instruction(orange, 0, 0.6);
        System.out.println(mapForDrinkMaker(instruction8));
    
        Instruction instruction9 = new Instruction(coffee, 0, 0.6, true);
        System.out.println(mapForDrinkMaker(instruction9));
        
        Instruction instruction10 = new Instruction(chocolate, 1, 0.6, true);
        System.out.println(mapForDrinkMaker(instruction10));
        
        Instruction instruction11 = new Instruction(tea, 2, 0.6, true);
        System.out.println(mapForDrinkMaker(instruction11));
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
            case "orange juice": drinkMakerString = "O";
                break;
            default: return "M:Error";
        }
        
        if (in.extraHot) {
            drinkMakerString += "h";
        }
        
        switch (in.sugar) {
            case 0: drinkMakerString += "::";
                break;
            case 1: drinkMakerString += ":1:0";
                break;
            case 2: drinkMakerString += ":2:0";
                break;
            default: return "M:Error";
        }
        
        return drinkMakerString;
    }
}
