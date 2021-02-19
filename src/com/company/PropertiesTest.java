package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("color", "red");
        props.setProperty("width", "300");
        listPropertiers(props);
        props.setProperty("color", "blue");
        save(props);
        props.clear();
        System.out.println("\nAfter clear:\n ");
        listPropertiers(props);
        load(props);
        System.out.printf("%nThe property color is %s%n", props.getProperty("color"));
    }

    private static void save(Properties props) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("properties.dat");
            props.store(fileOutputStream, "Sample Propertiers");
            fileOutputStream.close();
            System.out.println("After saving propertiers");
            listPropertiers(props);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void load(Properties props) {
        try {
            FileInputStream fileInputStream = new FileInputStream("properties.dat");
            props.load(fileInputStream);
            fileInputStream.close();
            System.out.println("After load properties");
            listPropertiers(props);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void listPropertiers(Properties props) {
        Set<Object> setKey = props.keySet();
        setKey.forEach(key -> System.out.printf("%s\t%s%n", key, props.get(key)));
    }

}
