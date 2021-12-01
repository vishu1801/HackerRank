#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
	
    int n, temp=0;
    scanf("%d", &n);
    //Complete the code to calculate the sum of the five digits on n.
    while(n>0){
        temp = temp+n%10;
        n=n/10;
    }
    printf("%d",temp);
    return 0;
}

