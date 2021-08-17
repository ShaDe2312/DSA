#include<stdio.h>
/*
n -> Number of disks
a-> SOURCE TOWER
b-> AUXILLARY TOWER
c-> DESTINATION TOWER
*/
void TOH(int n, int a, int b, int c){


    if(n>0){
    TOH(n-1,a,c,b); //Move from A to B, using C
    printf("Move disk from %d to %d\n",a,c);
    TOH(n-1,b,a,c); //Move from B to C, using A
    }
}

int main(int argc, char const *argv[])
{
    TOH(3,1,2,3);
    return 0;
}
