#include <iostream>

using namespace std;

int main()
{
   //mean,median,mode


      int arr[]={1,2,3,1,2,2,6};
      float sum=0;
      int n=sizeof(arr)/sizeof(arr[0]);
 
  // Mean
  for(int i=0;i<n;i++)
  {
      sum=sum+arr[i];
  }
  printf("The Size of the array is %d\n",n);
  printf("Mean: %.2f\n",sum/n);
  
  // Median
  if(n%2!=0)
  {
    printf("Median %d\n",arr[((n-1)/2)+1]); //If odd
  }
  else
  {
    printf("Median %d\n",arr[(n-1)/2]+arr[((n-1)/2)+1]); // If even
  }
  
  // Mode
  int buf[1000]={0};
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(arr[i]==arr[j])  //1 2 3 4 1 2
      {
        buf[i]++;      // incrementing count using buffer array
      }
    }
  }
  int max=0;
  for(int i=0;i<1000;i++)
  {
    if(buf[i]>0)  
    {
      if(buf[i]>max)
      {
        max=buf[i];        // max count element
      }
    }
  }
  printf("Mode %d\n",max);
  return 0;

}