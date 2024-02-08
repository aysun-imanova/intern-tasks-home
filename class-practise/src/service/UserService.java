package service;

public interface UserService {
    boolean checkPassword();
    void login(String userName, String password);
    void add();
}
