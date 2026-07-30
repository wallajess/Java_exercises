package EA2_2;

import java.util.NoSuchElementException;

public class Stack {
    private Entry header = new Entry(null, null);
    
    public Stack() {
        header.next = header;
    }
            
    public void push(String element) {
        header.next = new Entry(element, header.next);
    }
    
    
    public String peek() throws NoSuchElementException {
        if (header.next == header) {
            throw new NoSuchElementException("Der Stapel ist leer.");
        }        
        return header.next.element;
    }
    
    public String pop() throws NoSuchElementException {
        if (header.next == header) {
            throw new NoSuchElementException("Der Stapel ist leer.");
        }        
        String topElement  = header.next.element;
         header.next = header.next.next;
         return topElement;
    }
    
    public boolean isEmpty() {
        return header.next == header;
    }
    
    @Override
    public String toString() {
        Entry current = header.next;
        String result = "Top -> " ;
        while (current != header) {
            result += current.element + " ";
            current = current.next;
        }
        return result;
    }
        
    private static class Entry {
        private String element;
        private Entry next;

        private Entry(String element, Entry next) {
            this.element = element;
            this.next = next;            
        }    
    }
}
