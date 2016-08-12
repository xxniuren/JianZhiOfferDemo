package JosephCircle;

class JosephNode{
	int data;
	JosephNode next;
}

public class JosephCircleLinkImpl {
	public static JosephNode creatJosephCircleLink(){
		JosephNode head=new JosephNode();
		JosephNode rear=new JosephNode();
		for(int i=0;i<10;i++){
			JosephNode node=new JosephNode();
			node.data=i;
			if(i==0){
				head=node;
				rear=node;
				rear.next=rear;
			}else{
				rear.next=node;
				rear.next.next=head;
				rear=rear.next;
			}
		}
		return head;	
	}
	public static void main(String args[]){
		JosephNode head=creatJosephCircleLink();
		int count=0;
		JosephNode p=head;
		while(p.next!=p){
			count++;
			if(count==3){
				count=0;
				p.next=p.next.next;
			}
			p=p.next;
			
		}
		System.out.println(p.data);
	}
}
