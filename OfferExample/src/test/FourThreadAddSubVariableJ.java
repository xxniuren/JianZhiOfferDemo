package test;

public class FourThreadAddSubVariableJ {
	private int j;
	public static void main(String[] args) {
		FourThreadAddSubVariableJ t=new FourThreadAddSubVariableJ();
		Inc incMethod=t.new Inc();
		Dec decMethod=t.new Dec();
		
		for(int i=0;i<2;i++){
			Thread t1=new Thread(incMethod);
			t1.start();
			Thread t2=new Thread(decMethod);
			t2.start();
		}

	}
	private synchronized void inc(){
		j++;
		System.out.println(Thread.currentThread().getName()+"-inc:"+j);
	}
	private synchronized void dec(){
		j--;
		System.out.println(Thread.currentThread().getName()+"-dec:"+j);
	}
	//内部类
	class Inc implements Runnable{
		public void run() {
			for(int i=0;i<100;i++){
				inc();
			}
		}
		
	}
	//内部类
	class Dec implements Runnable{

		public void run() {
			for(int i=0;i<100;i++){
				dec();
			}
		}
		
	}
}


