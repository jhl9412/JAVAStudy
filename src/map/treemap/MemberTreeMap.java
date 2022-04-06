package map.treemap;

import java.util.TreeMap;
import java.util.Iterator;

import collection.Member1;

public class MemberTreeMap {
    private TreeMap<Integer,Member1> treeMap;
    
    public MemberTreeMap() {
        treeMap = new TreeMap<Integer, Member1>();
    }

    public void addMember(Member1 member) {
        treeMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId){
        
        if(treeMap.containsKey(memberId)){
            treeMap.remove(memberId);
            return true;
        }
        
        System.out.println(memberId + "가 존재하지 않습니다");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = treeMap.keySet().iterator();
        while (ir.hasNext()){
            int key = ir.next();
            Member1 member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
