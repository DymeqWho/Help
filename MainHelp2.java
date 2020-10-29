//write a java program that prompts the user to enter 10 elements to an array of integers and display any sequence of numbers occurring within the array.
//Example:
//The input: 1, 2, 3, 6, 8, 3, 9, 10, 11, 12
//The output: 1, 2, 3, 9, 10, 11, 12

import java.util.*;

public class MainHelp2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> inputList = new TreeMap();
        int numberOfInputs = 10;
        int i;
        for (i = 0; i < numberOfInputs; i++) {
            System.out.print("Put number: ");
            inputList.put(i, scanner.nextInt());
        }
        System.out.println("Input = " + inputList.values().toString());
        
        for (i = 0; i < numberOfInputs; i++) {
            inputList.remove(i, 6);
            inputList.remove(i, 8);
        }

        Set<Integer> set = new TreeSet<>();
        set.addAll(inputList.values());
        System.out.println("Output = " + set.toString());
    }
}
