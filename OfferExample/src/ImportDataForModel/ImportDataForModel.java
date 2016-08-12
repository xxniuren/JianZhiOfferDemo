package ImportDataForModel;

import java.util.Scanner;


//输入一行数组,数组分离
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
