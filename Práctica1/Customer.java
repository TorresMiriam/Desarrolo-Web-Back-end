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
 * mail;
 * rfc;
 */
public class Customer{
    public int customer_id;
    public String name;
    public String surname;
    public String email;
    public String rfc;
    /** private Region(); */
    /**
     * Constructor de nuestra clase Customer.
     */
    public Customer(int customer_id, String name, String surname, String email, String rfc){
        this.customer_id = customer_id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.rfc = rfc;
    }
    /**
     * Métodos set y get para acceder a los atributos publicos.
     * Customer_id.
     * */
    public void setCustomerID(int customer_id){
        this.customer_id = customer_id;
    }
    public int getCustomerID(){
        return this.customer_id;
    }
    /**
     * Métodos set y get para acceder a los atributos publicos.
     * Nombre.
     * */
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    /**
     * Métodos set y get para acceder a los atributos publicos.
     * Surname.
     * */
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return this.surname;
    }
    /**
     * Métodos set y get para acceder a los atributos publicos.
     * Email.
     * */
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    /**
     * Métodos set y get para acceder a los atributos publicos.
     * RFC.
     * */
    public void setRFC(String rfc){
        this.rfc = rfc;
    }
    public String getRFC(){
        return this.rfc;
    }
    /**
     * Método toString para la lectura de cadenas.
     */
    @Override
    public String toString(){
        return customer_id + "," + name + "," + email + "," + rfc;
    }
}