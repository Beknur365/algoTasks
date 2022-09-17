import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
    public KthLargest(int k, int[] nums) {
        for(int i : nums) priorityQueue.add(i);
        for(int i = 0; i < nums.length - k; i++){
            priorityQueue.remove();
        }
    }

    public int add(int val) {
        priorityQueue.add(val);
        priorityQueue.remove();
        return priorityQueue.peek();
    }
    public static void main(String[] args) {
        KthLargest k = new KthLargest(3, new int[]{4, 5, 8, 2});
        System.out.println(k.add(4));
        System.out.println(k.add(5));
        System.out.println(k.add(10));
        System.out.println(k.add(9));
        System.out.println(k.add(4));
    }
}
