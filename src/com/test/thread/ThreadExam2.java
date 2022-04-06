package com.test.thread;

class ExamClass2 extends Thread{

    @Override
    public void run(){
        try {
            for(int i=0;i<30;i++){
            Thread.sleep(1000);
            System.out.println("Thread1이 실행");
            }
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }

    }
}
// 이 형태의 단점 상속받은 것을 사용하기 때문에 다른 클래스를 상속받을 수 없다.
// 자바에서는 인터페이스와 다르게 다중 상속이 불가능하다. 그렇지만 실제로
// 다중 상속을 많이 사용하고 있지는 않다.
public class ThreadExam2 {

    public static void main(String[] args) {
        
        ExamClass2 examClass2 = new ExamClass2();
        examClass2.start();

        for(int i=0;i<30;i++){
            try {
                Thread.sleep(1000);
                System.out.println("Thread2가 실행");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
