package learnarrays;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program
{
    public static void main(String[] args)
            throws FileNotFoundException
    {
        ArrayList<Integer> nums = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (line.length() > 0) {
            nums.add(
                Integer.parseInt(line)
            );

            line = scanner.nextLine();
        }

        int size = nums.size();
        int[] values = new int[size];
        for (int i=0; i < size; i++) {
            values[i] = nums.get(i);
        }

        Arrays.sort(values);

        System.out.println("the length of the array is: " + size);
        System.out.println("the largest value is: " + values[size-1]);
        System.out.println("the second largest value is " + values[size-2]);
        System.out.println("the third largest value is " + values[size-3]);
    }
}
