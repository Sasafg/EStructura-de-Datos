/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7.semana7;

/**
 *
 * @author Saryf
 */
public class nodo<T> {
      private T value;
    private nodo<T> next;
    private nodo<T> back;
    
    public nodo(){
        
    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public nodo<T> getNext() {
        return next;
    }

    public void setNext(nodo<T> next) {
        this.next = next;
    }

    public nodo<T> getBack() {
        return back;
    }

    public void setBack(nodo<T> back) {
        this.back = back;
    }
    
    
}
