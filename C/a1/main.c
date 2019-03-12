#include <stdio.h>
#include <stdlib.h>

int main()
{
    char sex,sports,diet;
    float faHeight,moHeight,height;
    printf("输入：性别：父亲身高：母亲身高：是否喜爱体育锻炼：是否有良好的饮食习惯：");
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
             printf("你的身高是:%f",height);
         }
         else if(diet=='N')
         {
            height=height;
            printf("你的身高是:%f",height);
         }
         else
            printf("error");
     }
     else if(sports=='N')
     {
         if(diet=='Y')
         {
            height=height*(1+0.15);
            printf("你的身高是:%f",height);
         }
         else if(diet=='N')
         {
            height=height;
            printf("你的身高是:%f",height);
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
                printf("你的身高是:%f",height);
            }
            else if(diet=='N')
            {
                height=height;
                printf("你的身高是:%f",height);
            }
            else
                printf("error");
        }
        else if(sports=='N')
        {
            if(diet=='Y')
            {
                height=height*(1+0.15);
                printf("你的身高是:%f",height);
            }
            else if(diet=='N')
            {
                height=height;
                printf("你的身高是:%f",height);
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
