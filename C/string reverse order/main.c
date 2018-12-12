#include <stdio.h>

int main()
{
    int N,K;
    scanf("%d %d\n",&N,&K);
    int i;
    char s[N][11];
    for(i=0;i<N;i++){
        gets(s[i]);
    }
    int j;
    char temp[11];
    for(i=1;i<N;i++){
       for(j=0;j<N-i;j++) {
        if(strcmp(s[j],s[j+1])>0){
            strcpy(temp,s[j]);
}
