package shreyash;

import java.util.Arrays;
import java.util.Iterator;

public class OurGenericList<T> implements Iterable<T>{
    private T[] items;
    private int size;

    public T[] getItems() {
        return items;
    }

    public void setItems(T[] items) {
        this.items = items;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public OurGenericList() {
        size = 0;
        items = (T[]) new Object[100];
    }

    public void add(T item) {
        items[size++] = item;
    }

    public T getItemAtIndex(int index){
        return items[index];
    }


    @Override
    public Iterator<T> iterator() {
        return new OurGenericListIterator(this);
    }

    @Override
    public String toString() {
        return "OurGenericList{" +
                "items=" + Arrays.toString(items) +
                ", size=" + size +
                '}';
    }

    private class OurGenericListIterator implements Iterator<T>{

        private OurGenericList<T> list;
        private int index = 0;

        public OurGenericListIterator(OurGenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
//            System.out.println("has next called");
            return index < list.size;
        }

        @Override
        public T next() {
//            System.out.println("next called");
            return list.items[index++];
        }
    }
}
