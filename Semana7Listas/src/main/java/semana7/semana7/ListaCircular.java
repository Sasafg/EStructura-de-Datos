/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7.semana7;

/**
 *
 * @author Saryf
 */
public class ListaCircular {
      private nodo<persona> head;
    private nodo<persona> tail;
    
    public void insertar(persona value) {
        nodo <persona> nuevoNodo = new nodo <persona>(value);
        if (head == null) {
            head= nuevoNodo;
            tail = head;
            tail.setNext(head);
        } else if(head.getValue().getId() > value.getId()){
                nuevoNodo.setNext(head);
                head = nuevoNodo;
                tail.setNext(head);
        }else if (tail.getValue().getId() <= value.getId()){
            tail.setNext(nuevoNodo);
            tail = nuevoNodo;
            tail.setNext(head);
      
        }else{
            nodo <persona> aux = tail;
            while (aux.getNext().getValue().getId() < value.getId()){
                aux = aux.getNext();
            }
            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
        }
    
}
     public void imprimirLista() {
        nodo<persona> aux = head;
        while (aux != tail) {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
            }
         System.out.println(tail);
}
     }
}
