#include<iostream>
using namespace std;
int main(){
        int start,end;
        cin>>start>>end;

        bool *arr;
        arr =new bool[end+1];

        for(int i=2; i<=end; i++)
                arr[i]=true;

        for(int i=2; i<=end; i++){//i가 나누는 수
                if(arr[i]==false)
                        continue;
                for(int j= i+i; j<=end; j +=i){
                        arr[j]=false;
                }
        }

        for(int i=start; i<=end; i++){
                if(arr[i]==true)
                        cout<<i<<"\n";
        }
}