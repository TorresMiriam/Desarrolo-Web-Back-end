/** 
 * Desarrollo Back-end
 * Práctica 01
 * @author Miriam Torres Bucio.
 */

/**
 * Clase Customer con atributos:
 * customer_id;
 * name;
 * surname;
 * rfc;
 * mail;
 * Region;
 */
public class Customer{
    public int customer_id;
    public String name;
    public String surname;
    public int rfc;
    public String email;
    /** private Region(); */
    /**
     * Métodos set y get para acceder a los atributos publicos.
     * */
    public void setCustomerID(int customer_id){
        this.customer_id = customer_id;
    }
    public int getCustomerID(){
        return this.customer_id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setRFC(int rfc){
        this.rfc = rfc;
    }
    public int getRFC(){
        return this.rfc;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    /**
     * Método toString para la lectura de cadenas.
     */
    @Override
    public String toString(){
        return "Customer{" + "Customer_id = " + customer_id + ", Nombre = " + name + ", Surname = " + surname + ", Email = " + email + ", RFC = " + rfc + '}';
    }
}