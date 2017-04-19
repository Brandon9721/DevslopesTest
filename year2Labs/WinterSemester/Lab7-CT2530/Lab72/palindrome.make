palindrome: main2.o palindrome.o reverse.o
	gcc main2.o palindrome.o reverse.o -o palindrome
reverse.o: reverse.c reverse.h
	gcc -c reverse.c
main2.o: main2.c palindrome.h
	gcc -c main2.c
palindrome.o: palindrome.c reverse.h
	gcc -c palindrome.c


