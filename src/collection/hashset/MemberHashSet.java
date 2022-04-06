package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member1;

public class MemberHashSet {
    private HashSet<Member1> hashSet;
    
    public MemberHashSet() {
        hashSet = new HashSet<Member1>();
    }
    
    public void addMember(Member1 member){
        hashSet.add(member);
    }
    
    public boolean removeMember(int memberId){
        Iterator<Member1> ir = hashSet.iterator();
        
        while(ir.hasNext()){
            Member1 member =ir.next();
            int tempId = member.getMemberId();
            if(tempId == memberId){
                hashSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다");
        return false;

    }

    public void showAllMember(){
        for(Member1 member : hashSet)
            System.out.println(member);
        System.out.println();
    }
}
