package Singleton;
//晚上写一个技术博客！！！！
class Singleton1Thread implements Runnable{
	
	public void run() {
		@SuppressWarnings("unused")
		Singleton1 sing=null;
		for(int i=0;i<100;i++){
			sing=Singleton1.Instance();
		}
	}
	
}

public class Singleton1 {
	private Singleton1(){
		
	}
	private static Singleton1 instance=null;
	public static Singleton1 Instance(){
		if(instance==null){
			System.out.println("creat a instance");
			instance =new Singleton1();
			System.out.println(instance);
		}
		return instance;
	}
	public static void main(String[] args) {
		Singleton1Thread st1=new Singleton1Thread();
		Singleton1Thread st2=new Singleton1Thread();
		Singleton1Thread st3=new Singleton1Thread();
		Singleton1Thread st4=new Singleton1Thread();
		Thread t1=new Thread(st1);
		Thread t2=new Thread(st2);
		Thread t3=new Thread(st3);
		Thread t4=new Thread(st4);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
