

main.o: main.c fibonacci.h
    gcc -c main.c
    
fibonacci.o : fibonacci.c
    gcc -c fibonacci.c


fibonacci: main.o fibonacci.o
     gcc main.o fibonacci.o -o fibonacci