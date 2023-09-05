import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Array length: ");
        int num = in.nextInt();
        int sum = 0;
        //float mean = 0.0f;

        int[] array = new int[num];

        for (int i = 0; i < array.length; i++){
            System.out.printf("Array element %d: ", i);
            array[i] = in.nextInt();
            sum = sum + array[i];
        }

        float mean = sum / (float) num;

        System.out.print("Your array:\n");
        for (int j : array) {
            System.out.println(j);
        }

        System.out.println(Arrays.toString(array));
        System.out.printf("Sum: %d\nMean: %.2f\n", sum, mean);
}}