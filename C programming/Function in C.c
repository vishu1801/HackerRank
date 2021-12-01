#include <stdio.h>

int max_of_four(int a, int b, int c, int d){
    int temp;
    temp = max(a,b);
    temp = max(temp,c);
    temp = max(temp,d);
    return temp;
}

int max(int a, int b){
    if(a>b){
        return a;
    }
    return b;
}

int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    
    return 0;
}

