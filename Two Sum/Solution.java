class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i =0; i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if( numbers[j] == target-numbers[i] ){
                    return new int[] {i+1,j+1};
                }
            }
        }
        throw new IllegalArgumentException("Not Found");
    }
}