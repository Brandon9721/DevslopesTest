// Brandon Byrne (20115464)
// Jan. 24, 2017
#include <stdio.h>
#include <ctype.h>

int main(int argc, char **argv) { // main function starts program
    int n;
    int sum; // initialize needed values
    
    printf("\nAn alternating series equation is presented:\n\n\tn"
           "\n\tΣ(-1)^(i-1)i = 1 - 2 + 3 - 4 ... n\n      (i=1)\n\n");
    // present user with the alternating series equation
    
    
    while(n <= 0 || !isdigit(n)) // loop until user enters a positive integer
    {
        printf("Please enter a value for n: ");
        scanf("%i", &n); // prompt user for input and store value
        printf("\n\n");
        
        if(n <= 0) { // ignore numbers less than 1
            printf("Please enter an integer above 0\n\n");
        } else {
            for(int i = 1; i <= n; i++) { // loop n times, where n = user input
                printf("%i\n", i); // prints values up to n
                if(i % 2 != 0) { // this ifelse statement determines the
                    sum += i;    // alternating signs (n + n - n + n...)
                } else {         // while also adding each value into sum
                    sum -= i;
                }
            }
            break; // break while loop once for loop reaches n
        }
    }
    
    printf("\nFinal sum = %i\n\n", sum); // print final result

    return 0; // end program
}
