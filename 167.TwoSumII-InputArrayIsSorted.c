#include<stdlib.h>

int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    int* retArr = malloc(2 * sizeof(int));
    retArr[0] = 1;
    retArr[1] = 1;
    for (int i = 0; i < numsSize; i++)
    {
        int num = nums[i];
        int l = i + 1, r = numsSize - 1;
        int subTarget = target - num;
        while (l <= r)
        {
            int m = (l + r) / 2;
            if (nums[m] < subTarget) {
                l = m + 1;
            }
            else if (nums[m] > subTarget) {
                r = m - 1;
            }
            else {
                *returnSize = 2;
                retArr[0] = i;
                retArr[1] = m;
                return retArr;
            }
            
        }
        
    }
    *returnSize = 0;
    return NULL;
}