package LinkTableReverseClass16;

class Node{
	Object obj;
	Node next;
	public Node(Object obj,Node next){
		this.obj=obj;
		this.next=next;
	}
}
public class LinkTableReverseClass16 {
	//����ͷ������
	Node head=null;
	//��������
	public void creatLinkTable(int n){
		Node headBuff=null;
		for(int i=0;i<n;i++){
			if(head==null){
				head=new Node(i,null);
				headBuff=head;
			}else{
				headBuff.next=new Node(i,null);
				headBuff=headBuff.next;
			}
		}
	}
	//������ת
	public void reverseLinkTable(){
//		int i=0;
//		Node preNode=head;
//		Node currNode=preNode.next;
//		Node nextNode=currNode.next;
//		
//		while(nextNode.next!=null){
//			if(preNode==head){
//				preNode.next=null;	
//			}
//			currNode.next=preNode;
//			//����������  ˳��preNode  currNode nextNode
//			preNode=currNode;
//			currNode=nextNode;
//			nextNode=nextNode.next;
//			i++;
//		}
//		currNode.next=preNode;
//		
//		nextNode.next=currNode;
//		head=nextNode;
		Node pReversedHead=null;
		Node pNode=head;
		Node pPrev=null;
		while(pNode!=null){
			Node pNext=pNode.next;
			if(pNext==null){
				pReversedHead=pNode;
			}
			pNode.next=pPrev;
			pPrev=pNode;
			pNode=pNext;
		}
		while(pReversedHead!=null){
			System.out.print(pReversedHead.obj);
			pReversedHead=pReversedHead.next;
		}
	}
	
	public static void main(String[] args) {
		LinkTableReverseClass16 ltrc=new LinkTableReverseClass16();
		ltrc.creatLinkTable(7);
		ltrc.reverseLinkTable();
	}

}
