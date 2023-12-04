package se.lexicon;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.findname("James"));
        System.out.println(app.findname("goran"));

        Iteration iteration = new Iteration();
        iteration.numbers[0][0] = 3;
        //System.out.println(Arrays.toString(iteration.numbers));

        for (int[] array : iteration.numbers) {
            int index = 0;
            for (int number : array) {
                System.out.println(number);
                if (index == array.length -1) {
                    System.out.println();
                }
                index++;
            }
        }

        int[] numbers2 = {1,2,3,3,4,4,4,5,6};
        int indexFound = Arrays.binarySearch(numbers2, 4);
        int indexNotFound = Arrays.binarySearch(numbers2, 63);
        System.out.println(indexFound);
        System.out.println(indexNotFound);
    }
}