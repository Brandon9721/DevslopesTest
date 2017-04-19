#include <stdio.h>
#include <stdlib.h>
#define READWRITE 06
int main(int argc, char** argv) {
    if(argc < 2) {
        printf("usage: rw filename\n");
        exit(1);
    }
    if(access(argv[1], READWRITE) == 0)
        printf("RW\n");
    return 0;
}
