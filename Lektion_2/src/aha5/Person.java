package aha5;

public class Person {
    String name;
    int birthday; /* in der Form JJJJMMTT */

    Person(String name, int birthday) {
        this.name = name;
        this.birthday = birthday;
}
    void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Geburtsdatum: " + this.birthday);
}
    boolean isBirthday(int date) {
        return birthday % 10000 == date % 10000;

}
}
