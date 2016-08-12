package CombinationTwoSortLink_17;

//剑指offer的实现方式
class Node1 implements Comparable<Object>{
	Object obj;
	Node1 next;
	public Node1(Object obj,Node1 next){
		this.obj=obj;
		this.next=next;
	}
	//比较函数
	@Override
	public int compareTo(Object o) {
		int result;
		int o1int=(int)o;
		int o2int=(int)obj;
		if(o1int>o2int){
			result=1;
		}else if(o1int==o2int){
			result=0;
		}else{
			result=-1;
		}
		return result;
	}
}

public class CombinationTwoSortLinkOffer {
	
/*	private Node1 pHead1=null;
	private Node1 pHead2=null;*/
	
	
	public Node1 MergeTwoSortLink(Node1 pHead1,Node1 pHead2){
		Node1 head=null;
		if(pHead1==null){
			head = pHead2;
			return head;
		}
		if(pHead2==null){
			head=pHead1;
			return head;
		}
		if(pHead1.compareTo(pHead2.obj)==-1){
			head=pHead1;
			head.next=MergeTwoSortLink(pHead1.next,pHead2);
		}
		else{
			head=pHead2;
			head.next=MergeTwoSortLink(pHead1,pHead2.next);
		}
		return head;
	}
	
	public static void main(String[] args) {

	}

}
