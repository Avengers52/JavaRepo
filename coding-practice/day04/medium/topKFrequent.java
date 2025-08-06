import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map = new HashMap<>();
        int[] result = new int[k];

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>>maxHeap = new PriorityQueue<>((a,b)-> b.getValue() - a.getValue());
        maxHeap.addAll(map.entrySet());
        for(int i = 0; i < k; i++){
            result[i] = maxHeap.poll().getKey();
        }
        return result;
    }
}