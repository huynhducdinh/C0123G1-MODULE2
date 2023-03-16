package arrayList;

import module_2_apj.molel.Person;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 7;
    private E[] elements;

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size) {
        elements = (E[]) new Object[size];
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public void add(E element) {
        ensureCapacity();
        elements[size++] = element;
    }

    public boolean add(E e, int index) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapacity();
            for (int i = size - 2; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = e;
            return true;
        }
        return false;
    }

    public E[] remove(int index) {
        if (index >= 0 && index <= size) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
        }

        return elements;
    }

    public int size() {
        return size;
    }

    public E[] clone() {
        return elements;
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(o)) {
                return i;
            }
        }
        return index;
    }

    public boolean contains(E o) {
        return this.indexOf(o) <= 0;
    }

    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }



}



