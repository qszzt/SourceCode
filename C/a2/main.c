#include <stdio.h>
#include <stdlib.h>

int main()
{
    float h,w,t;
    printf("���룺��ߣ�(ǧ�ˣ����أ����ף�");
    scanf("%f %f",&h,&w);
    t=w/(h*h);
    if(t<18)
        printf("������");
    else if(t>=18&&t<25)
         printf("��������");
    else if(t>=25&&t<27)
         printf("��������");
    else
         printf("����");
    return 0;
}
