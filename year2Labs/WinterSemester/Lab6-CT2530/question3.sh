#!/bin/bash

for i in $*
	do
	
		echo $i
		case $i in
		[ABC]) num=${num}'0';;
		[DEF]) num=${num}'1';;
		[GHI]) num=${num}'2';;
		[JKL]) num=${num}'3';;
		[MNO]) num=${num}'4';;
		[PQR]) num=${num}'5';;
		[STU]) num=${num}'6';;
		[VWX]) num=${num}'7';;
		[YZ]) num=${num}'8';;
		*) echo "Invalid character";exit;;
		esac
	done 
	echo $num
	

	