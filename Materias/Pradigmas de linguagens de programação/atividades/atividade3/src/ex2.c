#include <stdio.h>
unsigned int A(unsigned int m, int n)
{
 if(m==0)
 
return n+1;
 else if (m > 0 && n==0) 
 
return A(m-1 , 1);
 else
 
return A(m-1 , A(m,n-1));
}
int main(void) {
 int x = A(2 , 3);
 printf("%d",x);
 return 0;
 }