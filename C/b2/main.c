#include <stdio.h>
#include <stdlib.h>

int main()
{
    char ch;
    printf("输入：");
    ch=getchar();
    if(ch>=65&&ch<=90)
    {
        ch=ch+32;
        printf("%c %d",ch,ch);
    }
    else if(ch>=97&&ch<=122)
    {
        ch=ch-32;
        printf("%c %d",ch,ch);
    }
    else{
        printf("%c %d",ch,ch);
    }
    return 0;
}
