package model;

public enum Month {
    YANVAR(31), FEVRAL(29), MART(31), APREL(30), MAY(31), IYUN(30),
    IYUL(31), AVQUST(31), SENTYABR(30), OKTYABR(31), NOYABR(30), DEKABR(31);

    private final int days;

    Month(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }
}
