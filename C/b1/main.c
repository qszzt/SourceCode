#include <stdio.h>
#include <stdlib.h>

int main()
{
    float a,c;
    int b;
    printf("输入：本金：年限：(1/2/3/5/8)");
    scanf("%f %d",&a,&b);
    switch(b)
    {
        case 1:
            c=a*(1+0.0225);
            break;
        case 2:
            c=a*(1+0.0243);
            break;
        case 3:
            c=a*(1+0.027);
            break;
        case 5:
            c=a*(1+0.0288);
            break;
        case 8:
            c=a*(1+0.03);
            break;
    }
     printf("%f",c);
    return 0;
}
