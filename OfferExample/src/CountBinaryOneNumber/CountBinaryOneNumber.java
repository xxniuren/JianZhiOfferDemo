package CountBinaryOneNumber;

import java.util.Scanner;

//�����������1�ĸ���
public class CountBinaryOneNumber {
	int n;
	public CountBinaryOneNumber(){
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	}
	//���㺯��
	public int ComputeBinaryOneNumber(){
		int count=0;
		while(n!=0){
			++count;
			n=n&(n-1);
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountBinaryOneNumber cbon=new CountBinaryOneNumber();
		System.out.println(cbon.ComputeBinaryOneNumber());
	}

}
