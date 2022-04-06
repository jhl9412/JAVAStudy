package map.treemap;

import collection.Member1;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member1 memberPark = new Member1(1003, "박서훤");
        Member1 memberSon = new Member1(1002, "손민국");
        Member1 memberHong = new Member1(1004, "홍길동");
        Member1 memberLee = new Member1(1001, "이지원");
        
        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberSon);
        memberTreeMap.addMember(memberHong);
        memberTreeMap.addMember(memberPark);
        memberTreeMap.showAllMember();
        
        memberTreeMap.removeMember(1004);
        memberTreeMap.showAllMember();
    }
}
