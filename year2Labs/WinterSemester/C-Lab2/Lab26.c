/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *  C Lab26 - http://branko-cirovic.appspot.com/CT2530/Labs/Lab2.html  *
 *  Name: Brandon Byrne (20115464)                                     *
 *  Date: Feb. 1, 2017                                                 *
 *  Instructor: Keith Bussey                                           *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

int countVowels(char word[]); // prototype function declaration

int main(int argc, char **argv) {
    char string[80];
    int vowels; // declare and initialize variables
    
    printf("\nEnter a string: ");
    fgets(string, sizeof(string), stdin); // save user input to string[]
    
    string[strcspn(string, "\n")] = 0; // *GETS RID OF '\n' - fget was saving newlines into buffer
    
    vowels = countVowels(string); // calls function and saves result into vowels
    
    printf("\nThe string '%s' has %i vowels\n\n", string, vowels);
    

    return 0; // end program
}


int countVowels(char word[]) {
    int result = 0;
    
    
    for(int i = 0; i < strlen(word); i++) {
        switch(word[i]) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'Y':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                result++; // for each vowel found in word array, increment result
                break;
                
            default: break;

        }
        
        }
    return result;
}
