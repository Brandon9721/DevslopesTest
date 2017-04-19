
#include <stdio.h>
#include "reverse.h"

int main(int argc, char **argv) {
    char name[20];
    char reversed_name[20];
    char *before = name;
    char *after = reversed_name;
    



    printf("Enter name: ");
    scanf("%s", name);
    reverse(before, after);
    
    printf("\nReversed name: %s\n", after);
    
    

    return 0;
}







// #include <stdio.h>
// #include <string.h>
 
// void reverse(char [], char []);
 
// int main(int argc, char **argv) {
//     char word[80], rword[80];
//     printf("Enter word: ");
//     fgets(word, sizeof(word), stdin);
//     reverse(word, rword);
//     printf("Reversed word: %s\n", rword);
//     return 0;
// }
 
// void reverse(char w[], char rw[]) {
//     int i;
//     int length = strlen(w);
//     for(i = 0; i < length; i++) {
//         rw[i] = w[length - 1 - i];
//     }
//     rw[length] = '\0';!
// }