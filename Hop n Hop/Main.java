#include<iostream>
#include <cmath>
using namespace std;
int main()
{
  //Type your code here.
  int x,y;
  cin>>x>>y;
  int a = x-3;
  int b = y-4;
  a *= a;
  b *= b;
  int out = sqrt(a+b);
  cout<<out;
}