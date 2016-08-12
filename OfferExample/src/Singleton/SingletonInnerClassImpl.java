package Singleton;

class Singleton1ThreadInnerClass implements Runnable{
	
	@SuppressWarnings("static-access")
	public void run() {
		@SuppressWarnings("unused")
		SingletonInnerClassImpl sing=null;
		for(int i=0;i<100;i++){
			SingletonInnerClassImpl sici=new SingletonInnerClassImpl();
			sici.Instance();
		}
	}
	
}

public class SingletonInnerClassImpl {
     SingletonInnerClassImpl(){	
	}
     public static SingletonInnerClassImpl Instance(){
    	 System.out.println(Nested.instance1);
    	 return Nested.instance1;
    	 
     }
     static class Nested{
    	 Nested(){	
    		 
    	 }
    	 static  SingletonInnerClassImpl instance1=new SingletonInnerClassImpl();
    	 
     }

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
//		Singleton1ThreadInnerClass st1=new Singleton1ThreadInnerClass();
//		Singleton1ThreadInnerClass st2=new Singleton1ThreadInnerClass();
//		Singleton1ThreadInnerClass st3=new Singleton1ThreadInnerClass();
//		Singleton1ThreadInnerClass st4=new Singleton1ThreadInnerClass();
//		Thread t1=new Thread(st1);
//		Thread t2=new Thread(st2);
//		Thread t3=new Thread(st3);
//		Thread t4=new Thread(st4);
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
		SingletonInnerClassImpl sici=new SingletonInnerClassImpl();
		sici.Instance();
	}

}
