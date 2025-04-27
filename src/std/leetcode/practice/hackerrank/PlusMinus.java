package std.leetcode.practice.hackerrank;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    /*

    Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.

    Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

    Example

    There are  elements, two positive, two negative and one zero. Their ratios are the Results and printed as:

            0.400000
            0.400000
            0.200000
    Function Description

    Complete the plusMinus function in the editor below.

    plusMinus has the following parameter(s):

    int arr[n]: an array of integers
    Print
    Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.

    Input Format

    The first line contains an integer, , the size of the array.
    The second line contains  space-separated integers that describe .

    Output Format

    Print the following  lines, each to  decimals:

    proportion of positive values
    proportion of negative values
    proportion of zeros
    Sample Input

    STDIN           Function
    -----           --------
    6               arr[] size n = 6
   -4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]

    Sample Output
        0.500000
        0.333333
        0.166667
    */

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-5);
        numbers.add(10);
        numbers.add(-2);
        numbers.add(7);
        numbers.add(0);
        plusMinusUsingForLoop(numbers);
        plusMinusUsingStreams(numbers);
    }

    // Using Traditional For Loop
    public static void plusMinusUsingForLoop(List<Integer> arr) {
        int positives = 0, negatives = 0, zeros = 0;
        int total = arr.size();

        for (int num : arr) {
            if (num > 0) positives++;
            else if (num < 0) negatives++;
            else zeros++;
        }

        DecimalFormat df = new DecimalFormat("0.00000"); // Corrected to 5 decimal places as per earlier requirement

        System.out.println(df.format((double) positives / total));
        System.out.println(df.format((double) negatives / total));
        System.out.println(df.format((double) zeros / total));
    }

    // Using Streams
    public static void plusMinusUsingStreams(List<Integer> arr) {
        int total = arr.size();

        long positives = arr.stream().filter(num -> num > 0).count();
        long negatives = arr.stream().filter(num -> num < 0).count();
        long zeros     = arr.stream().filter(num -> num == 0).count();

        DecimalFormat df = new DecimalFormat("0.00000"); // 5 decimal places

        System.out.println(df.format((double) positives / total));
        System.out.println(df.format((double) negatives / total));
        System.out.println(df.format((double) zeros / total));
    }
}
