#!/bin/bash

set `date +"%m %d %y"`
year=$3
month=$1
day=$2

echo Days since Janurary 1st, 1900:
since=`expr \( $year + 100 \) \* 365 + $month \* 30 + $day`
echo $since