package LinkCountBackWardsKNode_15;

import java.util.Scanner;

/*
 * ��Ŀ����������  �Ӻ���ǰ�� ������k����ֵ������
 * 	����˼·������������ָ�룬��������֮���ֵ��k��ֱ���ڶ������������β��
 *   Node1 Node2 Node3 Node4 Node5 Node6 Node7 Node8 Node9 Node10 Node11 Node12 k=3
 *   p1                  p2
 *          p1                p2
 *                            ������������
 *                                                     p1                  p2
 */

//�ڵ���
class Node{
	Object obj;
	Node next;
	public Node(Object obj,Node next){
		this.obj=obj;
		this.next=next;
	}
}

public class LinkCountBackWardsKNode {
	
	Node head=null;
	Node deleteNode=null;
	int k=0;
	public LinkCountBackWardsKNode(){
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		k=sc.nextInt();
		Node p=null;
		for(int i=0;i<10;i++){
			if(head==null) {
				p=head=new Node(i,null);
			}else{
				p.next=new Node(i,null);
				p=p.next;
			}
		}
	}
	//
	public void getLinkCountBackWardsKNodeValue(){
		Node forward=head;
		Node backward=head;
		int count=0;
		while(forward!=null){
			if(count<k){
				forward=forward.next;
			}else{
				forward=forward.next;
				backward=backward.next;
			}
			count++;
		}
		System.out.println(backward.obj);
		
	}
	public static void main(String[] args) {
		LinkCountBackWardsKNode lcbwkn=new LinkCountBackWardsKNode();
		lcbwkn.getLinkCountBackWardsKNodeValue();
	}

}
