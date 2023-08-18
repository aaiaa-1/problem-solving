// Given a roman numeral, convert it to an integer.

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> values = new HashMap<>();
        values.put('I',1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i =0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            int curr = values.get(c);
            
            if ( curr<=prevValue ){
                result +=curr ;
            }
            else if (curr>prevValue){
                if (result == 0){
                    result = curr ;      //  curr = 10          prevValue = 10         result = 610  
                }else{
                    result = result -prevValue + (curr - prevValue);
                }
            }
            else if ( curr == 1 ){
                if (prevValue ==1 || prevValue == 2){
                    result += curr;
                }
            }
            prevValue = curr;
        }
        return result ;
    }
}
