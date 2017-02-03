// Brandon Byrne (20115464)
// Jan 24, 2017
#include <stdio.h>

int main(int argc, char **argv) { // start main function
    int n;
    int sum = 1;
    int i = 2; //initializes variables to be used below
    
    printf("\n\nEnter an integer to check if it is perfect: ");
    scanf("%i", &n); // prompt for user input and store in variable n
    
    
    
    if(n < 6)
    {
        printf("\n\n%i is not a perfect number\n\n", n); // anything less than 6 is not perfect
    } else {
        
        while(i <= n/2) // while loop continues until i increments above (n/2)
        {
            if(n % i == 0) // if 'i' is a factor of n, increment sum by i
            {
                sum += i;
            }
            i++; // increment counter so while loop isn't infinite
        }
   
        if(n == sum) // if n is the same as the sum of all factors
        {
            printf("\n\n%i is a perfect number\n\n", n); // it is perfect
        } else {
            printf("\n\n%i is not a perfect number\n\n", n); // else not perfect
        }
    }
    return 0; // end program
}


