package com.test.exam02;
// 상속 관계에 있는 클래스의 인스턴스 생성 과정

class Parents {
// 생성자는 클래스의 전역(멤버)변수를 초기화시킨다. int - 0 char - null
// 생성자는 클래스의 인스턴스가 생성될 때 가장 먼저 실행되어
// 생성자 내에 기술된 명령문을 실행한다.     
// this.전역변수 - 해당 클래스 / super.전역변수 - 상위 클래스
// 프로그램이 실행되면 가장 먼저 main이 실행. -> Child 생성자 ->
// super -> Parents 생성자의 this -> Parents(int i) 실행 ->
// Parents() 실행 -> Child() 실행
// 인스턴스가 생성되면 참조변수와 인스턴스의 주소값이 연결.
// 상속의 경우 상위 클래스의 인스턴스 주소값이 하위 클래스에도 연결.
// -> 메모리를 더 효율적으로 사용할 수 있다.
    Parents(){
        this(1); // this. 은 자기 자신을 가리키는 참조변수이고,
        // this() 는 인자 1개를 받는 생성자를 호출.
        
        System.out.println("인자가 없는 Parents class의 생성자");
    }

    Parents(int i){  
        System.out.println("인자가 1개인 Parents class의 생성자"+ i);
    }
    
}

class Child extends Parents {
    
    int c1;
    int c2;

    Child(int c1, int c2){
        this.c1 = c1; // R.value의 c1 은 입력받는 변수
        this.c2 = c2;
    }
    
    Child(){
        super();// 부모 클래스의 생성자를 호출. 
        // super를 통해 실행의 순서를 정할 수 있다.
    //  super(1);  Parents(int i) 생성자를 호출.
    // 하위 클래스의 생성자는 상위 클래스의 생성자를 먼저 호출한다.
    // 상속할 인스턴스가 필요하니까
        System.out.println("인자가 없는 Child class의 생성자");
    }

}
public class InheritanceExam2 {
    
    public static void main(String[] args) {
        Child child = new Child(2,3);
        System.out.println("Child class의 전역변수 : " + child.c1 + ", "+ child.c2);
    }
}
