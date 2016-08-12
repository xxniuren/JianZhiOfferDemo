package RotArrayMinValueSearch;
/*
 * 主要有一个特殊测试案例需要单独处理  1 0 1 1 1  就是 a[head]=a[center]=a[rear]这块无法判断
 */
/**
 * 剑指offer第八题 把一个递增数组开始的若干元素搬到数组的尾部，我们称之为数组的旋转。输入一个递增
 * 排序的数组的一个旋转，输出旋转数组的最小元素，例如数组{3 4 5 1 2}输出结果为1
 */
import java.util.Scanner;

public class RotArrayMinValueSearch {
	int a[];
	//数组直接输入
	public RotArrayMinValueSearch(){
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s[]=sc.nextLine().split(" ");
		a=new int[s.length];
		for(int i=0;i<s.length;i++){
			a[i]=Integer.parseInt(s[i]);
		}
	}
	
	//查找旋转数组最小值
	public int searchRotArrayMinValue(){
		int head=0;
		int minData=0;
		int rear=a.length-1;
		while(head<rear-1){
			int cent=(head+rear)/2;
			if(a[cent]==a[head]&&a[cent]==a[rear]){
				int min=0;
				for(int i=head;i<rear;i++){
					min=Math.min(min, a[i]);
				}
				minData=min;
				break;
			}
			if(a[cent]>=a[head]){
				head=cent;
			}
			if(a[cent]<=a[rear]){
				rear=cent;
			}
			minData=a[rear];
		}
		
		return minData;
		
	}
	
	public static void main(String[] args) {
		RotArrayMinValueSearch r=new RotArrayMinValueSearch();
		System.out.println(r.searchRotArrayMinValue());
	}

}
