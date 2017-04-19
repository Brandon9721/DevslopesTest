#include <stdio.h>
#include <ctype.h> // include needed libraries

int main(int argc, char **argv) { // start program
    
    char letter;
    char choice; // initialize vars
    
    printf("\nEnter a letter to see if it is a vowel: ");
    scanf("%s", &letter); // prompt and save input

    choice = toupper(letter); // converts users input to uppercase, reason is to reduce number of cases
    
    switch (choice) { // will print is a vowel if choice is A,E,I,O,U, or Y
        case 'A':     // lowercase letters not needed for case because of toupper
        case 'E':     // function above
        case 'I':
        case 'O':
        case 'U':
        case 'Y':
            printf("\n%c is a vowel.\n\n", letter);
            break; // ends switch
    
        default:
            printf("\n%c is not a vowel.\n\n", letter);
            break; // ends switch
    }
    
    return 0; // end program
}
