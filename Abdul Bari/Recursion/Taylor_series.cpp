#include<stdio.h>

double powerTerm=1;
double factTerm=1;
double Taylor(int x, int n){
    if(n==0){
        return 1;
    }

    else{
        double res= Taylor(x,n-1);
        powerTerm= x*powerTerm;
        factTerm=n*factTerm;
        return res + powerTerm/factTerm; 
    }

}
//Writing a taylor series function with O(n) number of multiplications instead of O(n^2).
double HornerTaylor(int x, int n){
    static double sum;
    if(n==0){
        return sum;
    }

    else{
        sum = 1+ (sum * double(x)/double(n));
        return HornerTaylor(x,n-1);
    }
}

double iterativeHornerTaylor(int x, int n){

    double sum=1;

    for(; n>0;n--){
        sum = 1 + sum*(double(x)/double(n));
    }

    return sum;
}
int main(int argc, char const *argv[])
{
    int numTerms=5;
    int x=11;

    printf("The value of e^x for x=%d is: %lf\nusing Horner's Rule it is: %lf\nUsing iterative Horner's rule it is:%lf",x,Taylor(1,100), HornerTaylor(1,100), iterativeHornerTaylor(1,100));
    return 0;
}
