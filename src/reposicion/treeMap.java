/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reposicion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Rocío
 */
public class treeMap {
    TreeMap<Integer, Servicio> map = new TreeMap<>();
    
    public treeMap() {
        map = new TreeMap<Integer, Servicio>();
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
                map.put(cuenta, servicio);
                cuenta++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    
    public String toString() {
        return "Tree Map: " + map.toString();
    }
}
