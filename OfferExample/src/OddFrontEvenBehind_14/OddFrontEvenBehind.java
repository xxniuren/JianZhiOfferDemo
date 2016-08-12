package OddFrontEvenBehind_14;

import java.util.Scanner;

/*
 * ��Ŀ������һ���������飬ʵ��һ���������������������ֵ�˳��ʹ�����е�����λ�������ǰ��
 * ���е�ż��λ������ĺ���
 */
/*
 * ������ָ�룬һ��������ͷ һ��������β�������������һ��ż��ֹͣ���ұ�������һ������ֹͣ
 * Ȼ������ָ��ָ�����ݽ���
 */
public class OddFrontEvenBehind {
	//
	private int a[];
	//�õ���Ҫ������
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
	//��һ������չ���жϺ���
	private boolean isNeedCondition(int data){
		if(data%2==0)return true;
		else return false;
	}
	//������
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
	//ʵ�ֺ���
	public static void main(String agrs[]){
		OddFrontEvenBehind ofeb=new OddFrontEvenBehind();
		ofeb.exchangeOddPositionFrontEvenPositionBehind();
		for(int i:ofeb.a){
			System.out.print(i);
		}
	}
}
