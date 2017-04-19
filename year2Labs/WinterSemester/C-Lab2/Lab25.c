/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *  C Lab25 - http://branko-cirovic.appspot.com/CT2530/Labs/Lab2.html  *
 *  Name: Brandon Byrne (20115464)                                     *
 *  Date: Jan. 29, 2017                                                *
 *  Instructor: Keith Bussey                                           *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

#include <stdio.h>

void shift(int *, int *, int *); // prototype function declariation

int main(int argc, char **argv) {
    
    int x;
    int y;
    int z;
    int n;
    int arr[3]; // initialize variables
    
    for(int i = 1; i <= 3; i++) {
        
        printf("\nPlease enter an integer for slot %i: ", i);
        
        while (scanf("%i",&n) != 1) { // loop until user inputs a number instead of a letter
            printf("You did not enter a number\n");
            printf("\nPlease enter an integer for slot %i: ", i);
            
            scanf("%*s"); // %*s tells scanf to ignore inputs that are not numbers
        }

        arr[i - 1] = n; // store user inputted values to array
        
    }
    
    x = arr[0];
    y = arr[1];
    z = arr[2];
    
    
    printf("\n\nOriginal order: %i  %i  %i\n\n",x,y,z);
    
    printf("call void shift()\n\n");
    
    shift(&x, &y, &z); // calls shift with pointers as parameters to shift x, y and z around
    
    printf("Shifted values: %i  %i  %i\n\n",x,y,z);
    
    
    return 0; // end program
}

void shift(int *xptr, int *yptr, int *zptr) {
    int temp = *xptr;
    int temp2 = *yptr; // set temporary variables so values are not overwritten
    
    *xptr = *zptr;
    *yptr = temp;
    *zptr = temp2;
}
