import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> letterList = new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Add 4 random letters
        for (int i = 0; i < 4; i++) {
            char randomLetter = (char) ('a' + random.nextInt(26)); // letters from a-z
            letterList.add(String.valueOf(randomLetter));
        }

        System.out.println("Initial list: " + letterList);

        // User inputs 4 letters
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter letter " + (i+1) + ": ");
            String inputLetter = scanner.nextLine().toLowerCase();

            if (letterList.contains(inputLetter)) {
                // If found, replace with "found"
                int index = letterList.indexOf(inputLetter);
                letterList.set(index, "found");
                System.out.println("Letter found! List updated.");
            } else {
                // If not found, add to the list
                letterList.add(inputLetter);
                System.out.println("Letter not in list, added.");
            }
            System.out.println("Current list: " + letterList);
        }

        // Final list
        System.out.println("Final list: " + letterList);
    }
}