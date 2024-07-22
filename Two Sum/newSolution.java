public class newSolution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map =new HashMap<>();    
        for(int i =0; i<nums.length;i++){
            int rest = target- nums[i];
            if(map.containsKey(rest)) { 
                return new int[] {map.get(rest)+1,i+1};
            } 
            map.put(nums[i], i) ;
        }
        throw new IllegalArgumentException("Not Found");
    }
}
