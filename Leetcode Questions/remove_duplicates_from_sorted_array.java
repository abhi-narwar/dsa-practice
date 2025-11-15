class remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=1;
        for(int j=1;j<n;j++){
            if(nums[j]!=nums[i-1]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
        
    }
}