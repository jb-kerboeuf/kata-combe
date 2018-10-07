package katacombe;

/**
 *
 * @author JB Kerboeuf
 */
public class Instruction {
    String message;
    Drink drink;
    int sugar;

    public Instruction(Drink drink, int sugar) {
        this.drink = drink;
        this.sugar = sugar;
    }
    
    public Instruction(String msg) {
        this.message = msg;
    }
}
