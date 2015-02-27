
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private MiHashMap mapa;

    /**
     * Constructor for objects of class Test
     */
    public MiHashMap testPut()
    {
        MiHashMap mapa = new MiHashMap();

        mapa.put("primero", 1);
        mapa.put("segundo", 2);
        mapa.put("tercero", 3);
        mapa.put("cuarto" , 4);

        return mapa;
    }

    public int[] testGet(){

        mapa.put("primero", 1);
        mapa.put("segundo", 2);
        mapa.put("tercero", 3);
        mapa.put("cuarto" , 4);

        int[] num = new int[5];

        num[0]= mapa.get("cuarto");
        num[1]= mapa.get("segundo");
        num[2]= mapa.get("decimoxex");
        num[3]= mapa.get("primero");
        num[4]= mapa.get("tercero");

        return num;
    }

    public MiHashMap testRemove()
    {
        MiHashMap mapa = new MiHashMap();
        int[] num=new int[5];
        int j = 0;

        num[j]= mapa.remove("3");
        j++;
        mapa.put("1", 1);
        mapa.put("2", 2);
        mapa.put("3", 3);
        mapa.put("4", 4);

        num[j]= mapa.remove("4");
        j++;
        num[j]= mapa.remove("3");
        j++;
        num[j]= mapa.remove("3");
        j++;
        num[j]= mapa.remove("1");

        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }

        if(mapa.size()!=2){
            System.out.println("no se ha hecho el borrado correctamente");
        }
        else{
            System.out.println("SE HAN REALIZADO UN MISMO NUMERO DE BORRADOS QUE SE DESEABA");
        }
        return mapa;
    }
}