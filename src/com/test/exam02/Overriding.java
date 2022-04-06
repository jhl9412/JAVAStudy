package com.test.exam02;

abstract class SalesPlan {

    public void companyGoal() {
        System.out.println("2022년 전체 부서 300억 목표 달성!!!");
    }
    public void manager(){};
    abstract public void departGoal();
    abstract public void product();

    final public void template(){
        companyGoal();
        manager();
        departGoal();
        product();
    }
}

class ATeam extends SalesPlan{
    @Override
    public void manager() {
        System.out.println("A팀 팀장 : 김철수");
    }
    @Override
    public void departGoal() {
        System.out.println("A팀 판매 목표 70억 달성!!!");
    }
    @Override
    public void product() {
        System.out.println("A팀 주력 상품은 TV입니다.");

    }
}

class BTeam extends SalesPlan{
    @Override
    public void manager() {
        System.out.println("B팀 팀장 : 김민수");

    }
    @Override
    public void departGoal() {
        System.out.println("B팀 판매 목표 100억 달성!!!");
    }
    @Override
    public void product() {
        System.out.println("A팀 주력 상품은 냉장고입니다.");

    }
}



public class Overriding {
    
    public static void main(String[] args) {
        
        ATeam ATeamSalesPlan = new ATeam();
        ATeamSalesPlan.template();
        System.out.println("");

        BTeam BTeamSalesPlan = new BTeam();
        BTeamSalesPlan.manager();
        BTeamSalesPlan.companyGoal();
        BTeamSalesPlan.departGoal();
        BTeamSalesPlan.product();
        System.out.println("");
    }
}
