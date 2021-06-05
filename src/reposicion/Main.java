/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reposicion;

import java.util.Scanner;

/**
 *
 * @author Rocío
 */
public class Main {

    Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        (new Main()).Menu();
    }

    public void Menu(){
         int opcion = 1;
        while (opcion != 7) {
            System.out.println("**********Bienvenido*************");
            System.out.println("1. Imprimir Hashmap");
            System.out.println("2. Imprimir TreeMap");
            System.out.println("3. Imprimir LinkedHashMap");
            System.out.println("4. Agregar un servicio");
            System.out.println("5. Mostrar tipo de cliente");
            System.out.println("6. Mostrar descripcion");
            System.out.println("7. ---SALIR---");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    mapaHash();

                    break;
                case 2:
                    arbol();

                    break;

                case 3:
                    linkedMap();

                    break;
                    
                case 4:
                    //();
                    break;
                case 5:
                    consultab();
                    break;
                    
                case 6:
                    consultaa();

                default:
                    System.out.println("--------saliendo---------");
                    break;
            }//fin case
            
        }//fin while
        
    }
    public void mapaHash() {
    hashMap HashMap = new hashMap();
    HashMap.leerArchivo();
    System.out.print(HashMap.toString());
    
    }
 
    public void consultaa(){
        leer.useDelimiter("\n");
        String cat = "";
        hashMap HashMap = new hashMap();
        HashMap.leerArchivo();
        System.out.print("Introduzca la categoria de la que quiere saber los servicios");
        HashMap.obtenerServicioCodigo(leer.next());
    }
    
    public void consultab(){
        leer.useDelimiter("\n");
        hashMap HashMap = new hashMap();
        HashMap.leerArchivo();
        System.out.print("Introduzca la descripcion de la que quiere saber la categoria");        
        HashMap.obtenerCategoria(leer.next());
    }
    
    public void arbol(){
        treeMap TreeMap = new treeMap();
        TreeMap.leerArchivo();
        System.out.print(TreeMap.toString());
    }
    
    public void linkedMap(){
        linkedHashMap linked = new linkedHashMap();
        linked.leerArchivo();
        System.out.print(linked.toString());
    }
    
    
    
}
