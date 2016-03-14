
/**
 * Write a description of class MiHashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    //Contains all the object int
    private ArrayListInt numeros;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public MiHashSet()
    {
        numeros = new ArrayListInt();
    }
    
    /**
     * 
     */
    public boolean add(int valor){
        boolean exist = numeros.contains(valor);
        if(!exist){
            numeros.add(valor);
        }
        return !exist;
    }
    
    /**
     * 
     */
    public void clear(){
        numeros.clear();
    }
    
    /**
     * 
     */
    public void contains(int valor){
        numeros.contains(valor);
    }
    
    /**
     * 
     */
    public boolean isEmpty(){
        return numeros.isEmpty();
    }
}
