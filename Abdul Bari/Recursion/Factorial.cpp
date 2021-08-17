#include<stdio.h>

int fact(int n){

    if(n==0)
        return 1;
    
    else
        return n*fact(n-1);

}


int main(){

    int f=5;
    printf("Fact of %d is %d", f , fact(f));
    return 0;

}