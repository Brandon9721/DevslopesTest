#include <stdio.h>
 
int fibonacci(int);
 
int main(int argc, char **argv) {
  int i, n;
  char temp[256];
 
  printf("Enter an integer: ");
  gets(temp);
  n = atoi(temp);
 
  for(i = 1; i <= n; i++)
    printf("%d ", fibonacci(i));
 
  return 0;
}
 
int fibonacci(int n) {
  if(n == 1 || n == 2)
    return 1;
  else
    return fibonacci(n - 1) + fibonacci(n - 2);
}