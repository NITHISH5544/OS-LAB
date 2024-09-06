public class Solution {
    public static void main(String[] args) {
        String roman = "MCMXCIV";
        
        int result = romanToInt(roman);
        System.out.println("The integer value of " + roman + " is: " + result);
    }

    public static int romanToInt(String s) {
        char[] x = new char[15];
        int sum = 0;
        int l = s.length();
        if (l > 0 && l < 15) {
            s.getChars(0, l, x, 0);
        

        for (int i = 0; i < l; i++) {
            switch (x[i]) {
                case 'I':
                    if (i + 1 < l && (x[i + 1] == 'V' || x[i + 1] == 'X')) {
                        sum -= 1;
                    } else {
                        sum += 1;
                    }
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if (i + 1 < l && (x[i + 1] == 'L' || x[i + 1] == 'C')) {
                        sum -= 10;
                    } else {
                        sum += 10;
                    }
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if (i + 1 < l && (x[i + 1] == 'D' || x[i + 1] == 'M')) {
                        sum -= 100;
                    } else {
                        sum += 100;
                    }
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
                
            }
        }}
        return sum;
    
}}
