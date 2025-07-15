import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {
    private PriorityQueue<Integer> min = new PriorityQueue<>(); 
    private PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder()); 
    
    public MedianFinder() {
    }
    
    public void addNum(int num) {
        max.offer(num);
        min.offer(max.poll()); 

        if (max.size() < min.size()) {
            max.offer(min.poll()); 
        }
    }
    
    public double findMedian() {
        if (max.size() > min.size()) {
            return max.peek(); 
        } else {
            return (max.peek() + min.peek()) / 2.0; 
        }
    }
}
