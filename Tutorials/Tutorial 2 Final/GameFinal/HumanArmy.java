package GameFinal;
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
            humanArmy[i] = new Human(humanClass, generativeInitative());
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

    public Undead[] getAliveTargets(){
        int count = 0; // get a count of enemies still alive
        for (Undead target : targetList){
            if (target.alive) count++; //update count if enemy is alive
        }
        Undead[] aliveTargets = new Undead[count]; // make a list of only alive enemies to attack
        int newCount = 0; // make a counter to access the correct index of the alive list
        for (Undead target : targetList){
            if (target.alive) {
                aliveTargets[newCount] = target; // assign alive enemy
                newCount++;
            }
        }
        return aliveTargets;
    }

    public void armyAttack(int initative){
        this.getTargets();
        for (Human human: humanArmy){
            if (human.alive && human.initative == initative) {
                Undead[] aliveTargets = this.getAliveTargets();
                int max= aliveTargets.length;
                int min = 1;
                int randomTarget = (int) (Math.random() * (max - min + 1) + min);
                randomTarget--; // set to a valid array index
                Undead target;
                if (aliveTargets.length > 0) { // don't try to index into empty array
                    target = aliveTargets[randomTarget];
                    human.attack(target);
                    System.out.println("event: " + human.humanClassType + " attacked " + target.undeadClassType + " for " + human.damage + " damage");
                }
            }
        }
    }

    public int generativeInitative(){
        int max = 20;
        int min = 1;
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
