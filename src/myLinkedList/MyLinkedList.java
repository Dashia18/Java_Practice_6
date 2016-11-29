package myLinkedList;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Daria Serebryakova on 28.11.2016.
 */
public class MyLinkedList<E> implements ILinkedList<E> {

    private Node<E> begin;
    private Node<E> node;
    private Node<E> nodeNext;
    private int size = 0;
    private Node<E> getNode(int index){
        node = begin;
        for (int i = 0; i <= index; i++) {
            node = node.getNextNode();
        }
        return node;
    }


    public MyLinkedList(){

        begin = new Node<E>(null, null);
    }
    @Override
    public void add(E element){

        if (size == 0){
            node = new Node<E>(element, null);
            begin.setNextNode(node);
        }
        else {
            nodeNext = new Node<E>(element, null);
            node = getNode(size-1);//get last Node
            node.setNextNode(nodeNext);

            //add in the beginning
//            node = new Node<E>(element, begin.getNextNode());
//            begin.setNextNode(node);

        }
        size++;
    }

    @Override
    public void add(int index, E element){

        if(index < size) {
            node = getNode(index - 1);
            nodeNext = new Node<E>(element, node.getNextNode());
            node.setNextNode(nodeNext);
            size++;
        }
    }

    @Override
    public Iterator<E> iterator() {

        node = begin;
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {

                if(node.getNextNode() == null){
                    return false;}
                else {
                    return true;}
            }
            @Override
            public E next() {
                if(hasNext() == true){
                    node = node.getNextNode();
                }
                return node.getElement();
            }
        };
    }

    @Override
    public void clear(){

       node = begin;
       node = node.getNextNode();

       for (int i = 0; i < size; i++) {
           nodeNext= node.getNextNode();

           node.setElement(null);
           node.setNextNode(null);
           node = nodeNext;
       }

       begin.setNextNode(null);
       size = 0;
   }


    @Override
    public E get(int index){

        node = getNode(index);
        return node.getElement();

    }


    @Override
    public int index(E element){

        node = begin;
        node = node.getNextNode();
        int i = 0;
        while (node.getElement() != element ) {
            node = node.getNextNode();
            i++;
        }

        return i;
    }
    @Override
    public E remove(int index){

        E element;
        node = getNode(index - 1);
        nodeNext = node.getNextNode();
        node.setNextNode(nodeNext.getNextNode());
        element = nodeNext.getElement();
        nodeNext.setElement(null);
        nodeNext.setNextNode(null);
        size--;
        return element;
    }

    @Override
    public E set( int index, E element){

        node = getNode(index);
        E prevEl = node.getElement();
        node.setElement(element);
        return prevEl;
    }

    @Override
    public int size(){

        return size;
      }


    public <E> E[] toArray(){

        Object[] arr = new Object[size];
        node = begin;
        node =  node.getNextNode();
        for (int i = 0; i < size; i++){
            arr[i] = node.getElement();
            node =  node.getNextNode();
        }
        return (E[])arr;
    }

    @Override
    public String toString(){

        node = begin;
        String outPut ="";
        for (int i = 0; i < size; i++) {
            node = node.getNextNode();
            outPut = outPut  +  node.getElement();
            if (i < size -1){
                outPut = outPut+ ", ";
            }
        }
        return "MyLinkedList{" +
                outPut +
                '}';
    }
}
