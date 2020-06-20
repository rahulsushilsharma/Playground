#include<iostream>
#include <iomanip>
using namespace std;
int main()
{
  //Type your code here.
  double b = 0.00,a = 0.00;
  cin>>a>>b;
  if(a>3){
    cout<<"Number of items is more";
  }else{
    if (a<2){
      cout<<b;
    }
    if(a==2){
      b=b+(0.5*b);
      cout << setprecision (2) << fixed<<b;
    }
    if (a==3){
      b=2*b;  
      cout << setprecision (2) << fixed<<b;
    }
  }
  
  return 0;
}