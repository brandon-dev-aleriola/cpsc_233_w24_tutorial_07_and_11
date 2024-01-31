package Game;

public class HumanArmy {
    public Undead[] targetList;
    public UndeadArmy enemy;

    private final Human[] humanArmy = new Human[12];
    public static int casualties = 0;

    public HumanArmy() {
        String armyString = "RRWWAABBMMCC";
        createArmy(armyString);
    }

    private void createArmy(String army) {
        for(int i=0; i < army.length(); i++){
            char humanClass = army.charAt(i);
            humanArmy[i] = new Human(humanClass); // use your generativeInitatives function as part of creating the new unit
        }
    }

    public Human[] getArmy(){
        return this.humanArmy;
    }
    public void setEnemy(UndeadArmy enemy){
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
