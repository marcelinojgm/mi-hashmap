/**
 * clase que imita el comportamiento de la clase HashMap con claves tipo String y valores int
 * 
 * @author Marcelino
 * @version beta
 */
public class MiHashMap
{
    // instance variables - replace the example below with your own
    private String[] key;
    private int[] value;

    /**
     * Constructor for objects of class MiHashMap
     */
    public MiHashMap()
    {
        key   = new String[0];
        value = new int[0];
    }

    /** 
     * Asocia el valor especificado con la clave especificada. 
     * Si la clave existía, entonces sobreescribe su valor
     * @param clave clave especificada
     * @param valor valor asociado a la clave especificada
     * @return Si la clave existía, entonces sobreescribe su valor y devuelve el valor antiguo. 
     *         Si no existía devuelve -1.
     */
    public int put(String clave, int valor){

        //true la clave ya existe
        //false la clave no 
        boolean found = false;
        //retorna el antiguo valor si este es cambiado o menos uno en caso de que sea una nueva entrada
        int oldValue = -1;
        String[] newKey    = new String[key.length + 1];           
        int[]    newValue  = new int[value.length +1 ];
        for(int i = 0; i < key.length; i++){
            //agregamos los viejos elementos al nuevo mapa
            newKey[i]   = key [i];
            newValue[i] = value[i];

            //si la clave ya existe se cambia el valor del elemento asignado a esa clave
            if(key[i]==clave && !found)
            {
                oldValue = value[i];
                value[i] = valor; 
                found = true;
            }
        }

        //si la clave es nueva se crea un nuevo elemento con su clave y valor
        if(!found){
            //agregado del nuevo registro
            newKey[newKey.length -1]      = clave;
            newValue[newValue.length - 1] = valor;

            //guardamos el nuevo mapa
            key   = newKey;
            value = newValue;
        }

        return oldValue;
    }

    /**
     * devuelve true si el mapa no contiene elementos.
     * @return true mapa vacio, false mapa no esta vacio
     */
    public boolean isEmpty(){
        return key.length==0;
    }

    /**
     *  devuelve el número de elementos del mapa.
     *  @return número de elementos del mapa
     */
    public int size(){
        return key.length;
    }

    /**
     *  elimina del mapa el elemento con la clave dada y devuelve su valor. 
     *  Si no hay esa clave en el mapa devuelve -1.
     *  @param clave clave del elemento que se desea eliminar.
     *  @return valor de la clave asociada, si la clave no existe -1.
     */
    public int remove(String clave){
        //valor asociado a la clave especificada, si esta no existe -1
        int valor = -1;
        //si la clave existe
        if(containsKey(clave)){
            //definicion de nuevo mapa
            String[] newKey    = new String[key.length - 1];           
            int[]    newValue  = new int[value.length  - 1];

            //true el elemnto ha sido encontrado
            //false el elemento no ha sido encontrado
            boolean found = false;
            for(int index = 0; index < key.length ; index++ )
            {
                //borradao del registro con clave especificada
                if (key[index] == clave && !found){
                    valor = value[index];
                    found = true;
                }
                //guardado de los registros que estan antes del de borrado
                else if(!found){
                    newKey[index]   = key[index];
                    newValue[index] = value[index];
                }
                //guardado de registros depues del registro borrado
                else{
                    newKey[index - 1]   = key[index];
                    newValue[index - 1] = value[index];
                }
            }

        }

        return valor;
    }

    /**
     *  Devuelve true si el mapa contiene la clave dada.
     *  @param clave clave que se desea saber si esta contedia en algun registro del mapa
     *  @return  true si el mapa contiene la clave dada.
     */
    public boolean containsKey(String clave){
        boolean contains = false;
        //busqueda de la clave dada en el mapa
        for(int index = 0; index < key.length && !contains; index++ )
        {
            //encontrado la clave dada
            if (key[index] == clave){
                contains = true;
            }
        }
        return contains;
    }

    /**
     * Devuelve true si el mapa contiene el valor dado.
     * @param valor que se desea comprobar si esta contenido en algun registro del mapa
     * @return true si el mapa contiene la valor dado
     */
    public boolean containsValue(int valor){
        boolean contains = false;
        //busqueda de el valor dado en el mapa
        for(int index = 0; index < value.length && !contains; index++ )
        {
            //encontrado el valor dado
            if (value[index] == valor){
                contains = true;
            }
        }
        return contains;
    }

}