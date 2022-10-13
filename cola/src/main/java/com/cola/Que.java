 
package com.cola;

 
public class Que<T> {
    
    private node<T> head;
    private node<T> tail;
    
    public void Que(T value){
        node<T> newNode = new node<T>(value);
        if(head==null){
            
        }else{
            tail.setNext(newNode);
            tail.newNode;
        }
    }
}
