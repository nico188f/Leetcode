var longestCommonPrefix = function (strs) {
    let prefix = strs[0];
    for (let i = 1; i < strs.length; i++) {
        const str = strs[i];
        if (!str.startsWith(prefix)) {
            let newPrefix = "";
            for (let j = 0; j < prefix.length; j++) {
                if (str[j] !== prefix[j]) {
                    prefix = newPrefix;
                    break;
                }
                newPrefix += str[j];
            }
        }
    }
    return prefix;
};
