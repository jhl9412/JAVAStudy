package collection.treeset;

import collection.Member1;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member1 memberLee = new Member1(1001, "이지원");
        Member1 memberSon = new Member1(1002, "손민국");
        Member1 memberPark = new Member1(1003, "박서훤");
        
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberSon);
        memberTreeSet.addMember(memberPark);
        memberTreeSet.showAllMember();

        Member1 memberHong = new Member1(1003,"홍길동");
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();
    }
}
