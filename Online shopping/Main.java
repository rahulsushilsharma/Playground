#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fd,fs,ft,fq;
  int sa,sd,ss,st,sq;
  int aa,ad,as,at,aq;
  cin>>fa>>fd>>fs;
  cin>>sa>>sd>>ss;
  cin>>aa>>ad>>as;
 fq=fa*fd/100;
 sq=sa*sd/100;
  aq=aa*ad/100;
  
  ft=fa-fq+fs;
  st=sa-sq+ss;
  at=aa-aq+as;
  cout<<"In Flipkart Rs."<<ft<<endl;
  cout<<"In Snapdeal Rs."<<st<<endl;
  cout<<"In Amazon Rs."<<at<<endl;
  
  
  if (at<st&&at<ft)
  {
    cout<<"He will prefer Amazon";
    
  }
  else if (st<at&&st<ft)
  {
    cout<<"He will prefer Snapdeal";
    
  }
  else
  {
    cout<<"He will prefer Flipkart";

  }
}