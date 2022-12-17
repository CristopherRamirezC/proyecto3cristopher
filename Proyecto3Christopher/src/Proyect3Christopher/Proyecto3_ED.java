package Proyect3Christopher;

import java.util.Scanner;

/**
 *
 * @author Christopher
 */

public class Proyecto3_ED {
    public static void main(String[] args) {
        //Creamos el objeto Scanner 
        Scanner OP = new Scanner(System.in);
        //Creamos los nodos del arbol
        NodoArbol raiz = new NodoArbol("Carlos", "M");
        NodoArbol nodo2 = new NodoArbol("Maria", "F");
        NodoArbol nodo3 = new NodoArbol("Luis", "M");
            //Ordenamos los nodos del arbol
        raiz.setNodoizq(nodo2);
        nodo2.setNodoizq(new NodoArbol("Ana", "F"));
        nodo2.setNododer(new NodoArbol("Jorge", "M"));
        raiz.setNododer(nodo3);
        nodo3.setNodoizq(new NodoArbol("Alicia", "F"));
        nodo3.setNododer(new NodoArbol("Andres", "M"));

        //Haremos un ciclo mientras, para poder quedarnos en la app y podamos
        //hacer todo lo necesario
        int opci = 0;
        while (opci != 4) {
            //Creamos la bienvenida y el menu
        System.out.println("Bienvenido al menu");
        System.out.println("1- Nombre de todos los progenitores Femeninos");
        System.out.println("2- Imprimir todos los arboles ordenados ");
        System.out.println("3- Insertar al arbol genealogico");
        System.out.println("4- SALIR");
        System.out.println(" ");
            opci = OP.nextInt();
            switch (opci) {
                case 1:
                    //Aca intenamos recorrer el arbol solo por los hijos 
                    //izquierdos
                    Imprmujeres(raiz);
                    break;
                case 2:
                    //Aca imprimimos todos los ordenes de un arbol binario
                    System.out.println("InOrden:");
                    InOrden(raiz);

                    System.out.println("\nPreOrden:");
                    PreOrden(raiz);

                    System.out.println("\nPostOrden:");
                    PostOrden(raiz);
                    break;
                case 3:
                    //Aca podemos ingresar una nueva persona 
                    //*UNICAMENTE PODREMOS INGRESAR SOLO UNA PERSONA
                    Scanner tec = new Scanner(System.in);
                    System.out.println("Digite el nombre: ");
                    String Nombre;
                    Nombre = tec.nextLine();
                    System.out.println("Digite el genero: F o M");
                    String Genero;
                    Genero = tec.nextLine();
                    NodoArbol nodo4 = new NodoArbol(Nombre, Genero);
                    System.out.println("La persona ingresada es:\n " + nodo4.getDato());
                    System.out.println(nodo4.getGenero());
                    break;
                default:
                    System.out.println("SALIENDO DEL SISTEMA.....");
                    break;
            }
        }
    }
//CREAMOS TODOS LOS ORDENES 
    
    
    public static void InOrden(NodoArbol raiz) {
        if (raiz != null) {
            InOrden(raiz.getNodoizq());
            System.out.println(raiz.getDato());
            InOrden(raiz.getNododer());
        }
    }

    public static void PreOrden(NodoArbol raiz) {
        if (raiz != null) {
            System.out.println(raiz.getDato());
            PreOrden(raiz.getNodoizq());
            PreOrden(raiz.getNododer());
        }
    }

    public static void PostOrden(NodoArbol raiz) {
        if (raiz != null) {
            PostOrden(raiz.getNodoizq());
            PostOrden(raiz.getNododer());
            System.out.println(raiz.getDato());
        }
    }
//Intentamos crear una impresora de Progenitoras Femeninas
     private static void Imprmujeres(NodoArbol raiz) {
        if (raiz != null) {
            Imprmujeres(raiz.getNodoizq());
            System.out.println(raiz.getDato());
            
            
        }
    }
}
