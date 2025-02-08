class firstlast {
    public int[] searchRange(int[] nums, int target) 
    {
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
                return new int[] {i,i+1};
            }
        }
        return new int[] {-1,-1};
        
    }
}