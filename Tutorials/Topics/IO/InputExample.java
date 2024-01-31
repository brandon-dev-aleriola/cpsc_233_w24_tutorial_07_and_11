package IO;

import java.util.ArrayList;
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean waitForInput = true;
         do {
            System.out.print("Enter \"fuel\" or \"exit\":");
            String input = scanner.nextLine();
            switch(input){
                case "":
                    System.out.println("Yay you pressed the enter key");
                    break;
                case "fuel":
                    System.out.println(input);
                    System.out.print("Enter liters:");
                    String liters = scanner.next();
                    list.add(liters);
                    System.out.print("Enter mileage:");
                    String mileage = scanner.next();
                    list.add(mileage);
                    break;
                case "exit":
                    waitForInput = false;
                    System.out.println("Exited: Goodbye");
                    break;
                default:
                    System.out.println("Invalid input: " + input);
                  break;
            }
        } while(waitForInput);

            System.out.println("Items in list:");
        list.forEach(System.out::println);
    }
}
