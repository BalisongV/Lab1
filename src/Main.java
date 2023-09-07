import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){

        // Task 5
        //Открыть командную строку
        //cd C:\'Program Files'\Java\jdk-20\bin\
        //>java C:\Users\Balisong\IdeaProjects\Lab1\src\Main.java dance dude dancing is fun

        for (int i = 0; i < args.length; i++){
            System.out.println("Argument"+i+": args["+i+"]="+args[i]);
        }


        Scanner in = new Scanner(System.in);

        System.out.print("Every array's length: ");
        int num = in.nextInt();

        System.out.print("Task 3\n");
        int sum1 = 0;
        //float mean = 0.0f;

        int[] array1 = new int[num];

        for (int i = 0; i < array1.length; i++){
            System.out.printf("Array element %d: ", i);
            array1[i] = in.nextInt();
            sum1 = sum1 + array1[i];
        }

        float mean = sum1 / (float) num;

        System.out.print("Your 1st array:\n");
        for (int j : array1) {
            System.out.println(j);
        }

        System.out.println(Arrays.toString(array1));
        System.out.printf("Sum: %d Mean: %.2f\n", sum1, mean);

        System.out.print("Task 4\n");
        int[] array2 = new int[num];
        int sum2 = 0, min2, max2;

        int cnt = 0;
        do{
            System.out.printf("Array element %d: ", cnt);
            array2[cnt] = in.nextInt();
            cnt++;
        }while(cnt < num);

        cnt = 0;

        System.out.print("Your 2nd array: ");
        System.out.println(Arrays.toString(array2));

        while(cnt < num){
            sum2 = array2[cnt] + sum2;
            cnt++;
        }

        max2 = Arrays.stream(array2)
                .max()
                .getAsInt();

        min2 = Arrays.stream(array2)
                .min()
                .getAsInt();

        System.out.printf("Sum: %d Max: %d Min: %d\n", sum2, max2, min2);

        // Task 6

        int series_num = 10;
        double result = 0.0;

        System.out.println("The harmonic series:");

        while (series_num > 0){
            result = result + (double) 1 / series_num;
            series_num--;
            System.out.print(result + "; ");
        }

        // Task 7

        System.out.print("\nFactorial: ");
        int factnum = in.nextInt();
        System.out.print(factorial(factnum));
        System.out.print("\n");
    }

    public static int factorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}