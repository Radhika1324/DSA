class searchr {
    public boolean search (int[] nums, int target) {
        int i;
        for(i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
                return true;
            }
        }
        return false;
    }
}