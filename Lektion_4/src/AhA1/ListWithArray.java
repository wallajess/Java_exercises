package AhA1;

public class ListWithArray<ET> {
    private Object[] elems;
    
    public ListWithArray(int initialCapacity) {
        elems = new Object[initialCapacity < 1 ? 1 : initialCapacity];
    }
   
    ET getLast() {
        if (size==0) throw new java.util.NoSuchElementException();
        return header.previous.element;
    }
    
    ET removeLast() {
        Entry<ET> lastEntry = header.previous;
        if (lastEntry == header) throw new java.util.NoSuchElementException();
        lastEntry.previous.next = lastEntry.next;
        lastEntry.next.previous = lastEntry.previous;
        size--;
        return lastEntry .element;
    }
    
    void addLast (ET e) {
        Entry<ET> newEntry = new Entry<ET> (e, header, header.previous);
        header.previous.next = newEntry;
        header.previous = newEntry;
        size++;
    }
    
    int size() {
        return size;
    }
    
    private void doubleArray() {
        Object[] newArray = new Object[elems.length * 2];
        for (int i = 0; i < elems.length; i++) {
            newArray[i] = elems[i];
        }
        elems = newArray;
    }
  
}