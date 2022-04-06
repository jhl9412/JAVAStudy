package com.test.exam01;

import java.util.Arrays;

public class ForExam {
    
    public static void main(String[] args) {
        System.out.println("Integer Size = " + Integer.SIZE);  
        System.out.println("Byte size = " + Byte.SIZE);  
        System.out.println("Short size = " + Short.SIZE); 

        System.out.println("Long Size = "+ Long.SIZE);
        System.out.println("Float Size = " + Float.SIZE);
        System.out.println("Double Size = " + Double.SIZE);
    // Integer -> wrapper class라고 한다. 문자변환, 형변화, 배열의 출력 등 활용도가 높다.
    
        int[] a = {1,2,3,4,5,6};
        String[] str = new String[]{"kim", "park", "lee"};

        for (int i=0; i<a.length; i++)
            System.out.print(a[i]+ "\t");

        System.out.println("");

        for (String s:str) 
            System.out.print(s + "\t");
    
        System.out.println(Arrays.toString(str)); // 오류 즉시 수정에서 import를 자동 생성할 수 있다.

        //1
        int sum = 0;
        for(int i=1; i<=100; sum+=i++);
        System.out.println("\n" + "#1 sum = " + sum);

        //2  이 형태의 로직을 가장 많이 사용.
        int i = 1;
        sum = 0;
        while(true){
            sum += i++;
            if(i>100) break;
        }
        System.out.println("#2 sum = " + sum);

        //3
        i =1; sum = 0; // 위에 이미 변수 선언.

        while(i<=100) sum += i++;
        System.out.println("#3 sum = " + sum);

        //4
        i=1; sum = 0;
        while(true){
            sum += i++;
            if(i<=100) continue;
            else break;
        }
        System.out.println("#4 sum = " + sum);

        //5 do-while vvvvvvvvvvvvvvvvvvvvvvvvvvv
        i = 1; sum = 0;
        do{
            sum += i++;
            
        }while(i<=100);
        System.out.println("#5 sum = " + sum);
    }
}
