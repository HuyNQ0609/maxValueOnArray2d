import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int column, row;
        System.out.println("Enter columns number: ");
        column = input.nextInt();
        System.out.println("Enter rows number: ");
        row = input.nextInt();
        int[][] array = new int[column][row];
        System.out.println("Enter value of elements on array: ");
        int x = 0, y = 0;
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("Element [" + i + "][" + j + "] : ");
                array[i][j] = input.nextInt();
                if (max < array[i][j]) {
                    max = array[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("Array: " + Arrays.deepToString(array));
        System.out.println("Max value on Array: " + max);
        System.out.println("the position of the value in the array: [" + x + "][" + y + "]");
    }
}