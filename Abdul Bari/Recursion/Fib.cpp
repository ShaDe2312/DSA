#include<stdio.h>



int iterFib(int n){

    int sum,t0,t1;
    t0=0;
    t1=1;
    sum=0;

    if(n<=1)
        return n;

    for(int i=2; i<=n; i++){
        sum = t0+t1;
        t0=t1;
        t1=sum;
    }

    return sum;

}
int recFib(int n){

    if(n<=1){
        return n;
    }

    return recFib(n-2) + recFib(n-1);
}

int arr[20]={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
int memRecFib(int n){

    if(n<=1){
        arr[n]=n;
        return n;
    }

    else {
        if(arr[n-2]==-1){
            arr[n-2]=memRecFib(n-2);
        }

        if(arr[n-1]==-1){
            arr[n-1]=memRecFib(n-1);
        }

        return arr[n-2] + arr[n-1];
    }

}


int main(int argc, char const *argv[])
{
    int n=10;
    printf("The fib(n) for n= %d using Recursion is %d \n",n,recFib(n));
    printf("Using Iteration is: %d\n",iterFib(n));
    printf("Using Memoization is: %d\n",memRecFib(n));

    return 0;
}
