import model.Group;
import model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Tələbənin adını daxil edin: ");
//        String name = sc.nextLine();
//
//        System.out.println("Tələbənin soyadını daxil edin: ");
//        String surname = sc.nextLine();
//
//        System.out.println("Qrup nömrəsini daxil edin: ");

        Scanner scanner = new Scanner(System.in);

        Student student = new Student(scanner);
        Student st = new Student();

        Group group = new Group(scanner);




    }
}
