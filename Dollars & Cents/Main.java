#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2;
  cin>>d1>>c1>>d2>>c2;
  int d = d1+d2;
  int c = c1+c2;
  while(c>100){
  	c -=100;
    d++;
    break;
  }
  cout<<d<<"\n"<<c;
}