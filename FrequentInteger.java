import java.util.HashMap;

public class FrequentInteger {
    public static void main(String[] args) {
        HashMap<Integer, Integer> counter = new HashMap();
        int max = 0;
        int maxKey = 0;
        int[] nums = {1,4,6,1,7,3,9,2,5,7,20,20,20,20};
        for (int i = 0; i < nums.length; i++) {
        if(!counter.containsKey(nums[i])){
            counter.put(nums[i], 1);
        }
        else{
            counter.put(nums[i], (counter.get(nums[i])) + 1);
        }
    }
        for (int key: counter.keySet()) {
            if(max < counter.get(key)){
                max = counter.get(key);
                maxKey = key;
            }
        }
        System.out.println(maxKey);
}
}
