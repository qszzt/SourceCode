#include <stdio.h>
#include <stdlib.h>

int main()
{
    char sex,sports,diet;
    float faHeight,moHeight,height;
    printf("���룺�Ա𣺸�����ߣ�ĸ����ߣ��Ƿ�ϲ�������������Ƿ������õ���ʳϰ�ߣ�");
    scanf("%c %f %f %c %c",&sex,&faHeight,&moHeight,&sports,&diet);
    if(sex=='F')
    {
     height=(faHeight*0.923+moHeight)/2;
     if(sports=='Y')
     {
         height=height*(1+0.02);
         if(diet=='Y')
         {
             height=height*(1+0.15);
             printf("��������:%f",height);
         }
         else if(diet=='N')
         {
            height=height;
            printf("��������:%f",height);
         }
         else
            printf("error");
     }
     else if(sports=='N')
     {
         if(diet=='Y')
         {
            height=height*(1+0.15);
            printf("��������:%f",height);
         }
         else if(diet=='N')
         {
            height=height;
            printf("��������:%f",height);
         }
         else
            printf("error");
     }
     else
        printf("error");
    }
    else if(sex=='M')
    {
        height=(faHeight+moHeight)*0.54;
        if(sports=='Y')
        {
            height=height*(1+0.02);
            if(diet=='Y')
            {
                height=height*(1+0.15);
                printf("��������:%f",height);
            }
            else if(diet=='N')
            {
                height=height;
                printf("��������:%f",height);
            }
            else
                printf("error");
        }
        else if(sports=='N')
        {
            if(diet=='Y')
            {
                height=height*(1+0.15);
                printf("��������:%f",height);
            }
            else if(diet=='N')
            {
                height=height;
                printf("��������:%f",height);
            }
            else
                printf("error");
        }
        else
           printf("error");
    }
    else
        printf("error");
    return 0;
}
