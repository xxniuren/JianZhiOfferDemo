package Fibonacci;
/**
 * 
 * @author Administrator
 * 쳲��������� f(n)=f(n-1)+f(n-2) f(1)=1 f(0)=1
 */
public class Fibonacci {
	int n;
	public Fibonacci(int n){
		this.n=n;
	}
	//����Fibonacci����
	public long computeFibonacci(){
		int result[]={0,1};
		if(n<2){
			return result[n];
		}
	   long fibNMinusOne=1;
	   long fibNMinusTwo=0;
	   long fibN=0;
	   for(int i=2;i<=n;i++){
		   fibN=fibNMinusOne+fibNMinusTwo;
		   fibNMinusTwo=fibNMinusOne;
		   fibNMinusOne=fibN;
	   }
	   return fibN;
	}
	//������̨
	  /** 
	   * һֻ����һ�ο�������1��̨�ף�Ҳ��������2���� 
	   * �����������һ��n����̨���ܹ��ж����������� 
	   * @param args 
	   */  
	  public int JumpFloor(int target) {  
	        int one = 1;  
	        int two =2;  
	        int result =0;  
	        if(target==0||target==1||target==2){  
	            return target;  
	        }  
	        for(int i =3;i<=target;i++){  
	            result = one +two;  
	            one = two;  
	            two = result;  
	        }  
	        return result;  
	    }  
	//�õݹ鷽������Fibonacci
	public long computeFibonacciByRecursion(int n){
		if(n==1){
			return 1;
		}else if(n==0){
			return 0;
		}else;
		return computeFibonacciByRecursion(n-1)+computeFibonacciByRecursion(n-2);
	}
	public static void main(String[] args) {
		
	}

}
