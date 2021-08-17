#include<stdio.h>

int fact(int n){

    if(n==0)
        return 1;
    
    else
        return n*fact(n-1);

}

long int ncrNormal(int n, int r){

    int n1 = fact(n);
    int r1=fact(r);
    int nminusr=fact(n-r);

    return n1/(nminusr * r1);
}

long int ncr(int n, int r){

    if(r==0 || n==r){
        return 1;
    }

    return ncr(n-1,r-1) + ncr(n-1,r);
}

int main(int argc, char const *argv[])
{
    int n=10;
    int r=2;
    printf("%d C %d = %d %d", n,r,ncr(n,r), ncrNormal(n,r));
    return 0;
}
