package CombinationTwoSortLink_17;

import java.util.Comparator;

class Node{
	Object obj;
	Node next;
	public Node(Object obj,Node next){
		this.obj=obj;
		this.next=next;
	}
}

public class CombinationTwoSortLink implements Comparator<Object>{

	private Node node1Head=null;
	private Node node2Head=null;
	
	public CombinationTwoSortLink(){
		Node p=null;
		//node1Head 链表
		for(int i=1;i<10;i=i+2){
			if(node1Head==null){
				node1Head=new Node(i,null);
				p=node1Head;
			}else{
				p.next=new Node(i,null);
				p=p.next;
			}
		}
		//node2Head 链表
		for(int i=2;i<20;i=i+2){
			if(node2Head==null){
				node2Head=new Node(i,null);
				p=node2Head;
			}else{
				p.next=new Node(i,null);
				p=p.next;
			}
		}
	}
	//重写compare方法
	@Override
	public int compare(Object o1, Object o2) {
		int result;
		int o1int=(int)o1;
		int o2int=(int)o2;
		if(o1int>o2int){
			result=1;
		}else if(o1int==o2int){
			result=0;
		}else{
			result=-1;
		}
		return result;
	}
	public static void main(String[] args) {
		CombinationTwoSortLink ctsl=new CombinationTwoSortLink();
		Node head=null;
		Node headRef=null;
		//首先确定用哪个链表当头
		if(ctsl.compare(ctsl.node1Head.obj, ctsl.node2Head.obj)==1){
			head=ctsl.node2Head;
			headRef=ctsl.node1Head;
		}else{
			head=ctsl.node1Head;
			headRef=ctsl.node2Head;
		}
		//中间变量，来控制head的移动
		Node headBuf=head;
		while(headBuf.next!=null || headRef!=null){
			//obj1>obj2 
			//如果两个链表都有数据，则需要比较，如果两个链表中有一个链表没了数据 则直接退出
			if(headBuf.next==null){
				headBuf.next=headRef;
				break;
			}
			//如果是参考链表为空 则直接退出程序
			if(headRef==null){
				break;
			}
			
			if(ctsl.compare(headBuf.next.obj, headRef.obj)==1){
				Node p=headBuf.next;//下一个节点保存
				headBuf.next=headRef;
				headRef=headRef.next;
				headBuf.next.next=p;
				headBuf=headBuf.next.next;
			}else{
				headBuf=headBuf.next;
			}
		}
		while(head!=null){
			System.out.print(head.obj);
			head=head.next;
		}
	}


}
