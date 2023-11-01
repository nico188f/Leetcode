var isValid = function (s) {
    let charArr = [];
    for (let i = 0; i < s.length; i++) {
        const char = s[i];
        switch (char) {
            case "(":
                charArr.push("(");
                break;
            case "{":
                charArr.push("{");
                break;
            case "[":
                charArr.push("[");
                break;
            case ")":
                if (charArr.length && charArr[charArr.length - 1] === "(") {
                    charArr.pop();
                    break;
                }
                return false;
            case "}":
                if (charArr.length && charArr[charArr.length - 1] === "{") {
                    charArr.pop();
                    break;
                }
                return false;
            case "]":
                if (charArr.length && charArr[charArr.length - 1] === "[") {
                    charArr.pop();
                    break;
                }
                return false;

            default:
                break;
        }
    }
    if (charArr.length) {
        return false;
    }
    return true;
};
