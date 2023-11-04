//Solution 1

var containsDuplicate = function (nums) {
    let map = new Map();
    for (let num of nums) {
        if (map.get(num)) {
            return true;
        }
        map.set(num, true);
    }
    return false;
};

//Solution 2
var containsDuplicate = function (nums) {
    const s = new Set(nums);
    return s.size !== nums.length;
};
