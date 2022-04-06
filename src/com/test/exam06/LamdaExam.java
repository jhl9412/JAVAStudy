package com.test.exam06;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


@FunctionalInterface
interface MyLamdaFunction {
    int sum(int a, int b);
}

@FunctionalInterface
interface MyPrint {
    String printLamda();
}
public class LamdaExam {
    
    public static void main(String[] args) {
        // 람다식, 익명함수
        MyLamdaFunction lamdaFunction = (a, b) -> a+b;
        System.out.println(lamdaFunction.sum(3,4));
        
        MyPrint myPrint = ()->"Hello world 1";
        System.out.println(myPrint.printLamda());
        
        //Supplier : 매개변수 없이 반환값만을 갖는 함수형 인터페이스
        // 따로 인터페이스를 작성하지 않아도 되고 사용하고자 하는
        // 메소드는 .get()으로 이용.
        Supplier<String> supplier = ()->"Hello world 2";
        System.out.println(supplier.get()); 
        
        //Consumer : 객체 T를 매개변수로 받아서 사용. 반환값이 없는
        // 함수형 인터페이스
        Consumer<String> consumer = (str) ->System.out.println(str.split(" ")[0]);
        //split "" 사이의 문자를 기준으로 0번째 있는 문자.
        consumer.andThen(System.out::println).accept("Hello World"); 

        //Function : 객체 T를 매개변수로 받아서 처리한 후 R로 반환하는 함수형
        //인터페이스
        Function<String, Integer> function = str -> str.length();
        System.out.println(function.apply("Hello world"));

        //Predicate : 객체 T를 매개변수로 받아서 처리한 후 Boolean을 반환
        Predicate<String> predicate = (str)->str.equals("Hello world");
        System.out.println(predicate.test("Hi World"));

        //일반 참조형, 메소드 참조형, 생성자 참조형
        Function<String, Integer> function2 = String::length;
        System.out.println(function2.apply("Hello World"));

        Consumer<String> consumer2 = System.out::println;//앞부분이 class::뒷부분이 method
        consumer2.accept("Hello World 400");

        // Supplier<String> supplier1 = String::new;
       
    }
}
