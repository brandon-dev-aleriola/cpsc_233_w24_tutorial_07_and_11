package GameFinal;
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
            undeadArmy[i] = new Undead(undeadClass, generativeInitative());
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

    public Human[] getAliveTargets(){
        int count = 0; // get a count of enemies still alive
        for (Human target : targetList){
            if (target.alive) count++; //update count if enemy is alive
        }
        Human[] aliveTargets = new Human[count]; // make a list of only alive enemies to attack
        int newCount = 0; // make a counter to access the correct index of the alive list
        for (Human target : targetList){
            if (target.alive) {
                aliveTargets[newCount] = target; // assign alive enemy
                newCount++;
            }
        }
        return aliveTargets;
    }

    public void armyAttack(int initative){
        this.getTargets();
        for (Undead undead: undeadArmy){
            if (undead.alive && undead.initative == initative) {
                Human[] aliveTargets = this.getAliveTargets();
                int max = aliveTargets.length;
                int min = 1;
                int randomTarget = (int) (Math.random() * (max - min + 1) + min);
                randomTarget--; // set to a valid array index
                Human target;
                if (aliveTargets.length > 0) { // don't try to index into empty array
                    target = aliveTargets[randomTarget];
                    undead.attack(target);
                    System.out.println("event: " + undead.undeadClassType + " attacked " + target.humanClassType + " for " + undead.damage + " damage");
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
