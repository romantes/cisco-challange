#!/bin/bash

for i in $(cat $1); 
do echo $i ; 
done | sort | uniq -c | sort -bnr -k 1;
