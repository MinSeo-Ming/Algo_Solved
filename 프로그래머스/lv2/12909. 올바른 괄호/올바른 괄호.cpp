#include<string>
#include <iostream>
#include <stack>

using namespace std;

bool solution(string s)
{
    bool answer = true;
    stack<char> stack ;
    for(int i=0; i<s.size(); i++){
        if(i==0 && s[i]==')'){
            return false;
        }
        if(s[i]==')'){
            if(!stack.empty()&&stack.top()=='('){
                stack.pop();
            }else{
                return false;
            }
        }else{
            stack.push(s[i]);
        }
    }
    
    if(stack.empty())
        return true;
    return false;

    
    return answer;
}