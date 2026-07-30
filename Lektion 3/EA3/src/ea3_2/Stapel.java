package ea3_2;

public class Stapel extends ListWithInternalArray{
     
 // legt ein Element auf den Stapel
    public void push(Object element) {
        add(element, getSize()-1);
                }

    // liefert eine Referenz auf das oberste Element des Stapel
    public Object peek() {
        return getElementAt(getSize()-1);
        }

    // liefert eine Referenz auf das oberste Element des Stapel. 
    // Gleichzeitig wird das Element vom Stapel entfernt
    public Object pop() {
        return removeElementAt(getSize()-1);
    }
    
    // gibt an, ob der Stapel leer ist
    public boolean isEmpty() {
        if (getSize() == 0) {
            return true;}
        return false;
        }
}
