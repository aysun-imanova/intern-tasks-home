package model;

import java.util.Scanner;

public class Student {
    private String name;
    private String surname;
    private int avgPoint;

    Scanner scanner = new Scanner(System.in);

    public Student() {
    }

    public Student(Scanner scanner) {
        System.out.println("Tələbənin adını daxil edin: ");
        this.name = scanner.nextLine();

        System.out.println("Tələbənin soyadını daxil edin: ");
        this.surname = scanner.nextLine();

        System.out.println("Tələbənin ortalamasını daxil edin: ");
        this.avgPoint = scanner.nextInt();
        setAvgPoint(avgPoint);
    }


    public String getName() {
        return name;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(int avgPoint) {
        if(avgPoint >= 0 && avgPoint <= 100){
            this.avgPoint = avgPoint;
        } else {
            System.out.println("AvgPoint 0-100 aralığında olmalıdır!\n");
        } new Student(scanner);
    }
}
