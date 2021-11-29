#include <stdio.h>
#include <string.h>
int main() 
{
    char ch;
    char s[40];
    char sen[40];
    scanf("%c",&ch);
    scanf("%s",&s);
    scanf("\n");
    scanf("%[^\n]%*c", sen);
    printf("%c\n%s\n%s",ch,s,sen); 
    return 0;
}
