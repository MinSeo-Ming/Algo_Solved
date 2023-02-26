#include <iostream>
#include<vector>
#include<algorithm>
using namespace std;

bool com (int a, int b){
    if(a>b) return true;
    return false;
}

int solution(vector<int> A, vector<int> B)
{
    sort(A.begin(),A.end());
    sort(B.begin(),B.end(),com);
    int answer =0;
    for(int i=0; i<A.size(); i++){
        answer += A[i]*B[i];
    }

    return answer;
}