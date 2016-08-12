package FindDataFrom2DMatrix;
/**
 * ��Ŀ����һ����ά�����У�ÿһ�ж����մ����ҵ�����˳�����У�ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ���������ж������Ƿ��и�������
 * @author Administrator
 * ����ѡȡ���������Ͻǵ����֡���������ֵ���Ҫ���ҵ����֣����ҹ��̽�������������ִ���Ҫ
 * ���ҵ����֣��޳�����������ڵ��У����������С��Ҫ���ҵ����֣��޳�����������ڵ��С�Ҳ����
 * ˵���Ҫ���ҵ����ֲ�����������½ǣ���ÿһ�ζ�������Ĳ��ҷ������޳�һ�л�����һ�У�����
 * ÿһ����������С���ҷ�Χ��ֱ���ҵ�Ҫ���ҵ����֣����߲���Ϊ�ա�
 */
public class FindDataFrom2DMatrix {

	int matrixData[][]={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
	public boolean isFindData(int targetData){
		boolean found=false;
		int rows= matrixData[0].length;
		int cols= matrixData.length;
		if((matrixData!=null)&&(rows!=0)&&(cols!=0)){
			int row=0;
			int col=cols-1;
			while(row<rows && col>=0){
				if(matrixData[row][col]==targetData){
					found=true;
					break;
				}else if(matrixData[row][col]>targetData){
					col--;
				}else row++;
			}
		}
		return found;
	}
	public static void main(String[] args) {
		FindDataFrom2DMatrix f=new FindDataFrom2DMatrix();
		System.out.println(f.isFindData(19));
	}

}
