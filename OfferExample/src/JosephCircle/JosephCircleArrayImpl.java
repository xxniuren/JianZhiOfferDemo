package JosephCircle;

public class JosephCircleArrayImpl {
	public static void main(String[] args) {
		Boolean usaJapa[]=new Boolean[10];//≥ı ºªØ30»À
//		for(Boolean usa:usaJapa){
//			usa=true;
//		}
		for(int i=0;i<usaJapa.length;i++){
			usaJapa[i]=true;
		}
		
		int leftCount=usaJapa.length;
		int countNum=0;
		int index=0;
		while(leftCount>1){
			if(usaJapa[index]){
				countNum++;
				if(countNum==3){
					countNum=0;
					usaJapa[index]=false;
					leftCount--;
				}
			}
			index++;
			if(index==usaJapa.length){
				index=0;
			}
		}
		for(int i=0;i<usaJapa.length;i++){
			System.out.println(i+"="+usaJapa[i]+" ");
		}
	}

}
