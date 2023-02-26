#include <string>
#include <iostream>
#include <sstream>
#include<algorithm>
#include <vector>

using namespace std;

string solution(string s) {
    istringstream ss(s);
    string temp;
    vector <int> x;
    while(getline(ss, temp,' ')){
        x.push_back(stoi(temp));
    }
    sort(x.begin(),x.end());
    string answer = "";
    string b = to_string(x[0]);
    string c = to_string(x[x.size()-1]);
    answer.append(b);
    answer.append(" ");
    answer.append(c);
    return answer;
}