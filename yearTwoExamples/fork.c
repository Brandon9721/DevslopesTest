#include <stdio.h>
#include <sys/types.h>
int main()
{
    printf("HELLO\n");
    fork();
    printf("BYE");
    
    
    return 0;
}
