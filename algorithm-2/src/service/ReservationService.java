package service;

import model.Month;

import java.util.Scanner;

public class ReservationService {
    public static Scanner sc = new Scanner(System.in);

    public static Month month;
    public static String inputMonth = null;
    public static int day = 0;
    public static boolean success = false;
    public static void makeReservation() {


        while (!success) {
            System.out.println("Ay adını daxil edin: ");
            inputMonth = sc.next().toUpperCase();
            try {
                month = Month.valueOf(inputMonth);
            } catch (IllegalArgumentException e) {
                System.out.println("Ay adını düzgün daxil edin!");
                success = true;
            }

            if (success) {
                success = false;
                continue;
            }


            System.out.println("Günü daxil edin: ");
            day = sc.nextInt();

            switch (month) {
                case YANVAR, MART, MAY, IYUL, AVQUST, OKTYABR, DEKABR -> {
                    if (day >= 1 && day <= month.getDays()) {
                        success = true;
                    } else {
                        System.out.println("Günü düzgün daxil edin!");
                    }
                }
                case FEVRAL -> {
                    if (day >= 1 && day <= month.getDays()) {
                        success = true;
                    } else {
                        System.out.println("Fevral ayında maksimum 29 gün ola bilər!");
                    }
                }
                case IYUN, APREL, NOYABR, SENTYABR -> {
                    if (day >= 1 && day <= 30) { //getDays methodu ilə qeyd edəndə, birləşdirmə istəyirdi.
                        success = true;
                    } else {
                        System.out.println("Günü düzgün daxil edin!");
                    }
                }
            }
        }
        System.out.println(inputMonth.toLowerCase() + " " + day + " tarixi uğurla rezerv edildi!");
    }
}
