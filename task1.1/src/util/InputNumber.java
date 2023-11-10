package util;

import java.util.Scanner;

public class InputNumber {
    public static int readNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ədədi daxil edin: ");
        return sc.nextInt();
    }
}

