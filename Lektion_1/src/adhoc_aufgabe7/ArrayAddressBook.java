package adhoc_aufgabe7;

public class ArrayAddressBook {

    private Person[] persons;
    private int nextFreeIndex; 
    
    public ArrayAddressBook (int size) {
        if (size < 1) {
            size = 1;
        }
        persons = new Person[size];
    }
          
    public void addPerson(Person newPerson) {
        if (nextFreeIndex >= persons.length) {
            doublePersonArray();
        } 
        persons[nextFreeIndex] = newPerson;
        nextFreeIndex++;          
        }
    
    private void doublePersonArray () {
        Person[] biggerAddressBook = new Person[persons.length * 2];
        for (int i = 0; i< persons.length; i++) {
            biggerAddressBook[i] = persons[i];
        }
        persons = biggerAddressBook;
    }
    
    public void print() {
        System.out.println("The address book currently has this many entries: " + nextFreeIndex);
        System.out.println("The size of the address book is: " + persons.length);
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null) {
                persons[i].print();
            }
        }
    }  
}

