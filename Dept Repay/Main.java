#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,t;
  double i,a,d,f;
  cin>>p>>r>>t;
  i=p*r*t/100;
  a=p+i;
  d=i*2/100;
  f=a-d;
  
  cout<<i<<endl;
  cout<<a<<endl;
  cout<<d<<endl;
  cout<<f<<endl;
  
  return 0;

}