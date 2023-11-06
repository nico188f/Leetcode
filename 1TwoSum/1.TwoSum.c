//solution 1
#include<stdlib.h>

int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    int* retArr = malloc(2 * sizeof(int));
    retArr[0] = 1;
    retArr[1] = 1;
    for (int i = 0; i < numsSize; i++)
    {
        for (int j = i + 1; j < numsSize; j++)
        {
            if (nums[i] + nums[j] == target) {
                *returnSize = 2;
                retArr[0] = i;
                retArr[1] = j;
                return retArr;
            }
        }
    }
    *returnSize = 0;
    return NULL;
}