package LinkTableReverse;
/**
 * 
 * @author Administrator
 *	用递归来实现单链表从尾部到头部打印出文件
 */

class Node{
	Object obj;
	Node next;
	public Node(Object obj,Node next){
		this.obj=obj;
		this.next=next;
	}
}
//
public class LinkTableReverse {

	static Node head=null;
	static Node headNew=null;
	static Node headNewBuff=null;
	
	//生成一个链表
	public void creatLinkTable(int n){
		Node nodeBuff = null;
		for(int i=0;i<n;i++){
			if(head==null){
				head=new Node(i,null);
				nodeBuff=head;
			}else{
				nodeBuff.next=new Node(i,null);
				nodeBuff=nodeBuff.next;
			}
		}
	}
	//打印函数
	public static void reversePrintLinkTable(Node node){
		if(node!=null){
			if(node.next!=null){
				reversePrintLinkTable(node.next);
			}
			System.out.print(node.obj);
			if(node.next==null){
				headNew=node;
				headNewBuff=headNew;
			//	count=1;
			}else{
				headNewBuff.next=node;
				headNewBuff=headNewBuff.next;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkTableReverse ltr=new LinkTableReverse();
		ltr.creatLinkTable(10);
		Node n=head;
		while(n.next!=null){
			n=n.next;
			System.out.print((Integer)(n.obj));
		}
		//反转打印完成
		reversePrintLinkTable(head);
		headNewBuff.next=null;
		Node n1=headNew;
		while(n1.next!=null){
			
			System.out.print((Integer)(n1.obj));
			n1=n1.next;
		}		
	}

}
