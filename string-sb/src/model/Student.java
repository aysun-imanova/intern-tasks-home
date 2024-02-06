package model;

public class Student {
    private String name;
    private String surname;
    private int avgPoint;

    public Student(String name, String surname, int avgPoint) {
        this.name = name;
        this.surname = surname;
        setAvgPoint(avgPoint);
    }

    public String getFullName() {
        return name + " " + surname;
    }
    public String getName() {
        return name;
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
        }
    }
}
