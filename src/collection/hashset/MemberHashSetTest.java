package collection.hashset;

import collection.Member1;

public class MemberHashSetTest {
    
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member1 memberLee = new Member1(1001, "이지원");
        Member1 memberSon = new Member1(1002, "손민국");
        Member1 memberPark = new Member1(1003, "박서훤");
        
        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberSon);
        memberHashSet.addMember(memberPark);
        memberHashSet.showAllMember();

        Member1 memberHong = new Member1(1003,"홍길동");
        memberHashSet.addMember(memberHong);
        memberHashSet.showAllMember();
    }
}
