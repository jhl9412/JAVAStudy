package map.hashmap;

import collection.Member1;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member1 memberLee = new Member1(1001, "이지원");
        Member1 memberSon = new Member1(1002, "손민국");
        Member1 memberPark = new Member1(1003, "박서훤");
        Member1 memberHong = new Member1(1004, "홍길동");
        
        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberSon);
        memberHashMap.addMember(memberHong);
        memberHashMap.addMember(memberPark);
        memberHashMap.showAllMember();
        
        memberHashMap.removeMember(1004);
        memberHashMap.showAllMember();
    }
}
