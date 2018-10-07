package katacombe;

/**
 *
 * @author JB Kerboeuf
 */
public class Instruction {
    String message;
    Drink drink;
    int sugar;
    double providedMoney;

    public Instruction(Drink drink, int sugar) {
        this.drink = drink;
        this.sugar = sugar;
        this.providedMoney = 0;
    }
    
    public Instruction(Drink drink, int sugar, double providedMoney) {
        this.drink = drink;
        this.sugar = sugar;
        this.providedMoney = providedMoney;
    }
    
    public Instruction(String msg) {
        this.message = msg;
    }
}
