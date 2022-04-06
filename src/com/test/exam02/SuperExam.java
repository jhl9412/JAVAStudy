package com.test.exam02;

class Point {

    int x=10, y= 20;

    Point(){}
    Point(int x){
        this.x = x;
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {

    int z = 30;

    Point3D(){
        this(100,200,300);
    }
    Point3D(int x){
        super(x);
    }
    Point3D(int x, int y){
        super(x,y);
    }
    Point3D(int x,int y, int z){
        super(x, y);  // x,y 값으로 상위클래스 생성자 호출.
        this.z = z;
    }
}

public class SuperExam {
    public static void main(String[] args) {
        Point3D point3d_1 = new Point3D();
        Point3D point3d_2 = new Point3D(1);
        Point3D point3d_3 = new Point3D(1,2);
        Point3D point3d_4 = new Point3D(1,2,3);

        System.out.println("(x,y,z)=("+point3d_1.x+","+point3d_1.y+","+point3d_1.z+")");
        System.out.println("(x,y,z)=("+point3d_2.x+","+point3d_2.y+","+point3d_2.z+")");
        System.out.println("(x,y,z)=("+point3d_3.x+","+point3d_3.y+","+point3d_3.z+")");
        System.out.println("(x,y,z)=("+point3d_4.x+","+point3d_4.y+","+point3d_4.z+")");
    }
}
