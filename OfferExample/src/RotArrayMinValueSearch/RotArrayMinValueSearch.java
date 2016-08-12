package RotArrayMinValueSearch;
/*
 * ��Ҫ��һ��������԰�����Ҫ��������  1 0 1 1 1  ���� a[head]=a[center]=a[rear]����޷��ж�
 */
/**
 * ��ָoffer�ڰ��� ��һ���������鿪ʼ������Ԫ�ذᵽ�����β�������ǳ�֮Ϊ�������ת������һ������
 * ����������һ����ת�������ת�������СԪ�أ���������{3 4 5 1 2}������Ϊ1
 */
import java.util.Scanner;

public class RotArrayMinValueSearch {
	int a[];
	//����ֱ������
	public RotArrayMinValueSearch(){
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s[]=sc.nextLine().split(" ");
		a=new int[s.length];
		for(int i=0;i<s.length;i++){
			a[i]=Integer.parseInt(s[i]);
		}
	}
	
	//������ת������Сֵ
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
