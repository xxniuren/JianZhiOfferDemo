package test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		Queue<Integer> queue=new PriorityQueue<Integer>(10,new Comparator<Integer>(){

			public int compare(Integer i, Integer j) {
				int result=i%2-j%2;
				if(result==0){
					result=i-j;
				} return result;
			}});
		for(int i=0;i<10;i++){
			queue.offer(i);
		}
		for(int i=0;i<10;i++){
			System.out.println(queue.poll());
		}
	}

}
