package Singleton;
//单例模式  加锁  不完美！！
class Singleton1ThreadLock implements Runnable{
		public void run() {
			@SuppressWarnings("unused")
			Singleton1Lock sing=null;
			for(int i=0;i<100;i++){
				sing=Singleton1Lock.Instance();
			}
		}
	
}

public class Singleton1Lock {
	private static final String Singleton1Lock = "abc";
	private Singleton1Lock(){
		
	}
	public static String s="abc";
	private static Singleton1Lock instance=null;
	public static Singleton1Lock Instance(){
			if(instance==null){
				synchronized (Singleton1Lock) {
					if(instance==null){
						System.out.println("creat a instance");
						instance =new Singleton1Lock();
						System.out.println(instance);
					}
				}
			}
			return instance;
	}

	public static void main(String[] args) {
		Singleton1ThreadLock st1=new Singleton1ThreadLock();
		Singleton1ThreadLock st2=new Singleton1ThreadLock();
		Singleton1ThreadLock st3=new Singleton1ThreadLock();
		Singleton1ThreadLock st4=new Singleton1ThreadLock();
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
