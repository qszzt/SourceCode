#include <stdio.h>
long multiply(int m);
int main()
{   int n,i;
    int m=0;
    scanf("%d",&n);
    for(i=1;m<n;i++)
    {
        m+=multiply(i);
    }
        printf("%d",i-2);

}
long multiply(int m)
{
    if(m==0)
        return 1;
    else if(m<0)
        return -1;
    else
        return m*multiply(m-1);
}
