
// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000

int DecimalNumericalPlace(char roman_np_value)
    {
        switch(roman_np_value)
        {
            case 'M':
            return 1000;
            break;

             case 'D':
            return 500;
            break;

            case 'C':
            return 100;
            break;

             case 'L':
            return 50;
            break;

             case 'X':
            return 10;
            break;

             case 'V':
            return 5;
            break;

            case 'I':
            return 1;
            break;
            default :
            return -1;
        }
    }
int romanToInt(char * s)
{
    int len=strlen(s);
    int sum=0;
   for(int i=0;s[i]!='\0';i++){
       if(DecimalNumericalPlace(s[i]) < DecimalNumericalPlace(s[i+1])){
       sum = sum-DecimalNumericalPlace(s[i]);
   }
   else{
   sum+=DecimalNumericalPlace(s[i]);
   }
   }
    return sum;
}



// int charToInt(char c);

// int romanToInt(char * s){
//     int size = strlen(s);
//     int enumorator = 0;
//     int totalEnumorator = 0;
//     for (int i = 0; i < size-1; i++) {
//         enumorator += charToInt(s[i]);
//         if (charToInt(s[i]) > charToInt(s[i+1]))
//         {
//             totalEnumorator += enumorator;
//             enumorator = 0;
//         }
//         else if (charToInt(s[i]) < charToInt(s[i+1]))
//         {
//             totalEnumorator -= enumorator;
//             enumorator = 0;
//         }
//     }
//     totalEnumorator += enumorator + charToInt(s[size - 1]);
//     return totalEnumorator;
// }

// int charToInt(char c){
//     switch (c)
//         {
//         case 'I':
//             return 1;
//         case 'V':
//             return 5;
//         case 'X':
//             return 10;
//         case 'L':
//             return 50;
//         case 'C':
//             return 100;
//         case 'D':
//             return 500;
//         case 'M':
//             return 1000;
        
//         default:
//             break;
//         }
// }