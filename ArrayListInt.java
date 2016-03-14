
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    //Contains all the object int
    private int[] enteros;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        enteros = new int[0];
    }

    /**
     * Create a new object in the Class
     * @param elemento the value of the new object
     */
    public void add(int elemento){
        int[] aux = new int[enteros.length + 1];
        for(int cont = 0; cont < enteros.length; cont++){
            aux[cont] = enteros[cont];
        }
        aux [enteros.length] = elemento;
        enteros = aux;
    }

    /**
     * Create a new object in the Class
     * @param index put the new objetc in this position
     * @param elemento the value of the new object
     */
    public void add(int index,int elemento){
        if(index <= enteros.length && index >= 0){
            int[] aux = new int[enteros.length + 1];
            int cont2 = 0;
            for(int cont = 0; cont <= enteros.length; cont++){
                if(cont == index){
                    aux[cont] = elemento;
                    cont++;
                }
                if(cont != enteros.length + 1){
                    aux[cont] = enteros[cont2];
                }
                cont2++;
            }
            enteros = aux;
        }
    }

    /**
     * Limpia de objetos el arrayList
     */
    public void clear(){
        enteros =  new int[0];
    }

    /**
     * Indica si existe un elemento con el mismo valor dentro del repositorio
     * @param elemento número del que se desea saber si existe
     * @return devuelve true si encuentra una coincidencia, sino devuelbe false
     */
    public boolean contains(int elemento){
        boolean exist = false;
        int cont = 0;
        while(cont < enteros.length && !exist){
            if(enteros[cont] == elemento){exist = true;}
            cont++;
        }
        return exist;
    }

    /**
     * Devuelve el elemento en la posición indicada
     * @param index posición en la que se encuentra el elemento
     * @returm elemento que se encuentra en dicha posición, de no haberlo devuelve -1
     */
    public int get(int index){
        int aux = -1;
        if(index < enteros.length && index >= 0){ aux = enteros[index];}
        return aux;
    }

    /**
     * Change the value of object in the indicate position
     * @param index position of the object
     * @param elemento the value of the object
     */
    public void set(int index,int elemento){
        if(index <= enteros.length && index >= 0){
            enteros[index] = elemento;
        }
    }    

    /**
     * Devuelve la posición en el elemento indicado
     * @param elemento valor del elemento en el que queremos saber la posición
     * @returm elemento que se encuentra en dicha posición, de no haberlo devuelve -1
     */
    public int indexOf(int elemento){
        boolean exist = false;
        int cont = 0;
        while(cont < enteros.length && !exist){
            if(enteros[cont] == elemento){exist = true;}
            cont++;
        }
        if(!exist){cont = 0;}
        return (cont - 1);
    }

    /**
     * Indica si existe un elemento en esa posición
     * @return devuelve true si encuentra elementos en la lista
     */
    public boolean isEmpty(){
        boolean exist = true;
        if(enteros.length > 0){exist = false;}       
        return exist;
    }    

    /**
     * Devuelve el elemento en la posición indicada
     * @returm elemento que se encuentra en dicha posición, de no haberlo devuelve -1
     */
    public int remove(int index){
        boolean exist = false;
        int rem = get(index);
        if(rem != -1){
            int[] aux = new int[enteros.length - 1];
            int cont2 = 0;
            for(int cont = 0; cont < enteros.length-1; cont++){
                if(cont == index){
                    cont2++;
                }
                if(cont != enteros.length){
                    aux[cont] = enteros[cont2];
                }
                cont2++;
            }
            enteros = aux;
        }
        return rem ;
    }

    /**
     * Devuelve el tamaño total del array
     */
    public int size(){
        return enteros.length;
    }

}
