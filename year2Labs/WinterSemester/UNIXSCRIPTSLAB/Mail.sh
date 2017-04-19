#!/bin/bash
#This will take in terminal argument for a c filename.c and compile it, then run it

#run this scrip as "./car.sh file.c

#gcc $1 && ./a.out

counter=1
now=$(date +"%T")
echo MAILING FILE: $1
shift ## Shifts to the next argument
for i in $*

do
counter=$(( $counter + 1))

echo Sending file to: $i at date $now

done

