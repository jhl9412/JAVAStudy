/* package com.test.exam05;

class A{

    private int a;
    private int b;  //실무에서는 보통 멤버 변수를 private 처림
    static int c; //static변수는 모든 인스턴스에서 공통으로 사용
    //  static .. 컴파일시 코드 및 데이터 영역이 생성되고
    //프로그램 종료시까지 데이터가 유지된다.
    A(){
        System.out.println("A 클래스가 생성");
    } // 생성자가 없을 때 컴파일시 자동으로 생성
    A(int a, int b){
        this.a = a;
        this.b = b;
        c= bb(a,b);
    }

    void aa(){
        System.out.println("A클래스의 aa메소드");
    }
    int bb(int i, int j){
        return i + j;
    } */
 /*    int getA (){
        return 0;
    }
    void setA (int a, int b){
        this.a = a;
        this.b = b;
    }
     */
/* }

abstract class C { // 부모 클래스
    int a;
    int b;

    void cc(){
        System.out.println("C클래스");
    }

    abstract void cc1();
    
}
class D extends C{   //자식 클래스 
    int d;
    int e;
    
    void dd(){
        System.out.println("d클래스의 dd 메소드");
    }
  @Override //안써도 에러가 안나는 경우가 있는데 날 수도 있으니까
    // annotation - 컴파일러에게 이건 무엇이다라고 안내해주는 역할
    void cc1(){
        System.out.println("overriding d클래스");
    }
} 

interface E { // 설계도
    void ee1();
    void ee2();
}

class F implements E{

    @Override
    public void ee1() {
        System.out.println("클래스 F ee1 method");
    }

    @Override
    public void ee2() {
        System.out.println("클래스 f의 ee2 method");    
    }


}

class G{  //일반적인 class는 static으로 선언하지 못하지만 내부 클래스는 가능.

    static class GG{ // 외부 클래스에서 method를 static 선언하지 않아도
        // 내부 클래스를 static 선언하면 내부 클래스의 메소드를 따로 static
        // 선언하지 않아도 static 메소드로 사용이 가능
        // class 내부에 그룹화해서 정리하기 위해 사용하지만 그렇게 많이 사용하지는
        // 않는다. 내부 클래스는 패스..?
        int i = 0;
        void gg() {
            System.out.println("static method");
        }
    }
}




public class Exam05 {
    public static void main(String[] args) { 
       
        
        A a = new A();
        a.aa();
        System.out.println(a.bb(1,2));

        A aa = new A(3,4);
        System.out.println(aa.c);
        System.out.println(a.c);

        D d = new D();
        d.cc1();

        F f = new F();
        f.ee1();
        f.ee2();

        new A();
        G.GG g = new G.GG(); //내부클래스의 메소드를 사용하기 위해서는
        // 내부클래스로 형을 선언해줘야한다. G.GG - G클래스 내부의 GG 클래스
        g.gg();
    }

}
 */