#!/bin/bash

# Generate characters into chardump.txt file
cat /dev/urandom | tr -dc 'a-c' | head -c 1000000 > chardump.txt # 1. modify this line

counts=()                                                        # initialize array that will hold character counts
alphas=("a" "b" "c")                                             # 2. modify this line
index=0                                                          # intialize index counter

# For each character in alphas, run the for loop
for character in "${alphas[@]}"                                 
do

    # Save the number of characters into count[index]
    counts[$index]=$(grep -o $character "chardump.txt" | wc -l)  
    let index=index+1                                           # increment index

done

index=0                                                         # index iterator
sum=0                                                           # hold sum of characters


# While index is less than the number of elements in the alphas array, iterate through the while loop
while [ $index -lt "${#alphas[@]}" ]
do

  echo "Count of char xxx is xxx"                               # 3. modify this line
  #let sum=sum+fillmein                                         # 4. modify this line
  index=$(( index+1 ))                                          # increment counter

done

echo "Sum found: $sum"                                          # print sum found (this should be 1,000,000)
index=0

# While index is less than the number of elements in the alphas array, iterate through the while loop
while [ $index -lt "${#alphas[@]}" ]
do

  percentage=$(( (${counts[$index]} * 100) / $sum))             # calculate frequency
  echo "Frequency of char ${alphas[$index]} is xxx %"           # 5. modify this line
  let index=index+1                                             # increment index

done
