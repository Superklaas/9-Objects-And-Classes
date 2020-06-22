package be.vdab.Ex96Stopwatch;

import java.util.Date;
import java.util.Random;

// Ik krijg als resultaat 0s en vraag me af waar de fout zit.

public class TestStopwatch {
    public static void main(String[] args) {

        // Create array of random 100,000 numbers to be sorted
        int[] array = new int[100000];
        Random random = new Random();
        for (int i : array) {
            array[i] = random.nextInt();
        }

        // Create stopwatch and measure execution time selection sort
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        selectionSort(array);
        stopwatch.stop();
        long elapsedTime = stopwatch.getElapsedTime();
        System.out.println("The execution time of sorting 100,000 numbers using selection sort is " + elapsedTime);
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

