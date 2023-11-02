var plusOne = function (digits) {
    for (let i = 1; i < digits.length + 1; i++) {
        if (digits[digits.length - i] === 9) {
            digits[digits.length - i] = 0;
        } else {
            digits[digits.length - i] += 1;
            return digits;
        }
    }
    digits.unshift(1);
    return digits;
};
