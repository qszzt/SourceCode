#include <stdio.h>
#include <stdlib.h>

int main()
{
    float h,w,t;
    printf("输入：身高：(千克）体重：（米）");
    scanf("%f %f",&h,&w);
    t=w/(h*h);
    if(t<18)
        printf("低体重");
    else if(t>=18&&t<25)
         printf("正常体重");
    else if(t>=25&&t<27)
         printf("超重体重");
    else
         printf("肥胖");
    return 0;
}
