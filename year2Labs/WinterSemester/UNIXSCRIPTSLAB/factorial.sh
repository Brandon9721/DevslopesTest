#!/bin/bash

counter=12
factorial=1

while [ $counter -gt 0 ]
do
    factorial=$(( $factorial * $counter ))
    counter=$(( $counter - 1))
done
echo $factorial
