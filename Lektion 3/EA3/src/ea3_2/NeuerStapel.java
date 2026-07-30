package ea3_2;

public class NeuerStapel {
    
    private ListWithInternalArray stack;
    
    public NeuerStapel() {
        stack = new ListWithInternalArray();
    }
     
 // legt ein Element auf den Stapel
    public void push(Object element) {
        stack.add(element, stack.getSize()-1);
                }

    // liefert eine Referenz auf das oberste Element des Stapel
    public Object peek() {
        return stack.getElementAt(stack.getSize()-1);
        }

    // liefert eine Referenz auf das oberste Element des Stapel. 
    // Gleichzeitig wird das Element vom Stapel entfernt
    public Object pop() {
        return stack.removeElementAt(stack.getSize()-1);
    }
    
    // gibt an, ob der Stapel leer ist
    public boolean isEmpty() {
        if (stack.getSize() == 0) {
            return true;}
        return false;
        }
}
