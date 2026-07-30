package aha5;

public class LinkedListFeuTest {
    public static void main(String[] args) {
        LinkedListFeu test = new LinkedListFeu();
        Person jess = new Person("Jess", 19770712);
        Person martin = new Person("Martin", 19920915);
        Person ian = new Person("Ian", 20220303);
        Person matu = new Person("Matu", 20050204);
        
        test.addLast(jess);
        test.printAll();
        test.addLast(matu);
        test.printAll();
        test.addLast(martin);
        test.printAll();
        test.addLast(ian);
        test.printAll();
        
        System.out.println(test.size());
        System.out.println("First element: " + test.header.next.element);
        
        try {
           Entry entry = test.getEntryAt(2);
           System.out.println("Element at position 2: " + entry.element);
        } catch (NoSuchElementException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
