#include <iostream>

using namespace std;

int main()
{
    int t=1;
    cin>>t;
    while(t--)
    {
        long long n,i;
        cin>>n;
        long long res=1;
        long long a[n];
        for(i=0; i<n; i++)
            cin>>a[i];
        for(int i=0 ; i<n ; i++){
            if(a[i]==1){
                if(i>0 && a[i-1]==1)
                    res+=5;
                else res++;
            }
            else{
                if(i>0 && a[i-1]==0){
                    res = -1;
                    break;
                }
            }
        }
        cout<<res<<endl;
    }
}
