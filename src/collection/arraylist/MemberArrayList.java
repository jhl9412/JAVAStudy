package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member1;

public class MemberArrayList {
    
    private ArrayList<Member1> arrayList;
    
    public MemberArrayList() {
        arrayList = new ArrayList<Member1>();
    }

    public void addMember(Member1 member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {
        for(int i = 0; i < arrayList.size(); i++){
            Member1 member = arrayList.get(i);
            int tempId = member.getMemberId();
            if(tempId == memberId) {
                arrayList.remove(i);
                return true;
            }
        }

        Iterator<Member1> ir = arrayList.iterator();
        while(ir.hasNext()){
            Member1 member = ir.next();
            int tempId = member.getMemberId();
            if(tempId==memberId){
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for(Member1 member : arrayList){
            System.out.println(member);;
        }
        System.out.println();
    }

    public void insertMember(Member1 member, int position) {
		if(position <1 || position > arrayList.size()+1) {
			System.out.println("지정 된 자리에 추가할 수 없습니다");
			return;
		}
		arrayList.add(position-1, member);
       
	}
}
