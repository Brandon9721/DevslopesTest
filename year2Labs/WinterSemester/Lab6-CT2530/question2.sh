#!/bin/bash

arg=$1
isArgThere=0

while read -r line
do
	line=`sed s/:/\ / <<< "$line"`
	set $line
	if [ "$1" = "$arg" ]
	then
		isArgThere=1
	fi
done < <(more /etc/passwd)

if [ "$isArgThere" = 1 ]
then
	echo "user $arg exists"
else
	echo "user $arg does not exist"
fi				
