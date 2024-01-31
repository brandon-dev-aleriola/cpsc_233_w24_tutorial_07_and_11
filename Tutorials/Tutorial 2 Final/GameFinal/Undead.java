package GameFinal;
import static GameFinal.UndeadArmy.*;

public class Undead {
    public String undeadClassType;
    private int hitpoints;
    public int damage;
    public boolean alive = true;
    public int initative;
    public Undead(char undeadClass, int initative) {
        switch(undeadClass) {
            case 'R':
                this.damage = 3;
                this.hitpoints = 14;
                this.undeadClassType = "Undead Ranger";
                this.initative = initative;
                break;
            case 'W':
                this.damage = 5;
                this.hitpoints = 10;
                this.undeadClassType = "Undead Wizard";
                this.initative = initative;
                break;
            case 'A':
                this.damage = 7;
                this.hitpoints = 16;
                this.undeadClassType = "Undead Archer";
                this.initative = initative;
                break;
            case 'B':
                this.damage = 1;
                this.hitpoints = 10;
                this.undeadClassType = "Undead Barbarian";
                this.initative = initative;
                break;
            case 'M':
                this.damage = 6;
                this.hitpoints = 24;
                this.undeadClassType = "Undead Mage";
                this.initative = initative;
                break;
            case 'C':
                this.damage = 8;
                this.hitpoints = 8;
                this.undeadClassType = "Undead Captin";
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

    public void attack(Human target){
        target.takeDamage(this.damage);
    }
}
