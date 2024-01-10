package numberGenerator;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Example usage
        int randomNumber = generateRandomNumber(1, 100);
        System.out.println("Random Number: " + randomNumber);
    }

    // Method to generate a random number within a specified range
    public static int generateRandomNumber(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Max must be greater than min");
        }

        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

}
