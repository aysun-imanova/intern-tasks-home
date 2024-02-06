package service.impl;

import model.Group;
import model.Student;
import service.IGroupService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupServiceImpl implements IGroupService {

    Group group;
    Student student;

    @Override
    public void addStudent(Student student) {
        if (group.getStudents().size() < group.getStudentLimit()) {
            group.getStudents().add(student);
            System.out.println("Tələbə qrupa uğurla əlavə edildi!");
        } else {
            System.out.println("Tələbələrin sayı üzrə müəyyən edilən limit aşıldı!");
        }
    }

    @Override
    public List<Student> filterByName(String filter) {
        List<Student> filteredStudents = new ArrayList<>();
        for(Student student : group.getStudents()){
            if(this.student.getFullName().contains(filter)){
                filteredStudents.add(student);
            }
        }
       return filteredStudents;
    }

    @Override
    public Group createGroup(Scanner scanner) {
        System.out.print("Qrup nömrəsini daxil edin (2 böyük hərf və 3 rəqəmdən ibarət olmalıdır): ");
        String groupNo = scanner.nextLine();

        System.out.print("Tələbə sayını daxil edin (5-18 tələbə): ");
        int studentLimit = scanner.nextInt();
        scanner.nextLine();

        return new Group(groupNo, studentLimit);
    }

    @Override
    public void addStudentToGroup(Scanner scan, Group group) {
        System.out.print("Tələbə adını daxil edin: ");
        String name = scan.nextLine();

        System.out.print("Tələbənin soyadını daxil edin: ");
        String surname = scan.nextLine();

        System.out.print("Tələbənin ortalamasını qeyd edin (0-100): ");
        int avgPoint = scan.nextInt();
        scan.nextLine();

        addStudent(new Student(name, surname, avgPoint));
    }

    @Override
    public void findStudentByName(Scanner scanner, Group group) {
        System.out.print("Axtarmaq istədiyiniz kəliməni daxil edin: ");
        String filter = scanner.nextLine();

        List<Student> filteredStudents = filterByName(filter);
        System.out.println("Filtered students:");
        for (Student student : filteredStudents) {
            System.out.println(student.getFullName());
        }
    }
}
