/* 
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type. 
*/

class Solution {
public:
    bool isValid(string s) {
        stack<char> stack;  // a stack cause we need closed brackets in the correct order !!
        unordered_map<char, char> brackets = {{')', '('}, {']', '['}, {'}', '{'}};  // Map closing brackets to their corresponding opening brackets
   
        for (char c : s){ //loop through each character in s
            if (brackets.count(c)){ //if c is a closing bracket 
                if (stack.empty() || stack.top() != brackets[c]){ //if there is no opening bracket in the stack OR the last opening brakc is not the matching closing brack 
                    return false ;
                }
                //if we found in the last element of the stack the CORRESPONDING opening brack
                stack.pop();
            }
            else{ //if the character is a opening tag we put it in the stack
                stack.push(c);
            }
        }
        //once we loop through all chars, if the stack is empty it means all opening tags are closed correctly
        return stack.empty(); 
    }
};