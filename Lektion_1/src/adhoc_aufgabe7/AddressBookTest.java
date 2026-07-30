package adhoc_aufgabe7;

public class AddressBookTest {
    public static void main(String[] args) {
        ArrayAddressBook book = new ArrayAddressBook(3);
        Person jess = new Person("Jess", 19770712);
        Person martin = new Person("Martin", 19920915);
        Person ian = new Person("Ian", 20220303);
        Person matu = new Person("Matu", 20050204);
        
        book.addPerson(ian);
        book.print();
        book.addPerson(jess);
        book.print();
        book.addPerson(martin);
        book.print();
        book.addPerson(matu);
        book.print();
    }
    }
