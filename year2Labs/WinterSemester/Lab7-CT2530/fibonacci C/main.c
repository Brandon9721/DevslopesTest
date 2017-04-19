#include <stdio.h>
#include "fibonacci.h"
 
int main(int argc, char **argv) {
  int i, n;
  char temp[256];
 
  printf("Enter an integer: ");
  fgets(temp, 256, stdin);
  n = atoi(temp);
 
  for(i = 1; i <= n; i++)
    printf("%d ", fibonacci(i));
 
  return 0;
}