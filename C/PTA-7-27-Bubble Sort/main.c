#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a[102];
   int N,K;
   int i,j;
   int temp;
   scanf("%d %d",&N,&K);
   for(i=0;i<N;i++)
    {
      scanf("%d",&a[i]);
    }
    for(i=0;i<K;i++)
    {
     for(j=0;j<N-1-i;j++)
     {
        if(a[j]>a[j+1])
        {
          temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }
   for(i=0;i<N-1;i++)
   {
     printf("%d",a[i]);
     printf(" ");
   }
   printf("%d",a[N-1]);
}
