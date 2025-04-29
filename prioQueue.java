import java.util.PriorityQueue;
public class prioQueue{
	public static void main(String[] args){
		PriorityQueue<String>pq=new PriorityQueue<>();
		pq.add("Alpha");
		pq.add("Beta");
		pq.add("Gamma");
		System.out.println("priority queue elements:");
		System.out.println(pq);
		System.out.println("Head of the queue:"+pq.peek());
		System.out.println("Removed element:"+pq.poll());
		System.out.println(" New head of the queue:"+pq.peek());
		System.out.println("Remaining elements:");
		for(String str:pq){
			System.out.println(str);
		}
	}
}

