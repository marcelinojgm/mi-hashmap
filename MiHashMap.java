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

}