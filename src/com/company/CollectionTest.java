package com.company;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {
        String[] colors = {"RED", "MAGENTA", "GREEN", "BLUE", "CYAN"};
        List<String> list = new ArrayList<>();

        for(String color : colors)
            list.add(color);

        List<String> listRemove = Arrays.asList("RED", "GREEN");

//        listRemove.add(1,"YELLOW");

        System.out.println("Array List: ");

        for(int i = 0; i < list.size(); i++)
            System.out.printf("%s ", list.get(i));

        removeColors(list, listRemove);

        System.out.printf("%n%nArrayList after removeColors:%n");

        list.forEach(i -> System.out.printf("%s ", i));

    }

    private static void removeColors(Collection<String> collection, Collection<String> collectionRemove) {
        Iterator<String> iterator = collection.iterator();
//        collection.remove("RED"); -> irá causar ConcurrentModificationException

        while(iterator.hasNext())
            if(collectionRemove.contains(iterator.next()))
                iterator.remove();
    }


}
