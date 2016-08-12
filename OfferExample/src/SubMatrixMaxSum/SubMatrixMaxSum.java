package SubMatrixMaxSum;

public class SubMatrixMaxSum {
	//求一个数组的最大子数组和
	public static int maxSum(int arr[]){
		if(arr==null || arr.length==0){
			return 0;
		}
		int max=Integer.MIN_VALUE;
		int curr=0;
		for(int i=0;i<arr.length;i++){
			curr+=arr[i];
			max=Math.max(max, curr);
			curr=(curr<0)?0:curr;
		}
		return max;
	}
	//m是行 n是列
	public static int maxSubMatrixMaxSum(int arr2D[][]){
		int max=0;
		int curr=0;
		int s[]=null;
		for(int i=0;i<arr2D.length;i++){
			s=new int[arr2D[0].length];
			for(int j=i;j<arr2D.length;j++){
				curr=0;
				for(int k=0;k<arr2D[0].length;k++){
					s[k]+=arr2D[j][k];
					curr+=s[k];
					max=Math.max(max, curr);
					curr=(curr<0)?0:curr;
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int array[][]={{3,2,1,4},{-3,5,2,7},{3,-3,4,6}};
		System.out.println(maxSubMatrixMaxSum(array));
	}

}
