/** 
 * Clase Lista implementada como lista doblemente enlazada (con o sin nodo sentinela)
 * @author(luigy valverde)
 * @version(19/06/2022)
 */
public class Lista
{
    private Nodo cabeza;
    
    /**
     * Constructor
     */
    public Lista() {
        cabeza = null;//Este constructor es innecesario   
    }
    
    /**
     * Agrega el elemento a la lista
     * @param elemento  elemento a agregar
     */
    public void agregar(int elemento) {
        //si las lista esta vacia, crear un nodo y hacerlo cabeza.
        if (cabeza == null) {
            Nodo nodo = new Nodo(elemento, null, null);
            cabeza = nodo;
        }else { //si la lista no esta vacia, añadirlo al final.
            
            //crear un nodo temporal para ir a traves de la lista.
            Nodo tempNode = cabeza;
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }
            //en este punto, tempNode es igual al ultimo elemento en la lista.
            tempNode.setNextValue(elemento);
            
        }
        
        
    }
    
    /**
     * Imprime los elementos de la lista.
     */
    public void imprimir() {
        //check if list is empty
        if (cabeza == null) {
            System.out.println("La lista esta vacia");
        }
        
        //recorrer la lista de la misma manera que en el metodo anterior
        Nodo tempNode = cabeza;
        while (tempNode != null) {
            System.out.print(tempNode.getValue() + " -> ");
            tempNode = tempNode.getNext();
        }
        System.out.println("");
    }
    
    /** 
     * Busca el elemento en la lista 
     * @param elemento  elemento a buscar
     * @return  true si el elemento esta en la lista  false si no
     */ 
    public boolean buscar(int elemento) {
        //recorrer la lista 
        Nodo tempNode = cabeza;
        while(tempNode.getNext() != null) {
            //comparar
            if (tempNode.getValue() == elemento) {
                return true;
            }
            //actualizar nodo
            tempNode = tempNode.getNext();
        }
        return false;
    }
    
    /**
     * Borra la primera instancia de elemento. 
     * @param elemento  elemento a borrar.
     */
    public void borrar(int elemento) {
        Nodo tempNode = cabeza;  
        Nodo prevNode = null;
        
        //caso cabeza tiene al elemento
        if (cabeza.getValue() == elemento) {
            cabeza = cabeza.getNext();
            return;
        }
        //deslinkear nodos 
        while (tempNode != null && tempNode.getValue() != elemento) {
            //actualizar nodos hasta encontrar el valor
            prevNode = tempNode;
            tempNode = tempNode.getNext();
        }
        
        if (tempNode == null) {
            return;
        }
        
        //encontrado
        prevNode.setNext(tempNode.getNext());
        
            
    }
    
}
    
    
    
    
    
    
    

