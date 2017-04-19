/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *  C Lab27 - http://branko-cirovic.appspot.com/CT2530/Labs/Lab2.html  *
 *  Name: Brandon Byrne (20115464)                                     *
 *  Date: Feb. 1, 2017                                                 *
 *  Instructor: Keith Bussey                                           *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
#include <stdio.h>

int sum(int num[], int size);
int findLargest(int num[], int size);
int findSmallest(int num[], int size); // declare prototype functions

int main(int argc, char **argv) {
    int num[5];
    int arrSize = sizeof(num) / sizeof(num[0]);
    int userNum;
   
    
    printf("\nEnter 5 integers as input one at a time\n");
    for(int i = 1; i <= 5; i++) {
        
        printf("\nPlease enter an integer for slot %i: ", i);
        
        while (scanf("%i",&userNum) != 1) { // loop until user inputs a number instead of a letter
            printf("You did not enter a number\n");
            printf("\nPlease enter an integer for slot %i: ", i);
            
            scanf("%*s"); // %*s tells scanf to ignore inputs that are not numbers
        }
        
        num[i - 1] = userNum; // store user inputted values into an array
    }
    
    printf("\nSlot 1: %i   Slot 2: %i   Slot 3: %i   Slot 5: %i   Slot 5: %i\n\n", num[0],
           num[1], num[2], num[3], num[4]);// check to make sure elements stored in array properly
    
    printf("\n\nSum of the integers in the array: %i\n", sum(num, arrSize));
    
    printf("\nLargest number in the array: %i\n", findLargest(num, arrSize));

    printf("\nSmallest number in the array: %i\n\n", findSmallest(num, arrSize)); // calls functions and prints results

    
    return 0;
}

int sum(int num[], int size) {
    int answer = 0;
    for(int i = 0; i < size; i++) { //
        answer += num[i]; // add each element of array together and store value in answer
    }
    return answer;
}

int findLargest(int num[], int size) {
    
    int max = num[0];
    for(int i = 0; i < size; i++) {
        if(num[i] > max) {
            max = num[i];
        } // loop through array comparing values to see whats the largest
    }
    
    return max;
}

int findSmallest(int num[], int size) {
    
    int min = num[0];
    for(int i = 0; i < size; i++) {
        if(num[i] < min) {
            min = num[i];
        } // loop through array comparing values to find the smallest element
    }
    
    return min;
    
}
    
    

