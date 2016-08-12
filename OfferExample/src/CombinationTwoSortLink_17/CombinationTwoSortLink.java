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
		//node1Head ����
		for(int i=1;i<10;i=i+2){
			if(node1Head==null){
				node1Head=new Node(i,null);
				p=node1Head;
			}else{
				p.next=new Node(i,null);
				p=p.next;
			}
		}
		//node2Head ����
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
	//��дcompare����
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
		//����ȷ�����ĸ�����ͷ
		if(ctsl.compare(ctsl.node1Head.obj, ctsl.node2Head.obj)==1){
			head=ctsl.node2Head;
			headRef=ctsl.node1Head;
		}else{
			head=ctsl.node1Head;
			headRef=ctsl.node2Head;
		}
		//�м������������head���ƶ�
		Node headBuf=head;
		while(headBuf.next!=null || headRef!=null){
			//obj1>obj2 
			//����������������ݣ�����Ҫ�Ƚϣ����������������һ������û������ ��ֱ���˳�
			if(headBuf.next==null){
				headBuf.next=headRef;
				break;
			}
			//����ǲο�����Ϊ�� ��ֱ���˳�����
			if(headRef==null){
				break;
			}
			
			if(ctsl.compare(headBuf.next.obj, headRef.obj)==1){
				Node p=headBuf.next;//��һ���ڵ㱣��
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
