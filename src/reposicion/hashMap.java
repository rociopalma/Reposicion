package reposicion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Rocío
 */
public class hashMap {

    private HashMap<Integer, Servicio> ServiciosTienda;

    public hashMap() {
        ServiciosTienda = new HashMap<Integer, Servicio>();
    }

    public void leerArchivo() {

        int cuenta = 1;
        File file = new File("lista.txt");
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                Scanner delimitar = new Scanner(linea);
                delimitar.useDelimiter("\\|");

                Servicio servicio = new Servicio();
                servicio.setCategoria(delimitar.next().trim());
                servicio.setDescripcion(delimitar.next().trim());
                ServiciosTienda.put(cuenta, servicio);
                cuenta++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    
    public String toString() {
        return "Hash Map: " + ServiciosTienda.toString();
    }

    public void obtenerServicioCodigo(String Categoria) {
        boolean verificar = false;
        for (Map.Entry<Integer, Servicio> entry : ServiciosTienda.entrySet()) {
            Servicio servicio = entry.getValue();
            if(servicio.getCategoria().equals(Categoria)){
            //do something with the key and value
            System.out.println(servicio.toString());
            verificar = true;
            }else{
                if(!verificar){
                System.out.println("Categoria no encontrada, favor verificar");
                }//fin if dentro
            }//fin else
        }//fin for

    }//fin de obtener servicio 
    
    public void obtenerCategoria(String Descripcion){
        boolean verificar = false;
        for (Map.Entry<Integer, Servicio> entry : ServiciosTienda.entrySet()) {
            Servicio servicio = entry.getValue();
            if(servicio.getDescripcion().equals(Descripcion)){
            //do something with the key and value
            System.out.println(servicio.toString());
            verificar = true;
            }else{
                if(!verificar){
                System.out.println("Descripcion no encontrada, favor verificar");
                }//fin if dentro
            }//fin else
            }

        
    }// fin obtener categoria
    
    public void crearServicio(){
            Servicio servicio = new Servicio();
            
        }
}//fin de clase
