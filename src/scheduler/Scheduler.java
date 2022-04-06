package scheduler;
/* 인터페이스(Interface) : 클래스가 제공하는 기능을 명시적으로 선언
- 인터페이스는 추상 메서드와 상수로만 구성.
- abstract, final 예약어를 사용하지 않아도
자동으로 추상 method, 상수로 변환된다.
- 인터페이스의 역할은 어떤 기능의 method을 구현할 것인지
명시하는 것 
- 인터페이스도 상속이 가능하나 이를 구현하는 class는 
상속받은 모든 추상 method를 구현해야 한다.
- Default method / Static method
default void exam() {} / static void exam() {}
default와 static method는 일반 method와 똑같이 구현하면 된다.
다만, default method의 경우 static과 다르게 재정의가 가능하다.
앞서 다룬 추상 클래스 / overridng 참고.
*/


public interface Scheduler {
// implements -> 인터페이스에 선언한 기능을 클래스가 구현한다.
    public void getNextCall();
    public void sendCallToAgent();
// getNext와 sendCall이라는 기능을 쓰겠다고 명시.
}

