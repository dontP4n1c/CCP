#include <stdio.h>
int y = 4;
int f(int *x) {
 *x=1;
 printf("Endereços (l-values) da RA de f:\n%p %p\n",&x,&y);
 printf("Valores (r-values) de f:\n%d %d\n",*x,y);
 return *x+y;
}
int main(void) {
 int x=0,z=0,*p;
 p = &x;
 printf("Endereços (l-values) da main:\n%p %p %p\n",&x,&y,&z);
 printf("Valores (r-values) da main:\n%d %d %d\n",x,y,z);
 z = f(p);
 printf("Novos valores (r-values) após chamar f:\n%d %d %d\n",x,y,z);
 return 0;
}