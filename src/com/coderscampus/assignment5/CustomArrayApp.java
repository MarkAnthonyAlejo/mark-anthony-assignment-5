package com.coderscampus.assignment5;

public class CustomArrayApp {
    public static void main(String[] args) {
        CustomList<String> customList = new CustomArrayList();

        for(int i = 1; i < 20; i++) {
            customList.add("Item " + i);
        }

        for (int i = 0; i < customList.getSize(); i++) {
            System.out.println(customList.get(i));
        }

    }
}
