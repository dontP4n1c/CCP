#include <stdio.h>
int f(int *x, int y) {
 *x=1;
 y=1;
 printf("Endereços (l-values) no RA de f:\n%p %p\n",&x,&y);
 printf("Valores (r-values) de f:\n");
 printf("%d %d\n",*x,y);
 return *x+y;
}
int main(void) { 
 int x=0,y=0,z=0;
 printf("Endereços (l-values) da main:\n%p %p %p\n",&x,&y,&z);
 printf("Valores (r-values) da main:\n%d %d %d \n",x,y,z);
 z = f(&x,y);
 printf("Novos valores (r-values) após chamar f:\n%d %d %d\n",x,y,z);
 return 0;
}