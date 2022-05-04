#include<stdio.h>
int A(int m, int n){
 
if(m==0){
 
printf("m(%d) = 0 então n(%d) + 1 = %d\n",m,n,n+1);
 
return n+1;
 
}
 
if(m>0 && n==0){
 
printf("m(%d) > 0 e n(%d)==0 então A(m(%d)-1, 1)\n", m, n, m);
 
return A(m-1, 1);
 
}
 
if(m>0 && n>0){
 
printf("m(%d)>0 e n(%d)>0 então A(m(%d),A(m(%d), n(%d)-1)\n",m,n, m,m,n);
 
return A(m-1,A(m, n-1)); 
}
}
int main(){
 int res = A(1, 2);
 printf("%d", res);
 ;}