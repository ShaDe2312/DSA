#include<stdio.h>

int sumN=0;
int sum(int n){

    if(n==0){
        return 0;
    }

    else{
        sumN= sum(n-1)+n;
        return sumN;
    }
}

int main(){
    int n=7;
    printf("Sum of first %d Natural Numbers is: %d" ,n, sum(n));
    return 0;
}