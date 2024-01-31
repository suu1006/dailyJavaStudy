package com.example.dailystudy.reflection;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) {
        Method[] declaredMethods = Service.class.getDeclaredMethods();
        for(Method method : declaredMethods) {
            PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
        }

        //printLine(printAnnotation);


    }

    public static void printLine(PrintAnnotation printAnnotation) {
        if(printAnnotation != null) {
            int number = printAnnotation.number();
        }
    }
}
