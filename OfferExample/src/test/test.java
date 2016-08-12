package test;

public class test extends father{

	/**
	 * @param args
	 */
	public int data=10;
//	public void print(){
//		System.out.println("son");
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		father f=new test();
		//test son=(test)f;
		System.out.println(f.data);
	//	son.print();
		
	}

}

class father{
	public int data=5;
	public void print(){
		System.out.println("father");
	}
}
