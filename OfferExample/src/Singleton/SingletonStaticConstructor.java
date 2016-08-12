package Singleton;
//����ģʽ ���þ�̬���캯����ʵ��
class Singleton1ThreadStaticConstructor implements Runnable{
		public void run() {
			@SuppressWarnings("unused")
			SingletonStaticConstructor sing=null;
			for(int i=0;i<100;i++){
				sing=SingletonStaticConstructor.Instance();
			}
		}
	
}
//��Ҫ��ֱ��new��ʵ������  ��һ���õ�SingletonStaticConstructorʱ����
public class SingletonStaticConstructor {

	private SingletonStaticConstructor(){
		
	}

	private static SingletonStaticConstructor instance=new SingletonStaticConstructor();
	public static SingletonStaticConstructor Instance(){
		System.out.println(instance);
		return instance;
	}

	public static void main(String[] args) {
		Singleton1ThreadStaticConstructor st1=new Singleton1ThreadStaticConstructor();
		Singleton1ThreadStaticConstructor st2=new Singleton1ThreadStaticConstructor();
		Singleton1ThreadStaticConstructor st3=new Singleton1ThreadStaticConstructor();
		Singleton1ThreadStaticConstructor st4=new Singleton1ThreadStaticConstructor();
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
