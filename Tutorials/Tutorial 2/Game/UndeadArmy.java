package Game;
public class UndeadArmy {
    public Human[] targetList;
    public HumanArmy enemy;

    private final Undead[] undeadArmy = new Undead[12];
    public static int casualties = 0;

    public UndeadArmy() {
        String armyString = "RRWWAABBMMCC";
        createArmy(armyString);
    }

    private void createArmy(String army) {
        for(int i=0; i < army.length(); i++){
            char undeadClass = army.charAt(i);
            undeadArmy[i] = new Undead(undeadClass);  // use your generativeInitatives function as part of creating the new unit
        }
    }

    public Undead[] getArmy(){
        return this.undeadArmy;
    }
    public void setEnemy(HumanArmy enemy){
        this.enemy = enemy;
    }

    public void getTargets(){
        targetList = enemy.getArmy();
    }

    public void armyAttack(int initative){
        this.getTargets();
        // for each unit with this initative,
        // if the unit is alive,
        // if the unit can attack, generate a list of alive enemy units for the unit to attack
        // generate a random number from zero to the length of the alive list and, with than number that attack the random target from the alive List
    }

    public void generativeInitatives(){
        /*
        write a new math function to generate an initiative return a random int between 1 and 20
        for each unit in the army add a new variable for initative
        use the new random function and assign that value for initative
                 */
    }
}
