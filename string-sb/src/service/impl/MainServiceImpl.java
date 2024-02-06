package service.impl;

import service.IMainService;

public class MainServiceImpl implements IMainService {
    @Override
    public void printMenu() {
        System.out.println("Menyu: \n1) Tələbə əlavə etmək \n2) Ada görə tələbə axtarmaq \nSeçiminizi daxil edin: ");
    }
}
