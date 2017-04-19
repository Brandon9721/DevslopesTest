
#include <stdio.h>
#include "palindrome.h"

int main(int argc, char** argv){
    char word[20];
    char *testWord = word;
    printf("\nPlease enter a word to check if it is a palindrome: ");
    scanf("%s", word);

    if (palindrome(testWord)) {
        printf("%s is a palindrome\n", testWord);
    } else {
        printf("%s is not a palindrome\n", testWord);
    }

    return 0;
}