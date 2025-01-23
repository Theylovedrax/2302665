import java.util.Arrays;

public class MEAN {

    public static void main(String[] args) {
        // Sample array
        double[] data = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};

        // Calculate and print the mean
        calculateMean(data);

        // Calculate and print the median
        calculateMedian(data);

        // Calculate and print the standard deviation
        calculateStandardDeviation(data);
    }

    // Method to calculate the mean (without return)
    public static void calculateMean(double[] data) {
        double sum = 0;
        for (double num : data) {
            sum += num;
        }
        double mean = sum / data.length;
        System.out.println("Mean: " + mean);
    }

    // Method to calculate the median (without return)
    public static void calculateMedian(double[] data) {
        Arrays.sort(data);
        int n = data.length;
        double median;
        if (n % 2 == 1) {
            median = data[n / 2]; // Return middle element for odd length
        } else {
            median = (data[(n / 2) - 1] + data[n / 2]) / 2.0; // Average of two middle elements for even length
        }
        System.out.println("Median: " + median);
    }

    // Method to calculate the standard deviation (without return)
    public static void calculateStandardDeviation(double[] data) {
        double sumSquaredDifferences = 0;
        double mean = 0;
        for (double num : data) {
            mean += num;
        }
        mean /= data.length;

        for (double num : data) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }
        double stdDev = Math.sqrt(sumSquaredDifferences / data.length); // Population standard deviation
        System.out.println("Standard Deviation: " + stdDev);
    }
}
