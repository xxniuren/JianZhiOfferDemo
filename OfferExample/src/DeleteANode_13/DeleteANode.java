package DeleteANode_13;
/*
 * ��Ŀ������һ����������  ��һ��Ҫɾ����Ŀ��ڵ�ָ�룬����O(1)��ʱ�临�Ӷ���ɾ��һ���ڵ�
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
		//�����ж�����ͷ��Ҫɾ���Ľڵ��Ƿ��ǿսڵ�
		if(dan.head==null || dan.deleteNode==null){
			System.out.println("����ͷ��Ҫɾ���Ľڵ�Ϊ�գ��޷�ִ��ɾ������");
		}
		//�ж�Ҫɾ���Ľڵ��Ƿ���β�ڵ�
		if(dan.deleteNode.next==null){
			Node p=dan.head;
			while(p.next!=dan.deleteNode){
				p=p.next;
			}
			p.next=null;
		}
		//���ֻ��һ���ڵ�
		if(dan.head.next==null){
			dan.head=null;
		}
		//����ڵ����м�
		if(dan.deleteNode.next!=null){
			dan.deleteNode.obj=dan.deleteNode.next.obj;//��������
			dan.deleteNode.next=dan.deleteNode.next.next;//
		}
		
		@SuppressWarnings("unused")
		int k=0;
	}

}
