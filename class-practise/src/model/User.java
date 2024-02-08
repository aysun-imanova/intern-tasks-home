package model;

public class User {
    private String userName;
    private String password;
    private boolean isSignedIn;
    private Product products;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSignedIn() {
        return isSignedIn;
    }

    public void setSignedIn(boolean signedIn) {
        isSignedIn = signedIn;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }


    public User(String userName, String password, boolean isSignedIn, Product products) {
        this.userName = userName;
        this.password = password;
        this.isSignedIn = isSignedIn;
        this.products = products;
    }

}
