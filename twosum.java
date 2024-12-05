class twosum {
    public static void main(String args[]) {
        int nums[] = {2,7,11,15};
        int result[] = new int[2];
        int target = 9;

        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i]+"\t");
        }
        System.out.println();
    }
}