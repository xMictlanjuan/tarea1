package lisimpl.buscar;

import java.util.Scanner;
public class LisimplBuscar {

    Scanner sc = new Scanner(System.in);

    static class Nodo {  

        String Name;    
        Nodo next;     

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc; 
        LisimplBuscar n = new LisimplBuscar();

        do { 

            System.out.println("\n Menu de opciones ingrese una opción :"
                    + "\n 1-Agregar nodo "
                    + "\n 2-Eliminar nodos"
                    + "\n 3-Mostrar lista"
                    + "\n 4-Generar palabra"
                    + "\n 5-Buscar nodo"
                    + "\n 6-Salir ");

            switch (opc = sc.nextInt()) { 

                case 1:  
                    n.Agregar();  
                    break; 

                case 2: 
                    n.Eliminar(); 
                    break; 

                case 3: 
                    n.Mostrar(); 
                    break;

                case 4:
                    n.Generar();
                    break;

                case 5:
                    n.Buscar();

            }
        } while (opc != 6);   
    }
    Nodo inicial = null; 

    
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

    public void Generar() {

    }

    public void Buscar() {
        int cont = 0;
        Nodo post = new Nodo();
        Boolean Encontrado = true;
        String valor;
        post = inicial;

        if (inicial != null) {
            System.out.println("Ingrese el nodo a buscar");
            valor = sc.nextLine();
            
            if (post != null && Encontrado != true) {

                if (post.Name == valor) {
                    Encontrado = true;
                    cont++;
                    System.out.println("El dato encontrado es: " + valor + "en posición: " + cont);
                } else {
                    post = post.next;
                }
            } else {
                System.out.println("El dato a buscar si se encuentra es: " + valor );
            }
        } else {
            System.out.println("Lista vacia");
        }
    }

}
