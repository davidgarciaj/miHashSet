
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
    public boolean contains(int valor){
        return numeros.contains(valor);
    }

    /**
     * 
     */
    public boolean isEmpty(){
        return numeros.isEmpty();
    }

    /**
     * 
     */    
    public boolean remove(int elemento){
        boolean exist = contains(elemento);
        if(exist){
            numeros.remove(numeros.indexOf(elemento));
        }
        return exist;
    }

    /**
     * 
     */
    public int size(){
        return numeros.size();
    }

    /**
     * 
     */
    public String toString(){
        String collection = "[";
        for(int i = 0; i < size(); i++){
            if(!collection.equals("[")){collection+= ", ";}
            collection+= numeros.get(i);
        }
        collection+= "]";
        return collection;
    }

    /**
     * 
     */
    public boolean equals(MiHashSet otroConjunto){
        boolean equals = true;
        if((size() != otroConjunto.size())){ equals = false;}
        for(int i = 0; i < size(); i++){            
            if(!otroConjunto.contains(numeros.get(i))){
                equals = false;
            }
        }
        return equals;
    }
}
