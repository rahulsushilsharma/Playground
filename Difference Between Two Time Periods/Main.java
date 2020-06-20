#include<iostream>

using namespace std;

int main()

{

int hour1,min1,sec1;

int hour2,min2,sec2;

int diff_hour,diff_min,diff_sec;

cin>>hour1>>min1>>sec1;

cin>>hour2>>min2>>sec2;

if(sec2>sec1)

{

min1--;

sec1+=60;

}

diff_sec=sec1-sec2;

if(min2>min1) {

hour1--;

min1+=60;

}

diff_min=min1-min2;

diff_hour=hour1-hour2;

cout<<diff_hour<<":"<<diff_min<<":"<<diff_sec;

return 0;

}