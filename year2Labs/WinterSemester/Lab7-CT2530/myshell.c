
#include <stdio.h>
#include <string.h> 
#include <stdlib.h>    
int main(int argc, char** argv) {  
	char command[50];
	char exit[] = "exit";      
	
	
	while (1) { 
		printf("prompt system call:) ");
		gets(command);
		
		// if command is exit then terminate program  
		if(strcmp(command, exit) == 0){
			 break;
		 }
		 
		 // let linux execute command and catch an error
		 // if thereis one 
		 
		 else { 
			int err = system(command);
		
			if (err != 0) { 
				printf("Unkown Command...\n");
		    }
		}
	} 
    return 0;
}
