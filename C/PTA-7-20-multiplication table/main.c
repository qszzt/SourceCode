#include <stdio.h>


int main()
{
     int i,j;
    int N;
    scanf("%d",&N);
    for(i=1;i<=N;i++)
    {
      for(j=1;j<=i;j++)
      {
        printf("%d*%d=%-4d",j,i,j*i);
      }
      printf("\n");
}
