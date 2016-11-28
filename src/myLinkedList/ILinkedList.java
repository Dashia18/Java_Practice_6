package myLinkedList;

import java.lang.Iterable;

/**
 * Created by Daria Serebryakova on 25.11.2016.
 */
public interface ILinkedList<E> extends Iterable {
    public void add(E element);
    public void add(int index, E element);
    public void clear();
    public E get(int index);
    public int index(E element);
    public E remove(int index);
    public E set( int index, E element);
    public int size();
    public <E> E[] toArray();
    public String toString();

}
