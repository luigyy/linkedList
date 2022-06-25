/** 
 * Clase Nodo usada por la clase Lista.
 * 
 * @author(luigy valverde)
 * @version(19/06/2022)
 */
public class Nodo
{
    private int elemento;
    private Nodo anterior;
    private Nodo siguiente;
    
    /**
     * Constructor para objetos de la clase Nodo.
     */
    public Nodo(int elemento, Nodo anterior, Nodo siguiente) {
        this.elemento = elemento;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }
    /**
     * Consigue el valor del nodo siguiente
     */
    public Nodo getNext() {
        return this.siguiente;
    }
    
    /**
     * Sets the value of the next element
     * @param element value for the node.
     */
    public void setNextValue(int element) {
        Nodo nodo = new Nodo(element, null, null);
        this.siguiente = nodo;
    }
    //-------------------------------------------------------
    /**
     * Sets the value of the previous element
     * @param element  value for the node.
     */
    public void setPreviousValue(int element) {
        Nodo nodo = new Nodo(element, null, null);
        this.anterior = nodo;
    }
    
    /**
     * Consigue nodo anterior
     */
    public Nodo getPrevious() {
        return this.anterior;
    }
    
    
    /**
     * Gets value of the current node
     */
    public int getValue() {
        return this.elemento;
    }
    
    public void setNext(Nodo node) {
        this.siguiente = node;
    }
    
}
