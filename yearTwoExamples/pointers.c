#include <stdio.h>
 
int main(int argc, char **argv) {
    int a = 5, b = 2;
    int *iptr;
    iptr = &a;
    printf("%i %i\n", a, b);
    *iptr = 2;
    printf("%i %i\n", a, b);
    iptr = &b;
    *iptr = 5;
    printf("%i %i\n", a, b);
    return 0;
}