package org.example.singletonpattern;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors =
                    EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {

                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton)
                        constructor.newInstance();

                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());

    }
}