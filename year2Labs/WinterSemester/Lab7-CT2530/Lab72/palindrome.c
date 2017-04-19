
#include <stdlib.h>
#include "reverse.h"

int palindrome(char* word){
    int result = 1;
    int i = 0;
    char* word_reversed = (char*)malloc(sizeof(word));

    reverse(word, word_reversed);
    while(word[i] != '\0'){
        if(word[i] != word_reversed[i]){
            result = 0;
        }
        i++;
    }
    return result;
    
}
