#include <string.h>
#include <stdio.h>
void reverse(char *name, char *rName) {
    int i = 0;
    char temp;
    int length = strlen(name);
    // printf("name: %s\n", name);
    for(i = 0; i < length; i++) {
        rName[i] = name[length - 1 - i];
    }
    rName[length] = '\0';
   
}