package com.test.exam02;

/*상속(Inheritance)
A extends B A가 B를 상속한다. A->B. A가 B의 전역변수와 method 사용 가능.
*/
/* final class의 상속을 못 받음.
final class Fruit{

    int color;
    int taste;
    void pop(){ System.out.println("과일은 맛있다."); }
}
 */
class Fruit{

    int color;
    int taste;
    void pop(){ System.out.println("과일은 맛있다."); }
}

class Apple extends Fruit {

    int price;
    int perfume;
    void cut(){ System.out.println("사과를 자르다"); }
}
public class InheritanceExam {

    public static void main(String[] args) {
        
        Apple apple = new Apple();

        apple.pop();  // 부모 클래스의 method 이용

    }

}
