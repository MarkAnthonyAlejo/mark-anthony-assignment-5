package com.coderscampus.assignment5;


public class CustomArrayList<T> implements CustomList<T> {
    Object[] items = new Object[10];
    private int size;

    @Override
    public boolean add(T item) {
        if(size == items.length){
            resize();
        }
        items[size] = item;
        size++;
        return true;
    }

    @Override
    public int getSize(){
        return size;
    }

    @Override
    public T get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Oops index: " + index + "is out of bounds for size: " + size);
        }
        return (T) items[index];
    }

    private void resize(){
        Object[] newArray = new Object[items.length * 2];
        for (int i = 0; i < items.length; i++) {
            newArray[i] = items[i];
        }
        items = newArray;
    }

}
