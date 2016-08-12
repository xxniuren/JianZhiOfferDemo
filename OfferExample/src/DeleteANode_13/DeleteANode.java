package DeleteANode_13;
/*
 * 题目：给定一个单向链表  和一个要删除的目标节点指针，尝试O(1)的时间复杂度来删除一个节点
 */

class Node{
	Object obj;
	Node next;
	public Node(Object obj,Node next){
		this.obj=obj;
		this.next=next;
	}
}
public class DeleteANode {
	Node head=null;
	Node deleteNode=null;
	public DeleteANode(){
		Node p=null;
		for(int i=0;i<10;i++){
			if(head==null) {
				p=head=new Node(i,null);
			}
			else if(i==5){
				p.next=new Node(i,null);
				p=p.next;
				deleteNode=p;
			}else{
				p.next=new Node(i,null);
				p=p.next;
			}
		}
	}

	public static void main(String[] args) {
		DeleteANode dan=new DeleteANode();
		//首先判断链表头和要删除的节点是否是空节点
		if(dan.head==null || dan.deleteNode==null){
			System.out.println("链表头和要删除的节点为空，无法执行删除操作");
		}
		//判断要删除的节点是否是尾节点
		if(dan.deleteNode.next==null){
			Node p=dan.head;
			while(p.next!=dan.deleteNode){
				p=p.next;
			}
			p.next=null;
		}
		//如果只有一个节点
		if(dan.head.next==null){
			dan.head=null;
		}
		//如果节点在中间
		if(dan.deleteNode.next!=null){
			dan.deleteNode.obj=dan.deleteNode.next.obj;//拷贝数据
			dan.deleteNode.next=dan.deleteNode.next.next;//
		}
		
		@SuppressWarnings("unused")
		int k=0;
	}

}
