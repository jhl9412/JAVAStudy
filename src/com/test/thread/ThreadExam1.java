package com.test.thread;

class ExamClass implements Runnable{

    @Override
    public void run() { //thread 처리해줄 명령어
        for (int i=0; i<30; i++){
            try {
                Thread.sleep(1000);
                System.out.println("Thread1이 실행");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
            
    }
}
public class ThreadExam1 {

    public static void main(String[] args) {
         
        Thread thread = new Thread(new ExamClass());
        thread.start(); //Thread 클래스로 선언한 thread를 background에서 시작한다.
        // 

        for (int i=0; i<30; i++){
            try {
                Thread.sleep(500);
                System.out.println("Thread2가 실행");
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        
        }
        System.out.println("Ang");
        // 출력결과 main이 끝나고 "Ang"을 출력한 후에도 background에서
        //run method를 계속 수행하는 것을 확인할 수 있다.
        
    }
}
