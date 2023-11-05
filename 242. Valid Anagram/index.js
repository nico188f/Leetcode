var isAnagram = function (s, t) {
    const charMap = new Map();
    if (s.length !== t.length) {
        return false;
    }
    for (let i = 0; i < s.length; i++) {
        const char = s.charAt(i);
        const charCount = charMap.get(char);
        if (charCount === undefined) {
            charMap.set(char, 1);
        } else {
            charMap.set(char, charCount + 1);
        }
    }
    for (let i = 0; i < t.length; i++) {
        const char = t.charAt(i);
        const charCount = charMap.get(char);
        if (charCount === undefined || charCount <= 0) {
            return false;
        }
        charMap.set(char, charCount - 1);
    }
    return true;
};
