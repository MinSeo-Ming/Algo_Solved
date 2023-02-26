#include <string>
#include <vector>

using namespace std;

vector<int> arr;

int solution(int n) {
    arr.push_back(0);
    arr.push_back(1);
    for(int i =2; i<=n; i++){
        arr.push_back((arr[i-1]+arr[i-2])%1234567);
    }
    return arr[n];
}