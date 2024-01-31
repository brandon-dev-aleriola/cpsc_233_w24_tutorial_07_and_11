package Game;

public class GameEngine {
    public static void main(String[] args) {
        boolean winCondition = false;
        HumanArmy human = new HumanArmy();
        UndeadArmy undead = new UndeadArmy();
        human.setEnemy(undead);
        undead.setEnemy(human);

        while(!winCondition){
            // write a new function "round" that will loop through attack initatives from 20 to 1
            // each loop iteration should pass the current itative to both armies so units with that initaive can attack
            // the new round function should be called each game loop
            human.armyAttack(0); // use this function in your loop
            undead.armyAttack(0); // use this function in your loop
            if (HumanArmy.casualties == 12) winCondition = true;
            if (UndeadArmy.casualties == 12) winCondition = true;
            // print the result of the game if the win condition is met
        }
    }
}