#include<iostream>
using namespace std;
int main()
{
  int a,b,c=0;
  cin>>a>>b>>c;
  cout<<"Enter first number :"<<" Enter second number :"<<" Menu"<<endl;
  cout<<"1.Addition"<<endl;
  cout<<"2.Subtraction"<<endl;
  cout<<"3.Multiplication"<<endl;
  cout<<"4.Division"<<endl;
  cout<<"5.Remainder"<<endl;
  switch (c){
    case 1:
    cout<<a+b;
      break;
     case 2:
      cout<<a-b;
      break;
      case 3:
      cout<<a*b;
      break;
    case 4:
        cout<<a/b;
      break;
      case 5:
        cout<<a%b;
      break;
      default :
      cout<<"Invalid operation";
      break;
  }
  return 0;
}