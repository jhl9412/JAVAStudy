package com.test.exam01;
/* static으로 선언된 것은 프로그램이 끝날 때까지 메모리에 계속 저장되어 있음.
전역변수 -> Heap 지역변수 -> Stack 
<final keyword>
선언 및 초기화 이후 Method Area에 저장. constant 풀이라는 공간에 저장됨.
지역변수 -> final itn a = 3 : 상수선언 상수이기 때문에 선언 이후 값을 변경하면 에러가 뜸.
메소드 -> 오버라이딩을 못함
클래스 -> 상속 못함
클래스 멤버변수 -> static 예약어와 같이 사용.
*/
class Number{

    static int a = 0;
    int b = 0;

    static void print() {  
        System.out.println("static method test !!");
    }

    void print1(){
        System.out.println("instance method test !!");
    }
}
/* 
public class StaticExam {
    public static void main(String[] args) {
        
        Number number1 = new Number();
        Number number2 = new Number();

        number1.a = 1;
        number1.b = 1;

        System.out.println(number2.a + " " + number2.b);

        Number.print();   // 별도의 인스턴스를 생성하지 않고 Number 클래스의 메서드를 실행
        number1.print1(); // 인스턴스를 생성하고 메서드 실행

        

    }

}
 */
