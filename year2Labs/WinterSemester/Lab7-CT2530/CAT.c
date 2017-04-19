#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <unistd.h>

#define BUFSIZE 8

int main(int argc, char** argv) {
	char buff[BUFSIZE];
	int n;
	int file1;
	int file2;

	printf("Number of args: %i", argc);

	if(argc == 1) {
		while((n == read(0, buff, BUFSIZE)) > 0) {
			write(1, buff, n);
		}
	} else if(argc == 3) { // program name, file1, file2
		printf("CATing files\n");
		file1 = open(argv[1], 0);

		if(file1 == -1) {
			perror("No file to open");
			return 1;
		}

		file2 = open(argv[2], O_WRONLY | O_APPEND);
		
		if(file2 == -1) {
			perror("No file2 to open");
			return 2;
		}

		// if both files exist continue after this
		while((n == read(file1, buff, BUFSIZE)) > 0) {
			write(file2, buff, n);
		}

		close(file1);
		close(file2);
	}

	else {
		printf("Usage: CAT\nor\nusage: CAT Source Destination\n");
	}
	return 0;
}
