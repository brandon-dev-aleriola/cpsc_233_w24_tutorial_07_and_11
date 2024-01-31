package Game;
import static Game.HumanArmy.*;

public class Human {
    public String humanClassType;
    private int hitpoints;
    public int damage;
    public boolean alive = true;
    // create a new class member variables as well as set that variable in the constructor and assign it in the switch statement for each class
    public Human(char humanClass) {
        switch(humanClass) {
            case 'R':
                this.damage = 3;
                this.hitpoints = 14;
                this.humanClassType = "Human Ranger";
                break;
            case 'W':
                this.damage = 5;
                this.hitpoints = 10;
                this.humanClassType = "Human Wizard";
                break;
            case 'A':
                this.damage = 7;
                this.hitpoints = 16;
                this.humanClassType = "Human Archer";
                break;
            case 'B':
                this.damage = 1;
                this.hitpoints = 10;
                this.humanClassType = "Human Barbarian";
                break;
            case 'M':
                this.damage = 6;
                this.hitpoints = 24;
                this.humanClassType = "Human Mage";
                break;
            case 'C':
                this.damage = 8;
                this.hitpoints = 8;
                this.humanClassType = "Human Captin";
                break;
        }
    }
    private void setHitpoints(int hitpoints){
        this.hitpoints = hitpoints;
    }
    public int getHitpoints(){
        return this.hitpoints;
    }

    public void takeDamage(int damage){
        this.setHitpoints(this.getHitpoints() - damage);
        if (this.getHitpoints() < 0) {
            casualties++;
            alive = false;
        }
    }

    public void attack(Undead target){
        target.takeDamage(this.damage);
    }
}
