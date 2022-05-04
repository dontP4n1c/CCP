#include <stdio.h>
unsigned int Comb(unsigned int n, int k)
{
 if(k==1)
 
return n;
 else if (k == n) 
 
return 1;
 else
 
return Comb(n-1 , k-1) + Comb(n-1 ,k);
}
int main(void) {
 int x = Comb(5 , 3);
 printf("%d",x);
 return 0;
 }