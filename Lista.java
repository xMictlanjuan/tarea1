package listasenlazadas1.pkg3;

import java.util.Scanner;

public class Lista {

        static class Node {
        String name;
        Node next;
    }
        
    static void dump(String msg, Node topNode) {
        System.out.print(msg + " ");
        while (topNode != null) {
            System.out.print(topNode.name + " ");
            topNode = topNode.next;
        }
        System.out.println();
    }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Scanner rd = new Scanner(System.in);
         Node top = null;
         int opt = 0;

do {
            System.out.println       
                    ("Elija la opcion requerida: \n"

 + "1 - AGREGAR \n"
                    + "2 - MOSTRAR \n"
                    + "3 - ELIMINAR \n");
                    
                    switch (opt = sc.nextInt()) {
                
                case 1:
                    
                    top = new Node();
                    System.out.println("AGREGAR");
                    top.name = rd.nextLine();
                    top.next = null;
                    
                    dump("Case 1", top);
                    break;
                    

                case 2:
                    dump("MOSTRAR", top);
                    
                    break;
                    
                case 3:  
                    
                    if (top== null) {
                        System.out.println("No hay valores que eliminar");
                    }else{
                        top=top.next;
                        dump("nodo eliminado: ",top);
                      break;  
                    }
                    
            }

} while (opt
                != 3);

}
    
    
}