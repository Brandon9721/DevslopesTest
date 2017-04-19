#!/bin/bash

for i in $*

do
if [ -f $1 ]
then
 newname=`echo $1 |tr 'A-Z' 'a-z'`; 
  mv $1 $newname
  
fi
done