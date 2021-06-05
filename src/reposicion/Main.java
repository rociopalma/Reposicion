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
        (new Main()).arbol();
    }

    /*public void Menu(){
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
                    ();

                    break;
                case 2:
                    ();

                    break;

                case 3:
                    ();

                    break;
                    
                case 4:
                    ();
                    break;
                case 5:
                    ();
                    break;

                default:
                    System.out.println("--------saliendo---------");
                    break;
            }//fin case
            
        }//fin while
        
    }*/
    public void mapaHash() {
    hashMap HashMap = new hashMap();
    HashMap.leerArchivo();
    System.out.print(HashMap.toString());
    
    }
 
    public void consultaa(){
        hashMap HashMap = new hashMap();
        HashMap.leerArchivo();
        HashMap.obtenerServicioCodigo("A");
    }
    
    public void consultab(){
        hashMap HashMap = new hashMap();
        HashMap.leerArchivo();
        HashMap.obtenerCategoria("Transferencias");
    }
    
    public void arbol(){
        treeMap TreeMap = new treeMap();
        TreeMap.leerArchivo();
        System.out.print(TreeMap.toString());
    }
    
    
}
