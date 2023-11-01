int removeDuplicates(int* nums, int numsSize){
    int numsRemoved = 0;
    int numCount = 1;
    int lastNum = nums[0];
    for (int i = 1; i < numsSize; i++) {
        if (nums[i] == lastNum) {
            numsRemoved++;
        }
        else {
            lastNum = nums[i];
            nums[i - numsRemoved] = nums[i];
            numCount++;
        }
    }
    return numCount;
}