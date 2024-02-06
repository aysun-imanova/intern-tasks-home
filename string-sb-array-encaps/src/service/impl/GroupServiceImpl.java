package service.impl;

import model.Student;
import service.IGroupService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupServiceImpl implements IGroupService {
    Scanner input = new Scanner(System.in);

    @Override
    public void addStudent(Student student) {

        System.out.println("Tələbə adını daxil edin: ");
        String name = input.nextLine();
//        new Student(student.getName(name));

        System.out.println("Tələbə soyadını daxil edin: ");
        String surname = input.nextLine();

        System.out.println("Qrup nömrəsini daxil edin: ");
        String groupNo = input.nextLine();




    }

    @Override
    public Student[] filterByName(String filter) {

        List<Student> filteredStudents = new ArrayList<>();

//        for(Student student : students)
        return filteredStudents.toArray(new Student[0]);
    }

    @Override
    public String validateNo(Scanner scanner) {
        System.out.println("Qrup nömrəsini daxil edin: ");
        String groupNo = scanner.nextLine();
        if (groupNo.matches("^[A-Z]{2}\\d{3}$")) {
            return groupNo;
        } else {
            throw new IllegalArgumentException("Daxil edilən qrup nömrəsi uyğun deyil! Nümunə: 'AA123'");
        }
    }

    @Override
    public int validateStudentLimit(int studentLimit) {
        if (studentLimit >= 5 && studentLimit <= 18) {
            return studentLimit;
        } else {
            throw new IllegalArgumentException("Daxil edilən tələbələrin sayı min 5, max 18 ola bilər!");
        }
    }
}
