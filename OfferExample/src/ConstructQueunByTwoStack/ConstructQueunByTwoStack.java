package ConstructQueunByTwoStack;

import java.util.Stack;
//��������ջ��һ������
public class ConstructQueunByTwoStack {
	public Stack<Object> s1=new Stack<Object>();
	public Stack<Object> s2=new Stack<Object>();
	//����һ��Ԫ�ص���ջ��
	public  void pushQueun(Object obj){
		if(s2.empty()==false) return;
		while(s1.empty()==false){
			Object o=s1.pop();
			s2.push(o);
		}
		s2.push(obj);
		if(s1.empty()==false) return;
		while(s2.empty()==false){
			Object o=s2.pop();
			System.out.println(o);
			s1.push(o);
		}
	}
	//�Ӷ�ջ�е���һ��Ԫ��
	public Object popQueue(){
		return s1.pop();
	}
	//������
	public static void main(String args[]){
		ConstructQueunByTwoStack cqbts=new ConstructQueunByTwoStack();
		for(int i=0;i<10;i++){
			cqbts.pushQueun(i);
		}
	}
}
