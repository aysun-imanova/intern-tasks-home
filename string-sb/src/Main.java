import model.Group;
import service.impl.GroupServiceImpl;
import service.impl.MainServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GroupServiceImpl groupService = new GroupServiceImpl();
        MainServiceImpl mainService = new MainServiceImpl();

        Group group = groupService.createGroup(input);

        groupService.createGroup(input);

        while (true) {
            mainService.printMenu();
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    groupService.addStudentToGroup(input, group);
                    break;
                case 2:
                    groupService.findStudentByName(input, group);
                    break;
                default:
                    System.out.println("Seçim düzgün deyil, zəhmət olmasa, yenidən yoxlayın!");
            }

            System.out.println("Davam etmək istəyirsinizmi? (yes/no)");
            String continueChoice = input.nextLine();
            if (!continueChoice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Proqram dayandırıldı!");
    }

    }

