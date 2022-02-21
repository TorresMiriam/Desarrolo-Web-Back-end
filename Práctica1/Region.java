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
    public int region_id;
    public String region;
    /**
     * Método get y set para acceder a los atributos.
     * Region_id 
     * */
    public void setRegionID(int region){
        this.region_id = region_id;
    }
    public int getId(){
        return this.region_id;
    }
    /**
     * Métodos get y set para acceder a los atributos.
     * Region. 
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