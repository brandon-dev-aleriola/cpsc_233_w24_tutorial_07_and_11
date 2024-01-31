package GameFinal;

public class GameEngine {
    static void round(HumanArmy human, UndeadArmy undead) {
        System.out.println("event: **** Start of Round ****" );
        for (int i = 20; i > 0; i--) {
            human.armyAttack(i);
            undead.armyAttack(i);
        }
        System.out.println("event: **** End of Round ****" );
    }

    public static void main(String[] args) {
        boolean winCondition = false;
        HumanArmy human = new HumanArmy();
        UndeadArmy undead = new UndeadArmy();
        human.setEnemy(undead);
        undead.setEnemy(human);

        while(!winCondition){
            if (HumanArmy.casualties == 12) winCondition = true;
            if (UndeadArmy.casualties == 12) winCondition = true;
            round(human, undead);
            if (winCondition) {
                System.out.print("Game Over");
            }
        }
    }
}