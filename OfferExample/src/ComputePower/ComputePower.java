package ComputePower;

import java.util.Scanner;

/*
 * ��ֵ�������η�
 * 	��Ҫ�����ݴ�������������ָ���η�Ҫ��� �����0���������η���ֱ�ӹ��㣻
 * 	0�ĸ�ָ���η�ֱ�ӱ���
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
			throw new Exception("�Ƿ�����");
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
