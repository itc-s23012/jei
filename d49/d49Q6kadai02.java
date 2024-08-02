// s23012
// 引数を奇数前提で中央値を求めるプログラムを追加

import java.util.Arrays;

public class d49Q6kadai02 {
    public static void main(String[] args) {
        // Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Usage: java d49Q6kadai02 <numbers>");
            return;
        }
        
        // Parse input numbers
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        
        // Calculate average
        double average = calculateAverage(numbers);
        
        // Calculate range
        int range = calculateRange(numbers);
        
        // Count numbers greater and less than average
        int greaterThanAverageCount = countGreaterThanAverage(numbers, average);
        int lessThanAverageCount = numbers.length - greaterThanAverageCount;
        
        // Sort numbers to find median
        Arrays.sort(numbers);
        
        // Calculate median
        double median = calculateMedian(numbers);
        
        // Output results
        System.out.printf("平均値：%.1f%n", average);
        System.out.println("値の範囲：" + range);
        System.out.printf("平均より大きい値の個数：%d 平均より小さい値の個数：%d%n", greaterThanAverageCount, lessThanAverageCount);
        System.out.printf("中央値：%d%n", (int) median);
    }
    
    // Method to calculate average
    private static double calculateAverage(int[] numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
    
    // Method to calculate range
    private static int calculateRange(int[] numbers) {
        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();
        return max - min;
    }
    
    // Method to count numbers greater than average
    private static int countGreaterThanAverage(int[] numbers, double average) {
        int count = 0;
        for (int num : numbers) {
            if (num > average) {
                count++;
            }
        }
        return count;
    }
    
    // Method to calculate median
    private static double calculateMedian(int[] numbers) {
        int middle = numbers.length / 2;
        if (numbers.length % 2 == 1) {
            return numbers[middle];
        } else {
            return (numbers[middle - 1] + numbers[middle]) / 2.0;
        }
    }
}
