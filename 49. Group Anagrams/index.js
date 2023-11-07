var groupAnagrams = function (strs) {
    const rtnArray = [];
    const indexMap = new Map();
    for (let i = 0; i < strs.length; i++) {
        const str = strs[i];
        const sortedStr = str.split("").sort().join("");
        if (indexMap.has(sortedStr)) {
            rtnArray[indexMap.get(sortedStr)].push(str);
        } else {
            rtnArray.push([str]);
            indexMap.set(sortedStr, rtnArray.length - 1);
        }
    }
    return rtnArray;
};
