#include <stdio.h>

int main()
{

    int letter=0,blank=0,digit=0,other=0;
    char ch;
    for(i=1;i<10;i++)
    {
       ch=getchar();
       if('a'<=ch&&ch<='z'||'A'<=ch&&ch<='Z')
        letter++;
       else
        if(ch==' '||ch=='\n')
        blank++;
       else
        if('0'<=ch&&ch<='9')
           digit++;
       else
        other++;
    }
    printf("letter=%d;blank=%d;digit=%d;other=%d",letter,blank,digit,other);

}
