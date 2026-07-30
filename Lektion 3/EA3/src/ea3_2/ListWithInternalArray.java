package ea3_2;

public class ListWithInternalArray {
    private int size;
    private Object[] elements;
    
    public ListWithInternalArray() {
        elements = new Object[10];
        size = 0;
    }
    
    // Fügt das übergebene Element an der angegebenen Position ein. 
    // Die nachfolgenden Elemente verschieben sich nach hinten.
    public void add(Object elem, int index) {
        for (int i = size; i > index; i--) {
            elements[i] = elements[i +1];
            }
        elements[index] = elem;
        size++;
        }

    // Liefert eine Referenz auf das Element an der angegebenen Position.
    public Object getElementAt(int index) { 
            return elements[index];
        }
    
    // Liefert eine Referenz auf das Element an der angegebenen Position und entfernt es 
    // gleichzeitig aus der Liste.  Nachfolgende Elemente werden ggf. nach vorne verschoben.
    public Object removeElementAt(int index) { 
        Object removedObject = elements[index];
        for (int i = index; i < size -1; i++){
            elements[i] = elements [i+1];
            }
        size--;
        return removedObject;
        }
    
    // Liefert die Anzahl der Elemente in der Liste
    public int getSize() { 
        return size;
        }
}