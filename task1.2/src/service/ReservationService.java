package service;

import model.Month;

import java.util.Scanner;

public class ReservationService {
    public static void makeReservation() {
        Scanner sc = new Scanner(System.in);

        Month month;
        String inputMonth = null;
        int day = 0;
        boolean success = false;

        while (!success) {
            System.out.println("Ay adını daxil edin: ");
            inputMonth = sc.nextLine().toUpperCase();


            try {
                month = Month.valueOf(inputMonth);
            } catch (IllegalArgumentException e) {
                System.err.println("Ayı düzgün daxil edin!");
                sc.nextLine();
                continue;
            }
            System.out.println("Günü daxil edin: ");
            day = sc.nextInt();

            switch (month) {
                case YANVAR, MART, MAY, IYUL, AVQUST, OKTYABR, DEKABR -> {
                    if (day >= 1 && day <= month.getDays()) {
                        success = true;
                    } else {
                        System.err.println("Günü düzgün daxil edin!");
                    }
                }
                case FEVRAL -> {
                    if (day >= 1 && day <= month.getDays()) {
                        success = true;
                    } else {
                        System.err.println("Fevral ayında maksimum 29 gün ola bilər!");
                    }
                }
                case IYUN, APREL, NOYABR, SENTYABR -> {
                    if (day >= 1 && day <= 30) { //getDays methodu ilə qeyd edəndə, birləşdirmə istəyirdi.
                        success = true;
                    } else {
                        System.err.println("Günü düzgün daxil edin!");
                    }
                }
            }
        }
        System.out.println(inputMonth.toLowerCase() + " " + day + " tarixi uğurla rezerv edildi!");
    }
}
