//write a java program that prompts the user to enter 10 elements to an array of integers and display any sequence of numbers occurring within the array.
//Example:
//The input: 1, 2, 3, 6, 8, 3, 9, 10, 11, 12
//The output: 1, 2, 3, 9, 10, 11, 12

import java.util.Arrays;
import java.util.Scanner;

public class MainHelp {
    public static void main(String[] args) {

        int[] inputArry = new int[10];
        int[] inputArry1 = {1,2, 3, 6, 8, 3, 9, 10, 11, 12};


        Scanner scanner = new Scanner(System.in);

       for (int i = 0; i < inputArry.length; i++) {
            System.out.print("Put number: ");
            inputArry[i] = scanner.nextInt();
        }

        System.out.println("input arry: " + Arrays.toString(inputArry));

        int[] middleArry = new int[10];

        for (int i = 0; i < inputArry.length; i++) {

            if (inputArry[i] != 6 && inputArry[i] != 8) {
                for (int j = 0; j < inputArry.length; j++) {
                    if (inputArry[i] == middleArry[j]) {
                        inputArry[i] = 0;
                    }
                }
                middleArry[i] = inputArry[i];
            }
        }
    /*    System.out.println("middle arry: " + Arrays.toString(middleArry));

    /*    int numberOfZero = 0;
        for (int i = 0; i < middleArry.length; i++) {
            if (middleArry[i] == 0) {
                numberOfZero++;

            }
        }

        System.out.println("numberOfZero = " + numberOfZero);

        int[] outputArry = new int[middleArry.length - numberOfZero];*/

        int middleArryLength = middleArry.length;
        String coma = ", ";
        System.out.print("Output view: ");
        for (int i = 0; i < middleArry.length; i++) {
            if (middleArry.length - i == 1) {
                coma = "";}
            if (middleArry[i] != 0) {
                    System.out.print(middleArry[i] + coma);
                }

            }
        }

    }



