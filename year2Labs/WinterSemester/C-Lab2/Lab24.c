/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *  C Lab24 - http://branko-cirovic.appspot.com/CT2530/Labs/Lab2.html  *
 *  Name: Brandon Byrne (20115464)                                     *
 *  Date: Jan. 29, 2017                                                *
 *  Instructor: Keith Bussey                                           *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
#include <stdio.h>

int main(int argc, char **argv) {
    int num;
    char letter;
    
    num = 25;
    letter = 'R';
    
    printf("\n\ninitial values:\n");
    printf("int: %i\nchar: %c\n\n", num, letter); // print set values
    
    printf("**************\n");
    
    int *iptr = &num;
    char *cptr = &letter; // set pointers
    
    *iptr = 14;
    *cptr = 'D'; // using pointers change the intial values
    
    printf("\n\npointers reassigned values in address to:\n");
    printf("int: %i\nchar: %c\n\n", num, letter);
    
    return 0;
}
