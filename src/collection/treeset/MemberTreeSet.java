package collection.treeset;


import java.util.Iterator;
import java.util.TreeSet;

import collection.Member1;

public class MemberTreeSet {
    private TreeSet<Member1> treeSet;
    
    public MemberTreeSet() {
        treeSet = new TreeSet<Member1>();
    }
    
    public void addMember(Member1 member){
        treeSet.add(member);
    }
    
    public boolean removeMember(int memberId){
        Iterator<Member1> ir = treeSet.iterator();
        
        while(ir.hasNext()){
            Member1 member =ir.next();
            int tempId = member.getMemberId();
            if(tempId == memberId){
                treeSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다");
        return false;

    }

    public void showAllMember(){
        for(Member1 member : treeSet)
            System.out.println(member);
        System.out.println();
    }
}
