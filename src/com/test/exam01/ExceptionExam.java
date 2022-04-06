package com.test.exam01;
/* 예외처리 ch14 487p
1. try - catch - fianally
2. throw new -> class 새로 만듬
3. throws
-Exception : IOException, Runtime Exception, FileNotException, ClassNotException, SQLEXception
등 종류가 많음.
 */
class ErrorTest{    

    public void errormaking() throws ArithmeticException {

        int a= 4/0;
        System.out.println("a = " + a);

    }

}

class FoolException extends Exception { }
 
 public class ExceptionExam {
   // throw new exception은 프로그램에서 강제로 예외를 발생시키는 구문.
    public void sayNickname(String nickname){ // 빠른 수정 사용
        if (nickname.equals("fool")){    //nickname 이 fool이면
            try {                       // try{오류 발생 예측 구간}
                throw new FoolException(); //강제로 예외를 만들고,
            } catch (FoolException e) {    //catch(처리할 예외 타입 e)
                // Exception 클래스는 checked exception으로 사용자가 직접 예외 처리해야한다.
                System.err.println("FoolException");  // catch 실행
            }
        }
        
        System.out.println("당신의 별명은 " + nickname + "입니다.");
    }
 
 
    public static void main(String[] args) {
    
        int c;
        try{
            c = 4/0; //예외가 발생하면 바로 catch로 빠짐
            
        } catch(ArithmeticException e){
            c = -1; // 예외 발생시 조치할 부분
        } finally { // 예외가 발생하더라도 실행시켜야 할 부분. 없어도 상관없음.
            System.out.println("다행" +
            "이다...");
        }

        System.out.println("c = " + c);
   
        //ErrorTest errorTest = new ErrorTest();
        //ErrorTest.errormaking();

    
        ExceptionExam exam = new ExceptionExam();
        exam.sayNickname("fool");
        exam.sayNickname("genius");


    }
}


