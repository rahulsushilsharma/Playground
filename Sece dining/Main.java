#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  int b;
  cin>>str>>b;

 if (str== "front")
    {
      if(b==1)
      {
        cout<<"Left Handed";
      }
   else
   {
     cout<<"Right Handed";
   }
    }
   if (str=="rear")
  {
     if(b==1)
     {
       cout<<"Right Handed";
     }
   else
   {
     cout<<"Left Handed";
   }
  }
  
  return 0;
  
}