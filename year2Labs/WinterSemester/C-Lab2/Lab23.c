/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *  C Lab23 - http://branko-cirovic.appspot.com/CT2530/Labs/Lab2.html  *
 *  Name: Brandon Byrne (20115464)                                     *
 *  Date: Jan. 29, 2017                                                *
 *  Instructor: Keith Bussey                                           *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

#include <stdio.h>

int isPrime(int x); // define prototype function
void generatePrimes(int n);

int main(int argc, char **argv) {
    int num;
    int result; // init variables
    
    do {
        printf("\nPlease enter a positive integer: ");
        
        while (scanf("%i",&num) != 1) { // loop until user inputs a number instead of a letter
            printf("You did not enter a number\n");
            printf("\nPlease enter a positive integer: ");
            
            scanf("%*s"); // %*s tells scanf to ignore inputs that are not numbers
        }
        
        if(num < 0){
            printf("That is a negative number. Please ensure that you enter a positive integer\n");
        }
    } while (num < 0); // loops until user inputs a positive integer

    printf("\n\n");
    generatePrimes(num);
    printf("\n\n");
//    result = isPrime(num);
//    
//    if(result == 0) {
//        printf("\n%i is not a prime number\n\n", num);
//    } else {
//        printf("\n%i is a prime number\n\n", num);
//    }
    
    
    return 0; // end program
}

int isPrime(int x) {
    if((x > 2 && x % 2 == 0) || x == 1 || x == 0) // 0, 1, and multiples of 2 are not prime
    {
        return 0;
    }
    
    for(int i = 3; i * i <= x; i += 2)
    {
        if(x % i == 0) // if number is a multiple of current loop index, it is not prime
        {
            return 0; // not prime
        }
    }
    
    return 1; // prime
}

void generatePrimes(int n) {
    int count = 0;
    int primes = 0;
    
    while(1) {
        if(isPrime(count) == 1) {
            printf("%i ", count);
            primes++;
        }
        if(primes == n) {
            break;
        }
        count++;
        
    }
    }
