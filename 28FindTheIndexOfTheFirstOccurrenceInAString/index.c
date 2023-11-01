int strStr(char * haystack, char * needle){

    for (int i = 0; haystack[i] != '\0'; i++) {
        int j = 0;
        while (haystack[i + j] == needle[j]) {
            if (needle[j] == '\0')
            {
                return i;
            }
            j++;
        }
        if (needle[j] == '\0')
        {
            return i;
        }
    }
    return -1;
}