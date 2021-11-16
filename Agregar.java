
package lisimple.agregar;

import java.util.Random;
import java.util.Scanner;


public class LisimpleAgregar {
Scanner sc = new Scanner(System.in);

    static class Nodo {  

        String Name;   
        Nodo next;     

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc; //se declara variable de opcion para el menu
        LisimpleAgregar n = new LisimpleAgregar();

        do { //se abre un do while para nuestro menu

            System.out.println("\n Menu de opciones ingrese una opción :"
                    + "\n 1-Agregar nodo "
                    + "\n 2-Eliminar nodos"
                    + "\n 3-Mostrar lista"
                    + "\n 4-Generar palabra"
                    + "\n 5-Salir ");

            switch (opc = sc.nextInt()) { 

                case 1:  
                    n.Agregar();  
                    break; 

                case 2: 
                    n.Eliminar(); /
                    break; 

                case 3: 
                    n.Mostrar(); 
                    break; 

                case 4:
                    n.Generar();
                    break;

                

            }
        } while (opc != 5);   
    }
    Nodo inicial = null; 

    //METODO PEDIR AL USUARIO AGREGAR UN NODO
    public void Agregar() { 
        if (inicial == null) { 
            inicial = new Nodo(); 
            System.out.println("Ingrese: "); 
            inicial.Name = sc.nextLine(); 
        } else {
            Nodo post = new Nodo(); 
            System.out.println("Ingrese: "); 
            post.Name = sc.nextLine(); 
            post.next = inicial; 
            inicial = post; 
        }
    }

    
    public void Mostrar() { 
        Nodo post = new Nodo();
        post = inicial; 
        if (inicial != null) { 
            while (post != null) { 
                System.out.print(post.Name + "\n"); 
                post = post.next; 
            }
        } else {
            System.out.println("La lista esta vacia");
        } 
    }

    
    public void Eliminar() { 
        if (inicial == null) { 
            System.out.println("No hay nodos que eliminar"); 
        } else {
            System.out.print("\n Nodo eliminado"); 
            inicial = inicial.next;
        } 
    }

    public void Generar(){
         char L1,L2,L3,L4,L5;
         Random r= new Random (); 
         L1 = (char)(r.nextInt(26)+'A');
         L2 = (char)(r.nextInt(74)+48);
         L3 = (char)(r.nextInt(74)+48);
         L4 = (char)(r.nextInt(74)+48);
         L5 = (char)(r.nextInt(14)+33);
         
         if (inicial== null) { 
            inicial = new Nodo (); 
            inicial.Name = (""+L1+L2+L3+L4+L5+""); 
        } else {  Nodo post = new Nodo (); 
                  post.Name = (""+L1+L2+L3+L4+L5+""); 
                  post.next= inicial; 
                  inicial=post; 
            }
    }

   

}
