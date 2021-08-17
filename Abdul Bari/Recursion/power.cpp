#include<stdio.h>


long long int pow(int base, int exp){
    
    if(exp==0)
        return 1;

    return base* pow(base,exp-1);

}

long long int fastpow(int base, int exp){
    if(exp==0)
        return 1;

    else if(exp %2 == 0){
        return fastpow(base*base, exp/2);
    }

    else
        return base*fastpow(base*base, (exp-1)/2);
}


int main()
{
    int base=2;
    int exp=10;

    printf("Base: %d \nPow: %d\nAnswer: %d\nFastPower: %d",base,exp,pow(base,exp), fastpow(base,exp));

    return 0;

}