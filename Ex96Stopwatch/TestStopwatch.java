package be.vdab.Ex96Stopwatch;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class TestStopwatch {
    public static void main(String[] args) {

        // Create array of random 100,000 numbers to be sorted
        int[] array = new int[100000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        // Create stopwatch and measure execution time selection sort
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        selectionSort(array);
        stopwatch.stop();
        double elapsedTime = stopwatch.getElapsedTime();

        // Print results
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("The execution time of sorting 100,000 numbers using selection sort is " + df.format(elapsedTime/1000) + "s");
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}

