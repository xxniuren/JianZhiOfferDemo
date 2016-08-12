package FindDataFrom2DMatrix;
/**
 * 题目：在一个二维数组中，每一行都按照从左到右递增的顺序排列，每一列都按照从上到下递增的顺序排序
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组是否含有该整数！
 * @author Administrator
 * 首先选取数组中右上角的数字。如果该数字等于要查找的数字，查找过程结束；如果该数字大于要
 * 查找的数字，剔除这个数字所在的列；如果该数字小于要查找的数字，剔除这个数字所在的列。也就是
 * 说如果要查找的数字不在数组的右下角，则每一次都在数组的查找法内中剔除一行或者是一列，这样
 * 每一步都可以缩小查找范围，直到找到要查找的数字，或者查找为空。
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
