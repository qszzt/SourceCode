#include <stdio.h>

int main()
{   int a[1000];
    int i;
    int j=0;
    for(i=0;i<1000;i++)
    {
        scanf("%d",&a[i]);
        if(a[i]>0)
            j+=a[i];
        else if(a[i]<0)
         j=j;
        else
            printf("%d",j);
    }


}
