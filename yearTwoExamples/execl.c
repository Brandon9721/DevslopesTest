#include <stdio.h>
#include <unistd.h>
int main(int argc, char** argv) {
    printf("Here comes the date\n");
    execl("/bin/date", "", NULL);
    printf("That was the date\n");
    return 0;
}
