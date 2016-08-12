package OddFrontEvenBehind_14;

import java.util.Scanner;

/*
 * 题目：输入一个整数数组，实现一个函数来调整数组中数字的顺序，使得所有的奇数位于数组的前面
 * 所有的偶数位于数组的后面
 */
/*
 * 用两个指针，一个在数组头 一个在数组尾部，左边遇到第一个偶数停止，右边遇到第一个奇数停止
 * 然后左右指针指向数据交换
 */
public class OddFrontEvenBehind {
	//
	private int a[];
	//得到需要的数组
	public OddFrontEvenBehind(){
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str==null){
			System.out.println("no data input");
			System.exit(0);
		}
		String s[]=str.split(" ");
		a=new int[s.length];
		for(int i=0;i<=s.length-1;i++){
			a[i]=Integer.parseInt(s[i]);
		}
	}
	//做一个可扩展的判断函数
	private boolean isNeedCondition(int data){
		if(data%2==0)return true;
		else return false;
	}
	//处理函数
	public void exchangeOddPositionFrontEvenPositionBehind(){
		int front=0;
		int behind=a.length-1;
		while(front<behind-1){
			while(!isNeedCondition(a[front])){
				front++;
			}
			while(isNeedCondition(a[behind])){
				behind--;
			}
			int buf=a[front];
			a[front]=a[behind];
			a[behind]=buf;
		}
	}
	//实现函数
	public static void main(String agrs[]){
		OddFrontEvenBehind ofeb=new OddFrontEvenBehind();
		ofeb.exchangeOddPositionFrontEvenPositionBehind();
		for(int i:ofeb.a){
			System.out.print(i);
		}
	}
}
