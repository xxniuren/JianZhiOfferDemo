package CombinationTwoSortLink_17;
/*
 * 需要明白递归思想
 */
class LinkNode{
	int element;
	LinkNode next;
	public LinkNode(int element,LinkNode next){
		this.element=element;
		this.next=next;
	}
}

public class CombinationTwoSortLinkOfferRecursive {
	//生成两个链表
	LinkNode linkNodeHead1=null;
	LinkNode linkNodeHead2=null;
	public void creatTwoLink(){
		//第一个链表做完
		linkNodeHead1=new LinkNode(1,null);
		linkNodeHead1.next=new LinkNode(3,null);
		linkNodeHead1.next.next=new LinkNode(5,null);
		linkNodeHead1.next.next.next=new LinkNode(7,null);
		linkNodeHead1.next.next.next.next=new LinkNode(9,null);
		
		//第二个链表做完
		linkNodeHead2=new LinkNode(2,null);
		linkNodeHead2.next=new LinkNode(4,null);
		linkNodeHead2.next.next=new LinkNode(6,null);
		linkNodeHead2.next.next.next=new LinkNode(8,null);
	}

	public LinkNode MergeTwoLink(LinkNode linkNode1,LinkNode linkNode2){
		if(linkNode1==null) return linkNode2;
		if(linkNode2==null) return linkNode1;
		LinkNode mergeLinkNode=null;
		if(linkNode1.element>linkNode2.element){
			mergeLinkNode=linkNode2;
			mergeLinkNode.next=MergeTwoLink(linkNode1,linkNode2.next);
		}else{
			mergeLinkNode=linkNode1;
			mergeLinkNode.next=MergeTwoLink(linkNode1.next,linkNode2);			
		}
		return mergeLinkNode;
	}
	
	public static void main(String[] args) {
		LinkNode linkNodeHead=null;
		CombinationTwoSortLinkOfferRecursive c=new CombinationTwoSortLinkOfferRecursive();
		c.creatTwoLink();
		linkNodeHead=c.MergeTwoLink(c.linkNodeHead1, c.linkNodeHead2);
		while(linkNodeHead!=null){
			System.out.print(linkNodeHead.element);
			linkNodeHead=linkNodeHead.next;
		}
	}

}
