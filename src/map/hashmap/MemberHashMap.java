package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member1;

public class MemberHashMap {
    
    private HashMap<Integer,Member1> hashMap;
    
    public MemberHashMap() {
        hashMap = new HashMap<Integer, Member1>();
    }

    public void addMember(Member1 member) {
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId){
        
        if(hashMap.containsKey(memberId)){
            hashMap.remove(memberId);
            return true;
        }
        
        System.out.println(memberId + "가 존재하지 않습니다");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while (ir.hasNext()){
            int key = ir.next();
            Member1 member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
