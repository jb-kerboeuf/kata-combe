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
    boolean extraHot;

    public Instruction(Drink drink, int sugar) {
        this.drink = drink;
        this.sugar = sugar;
        this.providedMoney = 0;
        this.extraHot = false;
    }
    
    public Instruction(Drink drink, int sugar, double providedMoney) {
        this.drink = drink;
        this.sugar = sugar;
        this.providedMoney = providedMoney;
        this.extraHot = false;
    }
    
    public Instruction(Drink drink, int sugar, double providedMoney, boolean extraHot) {
        this.drink = drink;
        this.sugar = sugar;
        this.providedMoney = providedMoney;
        this.extraHot = extraHot;
    }
    
    public Instruction(String msg) {
        this.message = msg;
    }
}
