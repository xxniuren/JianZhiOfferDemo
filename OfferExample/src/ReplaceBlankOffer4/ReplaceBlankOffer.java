package ReplaceBlankOffer4;

public class ReplaceBlankOffer {
	public void replaceBank(char a[],int length){
		if(a==null || length==0){
			return ;
		}
		//做两个变量  字符串长度originalLength 和 空格数numberBlank
		int originalLength=0;
		int numberBlank=0;
		//for(int i=0;i<a.length;i++){
		int i=0;
		while(a[i]!='\0'){
			originalLength++;
			if(a[i]==' ') numberBlank++;
			i++;
		}
		//做一个新长度的变量
		int newLength=originalLength+numberBlank*2;
		if(newLength > length){
			return;
		}
		//做两个指针变量
		int indexOriginalLength=originalLength;
		int indexNewLength=newLength;
		while(indexOriginalLength >=0 ){
			if(a[indexOriginalLength] != ' '){
				a[indexNewLength]=a[indexOriginalLength];
				indexNewLength--;
				indexOriginalLength--;
			}else{
				a[indexNewLength--]='0';
				a[indexNewLength--]='2';
				a[indexNewLength--]='%';
				indexOriginalLength--;
			}
		}
		//System.out.printf("%s",a);
		String s=new String(a);
		System.out.println(s.substring(0, indexNewLength));
	}
	public static void main(String[] args) {
		char a[]=new char[30];
		System.out.println(a.length);
		for(int i=0;i<a.length;i++){
			a[i]='\0';
		}
		System.out.println(a.length);
		String s="hello world";
		char aa[]=s.toCharArray();
		for(int i=0;i<aa.length;i++){
			a[i]=aa[i];
		}
		System.out.println(a.length);
		ReplaceBlankOffer rb=new ReplaceBlankOffer();
		rb.replaceBank(a, 30);
	}

}
