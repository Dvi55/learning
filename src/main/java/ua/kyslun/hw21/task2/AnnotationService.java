package ua.kyslun.hw21.task2;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.*;

public class AnnotationService {
    //scan all classes and create instances of those
    //classes that are annotated with @Service.
    //Put all these objects into a map, where
    //the key will be the name of the class and the value will be the object of that class.
    //Return the map.
    public static void main(String[] args) throws Exception {
        String rootPackage = "ua.kyslun.hw21"; // Замініть на кореневий пакет вашого проєкту

        Map<String, Object> services = scanAndInstantiateServices(rootPackage);
        initializeFields(services);
        initializeMethods(services);

        for (Map.Entry<String, Object> entry : services.entrySet()) {
            String className = entry.getKey();
            Object instance = entry.getValue();
            System.out.println("Loaded class: " + className + ", Instance: " + instance);
        }
    }

    public static Map<String, Object> scanAndInstantiateServices(String rootPackage) throws Exception {
        Map<String, Object> services = new HashMap<>();

        List<Class<?>> classes = scanClasses(rootPackage);

        for (Class<?> clazz : classes) {
            if (clazz.isAnnotationPresent(Service.class)) {
                Object instance = instantiateClass(clazz);
                services.put(clazz.getName(), instance);
            }
        }

        return services;
    }

    private static List<Class<?>> scanClasses(String packageName) throws Exception {
        List<Class<?>> classes = new ArrayList<>();

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = classLoader.getResources(path);

        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            File file = new File(resource.getFile());
            scanClassesAndFiles(file, packageName, classes);
        }

        return classes;
    }

    private static void scanClassesAndFiles(File directory, String packageName, List<Class<?>> classes) throws ClassNotFoundException {
        if (!directory.exists()) {
            return;
        }
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    scanClassesAndFiles(file, packageName + "." + file.getName(), classes);
                } else if (file.getName().endsWith(".class")) {
                    String className = packageName + '.' + file.getName().substring(0, file.getName().length() - 6);
                    Class<?> clazz = Class.forName(className);
                    classes.add(clazz);
                }
            }
        }
    }

    private static Object instantiateClass(Class<?> clazz) throws Exception {
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        return constructor.newInstance();
    }

    private static void initializeMethods(Map<String, Object> services) throws Exception {
        for (Map.Entry<String, Object> entry : services.entrySet()) {
            Object instance = entry.getValue();
            Class<?> clazz = instance.getClass();

            for (Method method : clazz.getDeclaredMethods()) {
                if (method.isAnnotationPresent(Init.class)) {
                    method.setAccessible(true);
                    method.invoke(instance);
                }
            }
        }
    }

    private static void initializeFields(Map<String, Object> services) throws Exception {
        for (Map.Entry<String, Object> entry : services.entrySet()) {
            Object instance = entry.getValue();
            Class<?> clazz = instance.getClass();

            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(Value.class)) {
                    field.setAccessible(true);
                    Value valueAnnotation = field.getAnnotation(Value.class);
                    String value = valueAnnotation.value();
                    field.set(instance, value);
                }
            }
        }
    }
}

