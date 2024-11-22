package org.Java.oopsadv;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class CustomAnnotations {
    public static void main(String[] args) {
        @marker
        int value=10;

       Class<CustomAnnotations> list= CustomAnnotations.class;

       if(list.isAnnotationPresent(marker.class)){
           System.out.println("nfwenf ");
       }

    }
}

//marker annotations
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Single{

}

//single annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.LOCAL_VARIABLE)
@interface marker{
    int count() default 1;
}

//full annotations

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface full{
    int count() default 1;
    String value() default "something";

}