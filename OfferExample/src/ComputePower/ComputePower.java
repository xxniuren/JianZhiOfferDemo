package ComputePower;

import java.util.Scanner;

/*
 * 数值的整数次方
 * 	需要对数据处理，包括负数的指数次方要求出 如果是0的正整数次方，直接归零；
 * 	0的负指数次方直接报错
 */
public class ComputePower {	
	private float x;
	private int n;
	public ComputePower(){
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s[]=sc.nextLine().split(" ");
		x=Float.parseFloat(s[0]);
		n=Integer.parseInt(s[1]);
	}
	public double computePowerResult() throws Exception{
		double result=1;
		if((x<0.000001 && x > 0)&&(n<0)) {
			throw new Exception("非法输入");
		}
		if((x<0.000001 && x > 0)&&(n>0)) {
			return 0;
		}
		if(n<0){
			for(int i=0;i<-n;i++){
				result*=x;
			}
			result=1.0/result;
		}else{
			for(int i=0;i<n;i++){
				result*=x;
			}
		}
		return result;
	}
	public static void main(String[] args) throws Exception {
		ComputePower cp=new ComputePower();
		System.out.println(cp.computePowerResult());
	}

}
