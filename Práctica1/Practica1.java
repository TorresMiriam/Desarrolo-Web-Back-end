import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;

/** 
 * Desarrollo Back-end
 * Práctica 01
 * @author Miriam Torres Bucio.
 */
/**
 * Clase Practica1 que implementa las siguientes funciones:
 * getCustomers();
 * createCustomer(Customer);
 * deleteCustomer(customer_id);
 * método main
 */
public class Practica1 {
    /**
     * Separador de los archivos csv.
     */
    public static final String SEPARADOR = ",";
    /**
     * Muestra en consola todos los customers 
     * registrados con todos sus datos.
     * @return customers.
     */
     
    public void getCustomers(){
        BufferedReader bufferLectura = null;
        try{
            /**
             * Abrimos el archivo .csv en buffer de lectura.
             * Leemos una linea del archivo.
             */
            bufferLectura = new BufferedReader(new FileReader("Customer.csv"));
            String linea = bufferLectura.readLine();
            /**
             * Separamos la línea leída con el separador.
             * Volvemos a leer otra linea del .csv
             */
            while(linea != null){
                String[] campos = linea.split(SEPARADOR);
                System.out.println(Arrays.toString(campos));
                linea = bufferLectura.readLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            /**
             * Cerramos el buffer de lectura.
             */
            if(bufferLectura != null){
                try{
                    bufferLectura.close();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    /**
     * Método que nos permite editar un archivo csv.
     */
    public static void editar(List<Customer> customers){
        BufferedWriter bw = null;
        FileWriter fw = null;
        try{
            /**data por el momento es prueba, si funciona */
            /**String data = "holii xdxd"; */
            File file = new File("Customer.csv");
            if(!file.exists()){
                file.createNewFile();
            }
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            /** Datos para identificar las columnas */
            bw.write("Customer_id");
            bw.write("Nombre");
            bw.write("Surname");
            bw.write("Email");
            bw.write("RFC");
            /** Mostramos mensaje de info guardada */
            System.out.println("Información guardada");
            /** Recorremos la lista y lo insertamos en el archivo */
            for(Customer customer : customers){
                bw.write("Customer_id");
                bw.write("Nombre");
                bw.write("Surname");
                bw.write("Email");
                bw.write("RFC");
            }
        } catch(IOException e){
            e.printStackTrace();
        } finally {
            try{
                if(bw != null){
                    bw.close();
                }
                if(fw != null){
                    fw.close();
                }
            } catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
    /**
     * Recibe desde la consola los datos de un 
     * customer y guarda su información.
     */ 
    /** 
    public void createCustomer(List<Customer> customer){
        
    }
    */
    /**
     * Recibe desde la consola un customer_id 
     * y elimina el customer con el mismo id.
     */ 
    /** 
    public void deleteCustomer(int customer_id){
        
    }
    */

    public static void main(String[]args){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while(!salir){
            System.out.println("1. Mostrar datos del cliente");
            System.out.println("2. Agregar datos");
            System.out.println("3. Eliminar un cliente");
            System.out.println("4. Salir");

            try{
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch(opcion){
                    case 1:
                        Practica1 p1 = new Practica1();
                        p1.getCustomers();
                        break;
                    case 2: 
                        List<Customer> customers = new ArrayList<Customer>();
                        customers.add(new Customer(3557,"Juan","Torres","juan@gmail.com",3756412389056));
                        editar(customers);
                        break;
                    case 3:
                        System.out.println("Holi");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch(InputMismatchException e){
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
}
