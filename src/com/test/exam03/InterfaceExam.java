package com.test.exam03;

interface Sales {

    public void manage();
    public void goal();
    public void product();
    
}

class A1Team implements Sales { // 빠른 수정 -> Ctrl+ .

    @Override
    public void manage() {
        System.out.println("A팀장입니다. 열심히 하겠습니다.");
        
    }

    @Override
    public void goal() {
        System.out.println("A팀은 올해 70억을 달성해보겠습니다.")  ;      
    }

    @Override
    public void product() {
        System.out.println("A팀은 TV를 판매하겠습니다.");
        
    }

}

class Bteam implements Sales {

    @Override
    public void manage() {
        System.out.println("B팀 팀장입니다. 열심히 하겠습니다.");
        
    }

    @Override
    public void goal() {
        System.out.println("B팀은 올해 100억 달성하겠습니다.");
        
    }

    @Override
    public void product() {
        System.out.println("B팀은 냉장고를 판매하겠습니다.");
        
    }

}


public class InterfaceExam {

    public static void main(String[] args) {
        
        A1Team aSalesPlan = new A1Team();
        aSalesPlan.manage();
        aSalesPlan.goal();
        aSalesPlan.product();

        Bteam bSalesPlan = new Bteam();
        bSalesPlan.manage();
        bSalesPlan.goal();
        bSalesPlan.product();
        
    }
}
