package IsBSubTreeOfA_18;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

@SuppressWarnings("unused")
class Node<T>{
	T t;
	Node<T> left;
	Node<T> right;
	public Node(T t){
		this.t=t;
	}
}

public class IsBSubTreeOfA {
	
	//先定义树根
	Node<Character> root=null;
	
	public void creatBTree(String gt){
		Deque<Node<Character>> stack=new ArrayDeque<>();
		root=null;
		int k=1;
		Node<Character> p=null;
		char a[]=gt.toCharArray();
		for(int i=0;i<a.length;i++){
			switch(a[i]){
				case ' ':break;
				case '(':stack.push(p);k=1;break;
				case ')':if(stack.isEmpty()){
							System.out.println("二叉树广义字符表错误");
							System.exit(0);
						 }
						stack.pop();break;
				case ',':k=2;break;
				default: p=new Node<Character>(a[i]);
						if(root==null) root=p;
						else{
							if(k==1) ((Node<Character>)stack.peek()).left=p;
							else ((Node<Character>)stack.peek()).right=p;
						}
			}
		}
	}
	public static void main(String[] args) {
		
	}

}
