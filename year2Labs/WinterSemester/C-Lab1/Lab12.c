// Brandon Byrne (20115464)
// Jan. 23, 2017

#include <stdio.h>
#include <stdlib.h> // include needed header files

// no error handling for if user enters wrong values
int main(int argc, char **argv) { // start program
    
    char buff[80];
    char c;
    int n;
    float f; // initialize needed variables
    
    printf("Enter an integer: ");
    fgets(buff, sizeof(buff), stdin); // prompt and save user input into buffer
    
    n = atoi(buff); // array to integer, takes value out of buffer and saves it to n
    
    printf("Enter a float: ");
    fgets(buff, sizeof(buff), stdin); // prompt and save user input
    
    f = atof(buff); // save value in buffer array to float
    
    printf("Enter a character: "); // prompt user to enter letter to save into c
    
    c = getchar();
   
    printf("\n%c is a character\n", c);
    
    printf("%d is an integer\n", n);
    
    printf("%f is a real number\n", f); // prints out each user input
  
    return 0; // end program
}
