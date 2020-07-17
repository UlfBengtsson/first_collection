package org.example.models;

import java.util.Arrays;

public class MyList<T> {
    private T[] internalArray = (T[]) new Object[0];

    public boolean add(T element) {
        if (element == null) {
            return false;
        }

        internalArray = Arrays.copyOf(internalArray, internalArray.length +1 );
        internalArray[internalArray.length -1] = element;
        return true;
    }

    /**
     * Will only remove one element from the list.
     * @param element to be removed (one).
     * @return was removed or not.
     */
    public boolean remove(T element) {
        if (element == null) {
            return false;
        }
        for (int i = 0; i < internalArray.length; i++) {
            if (element.equals(internalArray[i])) {
                for (int j = i + 1; j <internalArray.length; j++, i++) {
                    internalArray[i] = internalArray[j];
                }
                internalArray = Arrays.copyOf(internalArray, internalArray.length -1 );
                return true;
            }
        }
        return false;
    }

    public T getByIndex(int index) {
        if (index < 0 || index >= internalArray.length) {
            return null;
        }
        return internalArray[index];
    }

    /**
     * Try to find what index of the element is
     * @param element to find the index
     * @return returns the index of the given element or will return -1 it its null or -2 if it did not find it.
     */
    public int indexOf(T element) {
        if (element == null) {
            return -1;
        }
        for (int i = 0; i < internalArray.length; i++) {
            if (element.equals(internalArray[i])) {
                return i;
            }
        }
        return -2;
    }

    public T[] toArray() {
        return Arrays.copyOf(internalArray, internalArray.length);
    }

    public int size() {
        return internalArray.length;
    }

}
