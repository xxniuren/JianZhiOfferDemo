package ImportDataForModel;

import java.util.Scanner;


//����һ������,�������
public class ImportDataForModel {
	int a[];
	int n;
	public ImportDataForModel(){
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String s[]=sc.nextLine().split(" ");
		for(int i=0;i<s.length;i++){
			a[i]=Integer.parseInt(s[i]);
		}
	}

}
