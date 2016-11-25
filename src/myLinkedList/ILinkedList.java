package myLinkedList;

/**
 * Created by Daria Serebryakova on 25.11.2016.
 */
public interface ILinkedList<E> extends Iterable {
    public void add(E element);
    public void add(int index, E element);
}
