#!/bin/sh

#  findlinks.sh



if [ $# != 2 ]
then
echo "usage: findlinks.sh file dir"
exit
fi
file=$1
dir=$2
set -- `ls -l $file`
link_count=$2

if [ $link_count = 1 ]
then
echo "No other files are linked to $file"
exit
fi
set -- `ls -i $file`
inode=$1
echo "Linked files:"
find $dir -inum $inode -print
