package com.test.exam02;
/* 다형성 : 하나의 코드가 여러 자료형으로 구현되어 실행되는 것.
=> 코드 하나로 공통된 기능을 수행하거나 다양한 기능 수행가능
확장성있고 유지보수하기 좋다.
*/
class Family{

    void hello() { System.out.println("안녕하세요."); }

}

class kimFamily extends Family{
    void hello() { System.out.println("김선생님 안녕하세요."); }
    void dinner() { System.out.println("식사나 한 번 하시죠."); }
    void drink() { System.out.println(" 곱창에 소주"); }

}

class parkFamily extends Family {
    void hello() { System.out.println("박선생님 안녕하세요.");}
    void fishing() { System.out.println("낚시엔 소주");}
}

public class PolymorphismExam {
 
    public static void main(String[] args) {
        
        Family kimF = new kimFamily();
        kimF.hello();
        Family parkF = new Family(); 
        parkF.hello();

    }

}
