/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7.semana7;

/**
 *
 * @author Saryf
 */
public class lista {
    private nodo<persona> cabeza;

    public lista() {

    }

    public void insertar(persona value) {
        nodo <persona> nuevoNodo = new nodo <persona>(value);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } 
        
        else if (cabeza.getValue().getId() > nuevoNodo.getValue().getId()) {
            nuevoNodo.setNext(cabeza);
            cabeza = nuevoNodo;
        } else if (cabeza.getValue().getId() > nuevoNodo.getValue().getId() && cabeza.getNext() == null) {
            cabeza.setNext(nuevoNodo);
        } else {
            nodo<persona> aux = cabeza;
            while (aux.getNext() != null && aux.getValue().getId() < nuevoNodo.getValue().getId()) {
                aux = aux.getNext();
            }

            nuevoNodo.setNext(aux);
            aux.setNext(aux);
        }

    }

    public void imprimirLista() {
        nodo<persona> aux = cabeza;
        while (aux != null) {
            System.out.println(aux.getValue().toString());
            aux = aux.getNext();
        }
    }
}


