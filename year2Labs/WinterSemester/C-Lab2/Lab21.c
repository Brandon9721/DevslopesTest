/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *  C Lab21 - http://branko-cirovic.appspot.com/CT2530/Labs/Lab2.html  *
 *  Name: Brandon Byrne (20115464)                                     *
 *  Date: Jan. 25, 2017                                                *
 *  Instructor: Keith Bussey                                           *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int isEven(int x); // define prototype function

int main(int argc, char **argv) {

    int number;
    int result;
    
    do {
        printf("\nPlease enter an integer: ");
        while (scanf("%i",&number) != 1) { // loop until user inputs a number instead of a letter
            printf("You did not enter a number\n");
            printf("\nPlease enter a positive integer: ");
            
            scanf("%*s"); // %*s tells scanf to ignore inputs that are not numbers
        }
        
        if(number < 0){
            printf("That is a negative number. Please ensure that you enter a positive integer\n");
        }
        
    } while (number < 0); // loops until user inputs a positive integer
        


    
    
    
    
    result = isEven(number); // calls isEven function and stores answer in 'result'
    
    if(result == 1) {
        printf("\n%i is even\n\n", number);
    } else {
        printf("\n%i is odd\n\n", number);
    }
    
    return 0;
} // end main

int isEven(int x) { // return 1 or 0 depending if it is evenly divisible by 2
    if(x % 2 == 0) {
        return 1;
    } else {
        return 0;
    }
}
