#include <stdio.h> // include standard input/output

int main(int argc, char **argv) { // start program
    
    int grade;
    char percent = '%'; // initialize vars
    
    printf("\nEnter grade percentage as an integer: ");
    scanf("%d", &grade); // prompt and save user input
    
    if(grade > 100 || grade < 0) {
        printf("%d%c is outside the bounds of 0 to 100. \n", grade,percent);
    } else if(grade <= 100 && grade >= 85) {
        printf("%d%c is the grade equivalent of 'A'.\n\n", grade,percent);
    } else if(grade <= 84 && grade >= 65) {
        printf("%d%c is the grade equivalent of 'B'.\n\n", grade,percent);
    } else if(grade <= 64 && grade >= 55) {
        printf("%d%c is the grade equivalent of 'C'.\n\n", grade,percent);
    } else if(grade <= 54 && grade >= 50) {
        printf("%d%c is the grade equivalent of 'D'.\n\n", grade,percent);
    } else {
        printf("%d%c is the grade equivalent of 'F'.\n\n", grade,percent);
    } // if statement will print result depending on number the user inputs
    return 0; // end program
}
