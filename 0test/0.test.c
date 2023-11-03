#include<stdio.h>
#include<math.h>
int romanToInt(char * s);
int charToInt(char c);

int main(int argc, char const *argv[])
{
    char *string = "IV";

    printf("%d", 3/2);
    
    return 0;
}


int romanToInt(char * s){
    int size = sizeof(s)/sizeof(s[0]);
    int enumorator = 0;
    int totalEnumorator = 0;
    for (int i = 0; i < size-1; i++) {
        enumorator += charToInt(s[i]);
        if (charToInt(s[i]) > charToInt(s[i+1]))
        {
            totalEnumorator += enumorator;
            enumorator = 0;
        }
        else if (charToInt(s[i]) < charToInt(s[i+1]))
        {
            totalEnumorator -= enumorator;
            enumorator = 0;
        }
    }
    totalEnumorator += enumorator + charToInt(s[size - 1]);
    return totalEnumorator;
}

int charToInt(char c){
    switch (c)
        {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        
        default:
            break;
        }
}