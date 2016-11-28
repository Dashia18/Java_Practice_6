package myLinkedList;

/**
 * Created by Daria Serebryakova on 28.11.2016.
 */
public class Node<E> {
    public Node(){


    }
    public Node(E element,Node nextNode){
        this.element = element;
        this.nextNode = nextNode;
    }

    public E getElement() {
        return element;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    private E element;
    private Node nextNode;
}
