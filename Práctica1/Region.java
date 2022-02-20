/** 
 * Desarrollo Back-end
 * Práctica 01
 * @author Miriam Torres Bucio.
 */
/**
 * Clase Región con atributos:
 * region_id;
 * region;
 */
public class Region{
    private int region_id;
    public String region;
    /**
     * Método get para acceder a los atributos privados. 
     * */
    public void getId(int id){
        region_id  = id;
    }
    /**
     * Métodos get y set para acceder a los atributos publicos. 
     * */
    public void setRegion(String region){
        this.region = region;
    }
    public String getRegion(){
        return this.region;
    }
    /**
     * Método toString para la lectura de cadenas.
     */
    @Override
    public String toString(){
        return "Region{" + "Region_id = " + region_id + ", Region = " + region + '}';
    }
}