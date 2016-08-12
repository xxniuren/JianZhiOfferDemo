package Fibonacci;
/**
 * 
 * @author Administrator
 * 斐波那契数组 f(n)=f(n-1)+f(n-2) f(1)=1 f(0)=1
 */
public class Fibonacci {
	int n;
	public Fibonacci(int n){
		this.n=n;
	}
	//计算Fibonacci函数
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
	//青蛙跳台
	  /** 
	   * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。 
	   * 求该青蛙跳上一个n级的台阶总共有多少种跳法。 
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
	//用递归方法计算Fibonacci
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
