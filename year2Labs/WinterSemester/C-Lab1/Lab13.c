#include <stdio.h>
#include <stdlib.h> // include needed headers/librarys

int main(int argc, char **argv) { // start program
    
    int num1, num2;
    char buff[80]; // initialize variables
    
    printf("\nThis program will perform basic math operations on two integers\n\n");
    printf("Enter first integer: ");
    fgets(buff, sizeof(buff), stdin); // prompt and save user input
    
    num1 = atoi(buff); // store buffer value to num1 as type int
    
    printf("\nEnter second integer: ");
    fgets(buff, sizeof(buff), stdin); // prompt and save user input
    
    num2 = atoi(buff); // stores second value to num2 from buffer
    
    
    
    // integers overflow if numbers are too big
    printf("\nYour numbers are: %d and %d\n\n", num1, num2); // print user numbers
    printf("Sum: %d\n", (num1 + num2)); // print sum
    printf("Difference: %d\n", (num1 - num2)); // print difference
    printf("Product: %d\n", (num1 * num2)); // print product
    printf("quotient: %d\n", (num1 / num2)); // print quotient
    printf("remainder: %d\n", (num1 % num2)); // print remainder
    
    return 0; // end program
}
