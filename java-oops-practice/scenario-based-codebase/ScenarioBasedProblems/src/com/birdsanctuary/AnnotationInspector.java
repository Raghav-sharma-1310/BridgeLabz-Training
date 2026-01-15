package com.birdsanctuary;

import java.lang.reflect.*;

public class AnnotationInspector {

    public static void inspectBird(Bird bird) {
        Class<?> cls = bird.getClass();

        if (cls.isAnnotationPresent(DeveloperInfo.class)) {
            DeveloperInfo info = cls.getAnnotation(DeveloperInfo.class);
            System.out.println("Developer: " + info.developer());
            System.out.println("Version: " + info.version());
        }

        // Reflection: detect abilities dynamically
        for (Method m : cls.getMethods()) {
            if (m.getName().equals("fly") || m.getName().equals("swim")) {
                try {
                    m.invoke(bird);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
