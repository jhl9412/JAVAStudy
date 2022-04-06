package collection.arraylist;

import collection.Member1;

public class MemberArrayListTest {
    
    public static void main(String[] args) throws ArrayStoreException{
        
        MemberArrayList memberArrayList  = new MemberArrayList();

        Member1 memberLee = new Member1(1001, "이지원");
        Member1 memberSon = new Member1(1002, "손민국");
        Member1 memberPark = new Member1(1003, "박서훤");
        Member1 memberHong = new Member1(1004, "홍길동");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberSon);
        memberArrayList.addMember(memberPark);
        memberArrayList.addMember(memberHong);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(memberHong.getMemberId());
        memberArrayList.showAllMember();

        memberArrayList.insertMember(memberHong,4);
        memberArrayList.showAllMember();

        
    }
}
