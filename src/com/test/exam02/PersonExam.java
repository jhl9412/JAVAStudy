package com.test.exam02;

public class PersonExam {
    

    public static void main(String[] args) {
       
           
        /*
        Person person = new Person("이지훈");

        System.out.println(person.name);

        Person person1 = new Person(13,"male");
        System.out.println(person1.age + " " + person1.gender);
        
        
        System.out.println(person.age);//.(작성한 메소드 + 기본 제공 메소드)
         
        person.age = 50;
        System.out.println(person.age);

        Person person1 = new Person();
        System.out.println(person1.age);
                          // <캡슐화> 변수들끼리 영향을 주지 않는다.
        person.smile();   // person 클래스변수는 Stack 에 위치, name,age,method는 Heap에 위치
        person.anger();   // person2 클래스변수가 생기면 다른 name,age,method를 Heap에 할당  
                          // static 선언 -> 변수가 method area 에 위치하여 지워지지 않는다.
        */
        
        Person person = new Person();
        
        String name = "이지훈";  // 실무 영역에서 객체에 데이터를 받아와서 저장할 때 사용하는 로직.
        int age = 45; 
        String gender = "male";

        person.setName(name);
        System.out.println(person.getName());

        person.setAge(age);
        System.out.println(person.getAge());

        person.setGender(gender);
        System.out.println(person.getGender());
        
   
    }
}
