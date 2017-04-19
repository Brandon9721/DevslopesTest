#include <stdio.h>
#include <stdlib.h>
#include <errno.h>
#define READWRITE 06
int main(int argc, char** argv) {
    if(argc < 2) {
        printf("usage: rw filename\n");
        exit(1);
    }
    if(access(argv[1], READWRITE) == 0)
        printf("RW\n");
    else
        printf("System error number: %d\n", errno);
    perror("SWAG");
    
    
    int i;
    
    for(i = 1; i < sys_nerr; i++)
        printf("\n%d %s\n", i, sys_errlist[i]);
    return 0;
}


