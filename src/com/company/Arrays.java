package com.company;

public class Arrays {
    private int[] items;
    private int count;

    public Arrays(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (count == items.length) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) newItems[i] = items[i];
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException("Index not found!");
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (item == items[i])
                return i;
        return -1;
    }

    public int size() {
        return count;
    }

    public void print() {
        for (int i = 0; i < count; i++) System.out.println(items[i]);
    }
}
