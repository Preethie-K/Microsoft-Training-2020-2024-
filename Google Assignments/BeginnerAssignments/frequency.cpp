
#include <iostream>

using namespace std;

int main()
{
   //char freq
     int buf[128]={0};
     int count=0;
     string str;
     cin>>str;
     for(int i=0;i<str.length();i++)
     {
         buf[str[i]]++;
     }
     cout<<"Frequency of characters is  \n";
     for(int i=0;i<127;i++)
     {
        if(buf[i]>0)
        {
            cout<<(char)i<<" "<<buf[i]<<" ";
            cout<<" \n";
        }
     }
     
 }