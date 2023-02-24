#include <string>
#include <vector>

using namespace std;

string solution(int num) {
    string odd = "Odd";
    string even = "Even";
    string answer = "";
    if(num%2==0)
        return even;
    else 
        return odd;
}