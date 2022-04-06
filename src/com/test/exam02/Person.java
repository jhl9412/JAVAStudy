package com.test.exam02;
/*전역변수(멤버변수) 초기화하는 법 
1. 생성자를 이용
2. getter/setter 메소드 이용
3. Build Pattern*/
public class Person {
    

    private String name;
    private int age;
    private String gender;


    public Person(){} // -> 기본 생성자 default값
    public Person(String name, int age, String gender){

        this.name= name; // 현재 클래스의 전역변수를 가리킴.
        this.age = age;
        this.gender=gender;
    }
    // 생성자를 여러개 만들 수 있다.
        public Person(int age, String gender){
        this.age = age;
        this.gender = gender;

    }
    // getter 메소드 => eclipse 에서는 자동 생성 기능이 있다. <Alt+Shift+S>
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    // setter 메소드
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public void smile(){ System.out.println("웃어요"); }  // method
    public void anger(){ System.out.println("배고파 "); }

    
}
