class rotate_array {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        rotate(nums,0,n-1);
        rotate(nums,0,k-1);
        rotate(nums,k,n-1);
        
    }
    public void rotate(int[] nums,int st,int en){
        while(st<en){
        int temp=nums[en];
        nums[en]=nums[st];
        nums[st]=temp;
        st++;
        en--;
        }
    }
}