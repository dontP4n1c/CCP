#include <stdio.h>
int main(void) {
 double res = 1, fat = 1;
 
while (fat <=15){
 
res =res * fat;
 
fat++;
 
}
 
printf("O numero fatorial eh: %f\n",res);
 
return 0;
 }