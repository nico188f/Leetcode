//solution 2
var twoSum = function (nums, target) {
    const numMap = new Map();
    for (let i = 0; i < nums.length; i++) {
        const num = nums[i];
        const diff = target - num;
        const diffIndex = numMap.get(diff);
        if (diffIndex !== undefined) {
            console.log([i, diffIndex]);
            return [diffIndex, i];
        }
        numMap.set(num, i);
    }
    return [];
};
