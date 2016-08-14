package IsBSubTreeOfA_18;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

@SuppressWarnings("unused")
class Node<T>{
	T element;
	Node<T> left;
	Node<T> right;
	public Node(T element){
		this.element=element;
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
	//判断B树是否是A树的子树
	boolean isAHasSameNodeAsB(Node<Character> rootA,Node<Character>rootB){
		//递归里面嵌套递归，首先遍历整个树找到B的结点和A的结点相同的点，然后判断从该节点出发A和B是否相同
		boolean result=false;
		if(rootA!=null && rootB!=null){
			if(rootA.element.equals(rootB.element)){
				result=isASubTreeOfB(rootA, rootB);
			}
			if(!result){
				result=isAHasSameNodeAsB(rootA.left,rootB);
			}
			if(!result){
				result=isAHasSameNodeAsB(rootA.right, rootB);
			}
		}
		return result;
	}
	//判断B是否是A的子树
	boolean isASubTreeOfB(Node<Character> root1,Node<Character>root2){
		if(root2==null){
			return true;
		}
		if(root1==null){
			return false;
		}
		if(root1.element.equals(root2.element)==false){
			return false;
		}
		return isASubTreeOfB(root1.left,root2.left) && isASubTreeOfB(root1.right, root2.right);
	}
	public static void main(String[] args) {
		IsBSubTreeOfA t1=new IsBSubTreeOfA();
		t1.creatBTree("A(B(D,E(F,G)),C)");
		IsBSubTreeOfA t2=new IsBSubTreeOfA();
		t2.creatBTree("B(D,E)");
		System.out.println(t1.isAHasSameNodeAsB(t1.root, t2.root));
	}

}
