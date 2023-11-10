package logic;

import util.InputNumber;

public class CalculateDigits {
    public static void calculateLargestDigit() {

        int number = InputNumber.readNumber();

        int largestDigit = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            number = number / 10;
        }
        System.out.println("Daxil edilən ədədin ən böyük rəqəmi bərabərdir: " + largestDigit);
    }
}
