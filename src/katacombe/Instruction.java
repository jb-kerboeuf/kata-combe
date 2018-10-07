package katacombe;

/**
 *
 * @author JB Kerboeuf
 */
public class Instruction {
    String message;
    String drink;
    int sugar;

    public Instruction(String drink, int sugar) {
        this.drink = drink;
        this.sugar = sugar;
    }
    
    public Instruction(String msg) {
        this.message = msg;
    }
}
