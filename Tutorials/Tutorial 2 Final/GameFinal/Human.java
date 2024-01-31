package GameFinal;
import static GameFinal.HumanArmy.*;

public class Human {
    public String humanClassType;
    private int hitpoints;
    public int damage;
    public boolean alive = true;
    public int initative;
    public Human(char humanClass,int initative) {
        switch(humanClass) {
            case 'R':
                this.damage = 3;
                this.hitpoints = 14;
                this.humanClassType = "Human Ranger";
                this.initative = initative;
                break;
            case 'W':
                this.damage = 5;
                this.hitpoints = 10;
                this.humanClassType = "Human Wizard";
                this.initative = initative;
                break;
            case 'A':
                this.damage = 7;
                this.hitpoints = 16;
                this.humanClassType = "Human Archer";
                this.initative = initative;
                break;
            case 'B':
                this.damage = 1;
                this.hitpoints = 10;
                this.humanClassType = "Human Barbarian";
                this.initative = initative;
                break;
            case 'M':
                this.damage = 6;
                this.hitpoints = 24;
                this.humanClassType = "Human Mage";
                this.initative = initative;
                break;
            case 'C':
                this.damage = 8;
                this.hitpoints = 8;
                this.humanClassType = "Human Captin";
                this.initative = initative;
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
