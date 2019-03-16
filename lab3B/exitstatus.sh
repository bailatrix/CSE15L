#!/bin/bash

echo -e "Successful execution: echo \"hello world\""
echo -e "===================="
echo "hello world"
#Exit status returns 0 because the above command was successful
echo -e "Exit Status" $?
i
echo -e "\nIncorrect usage: ls --option"
echo -e "====================="
ls --option
#Incorrect usage, so exit status will be 2.
echo "Exit status" $? 

echo -e "\nCommand Not found: bashscript"
echo -e "====================="
bashscript
#Exit status returns 127, because bashscript command not found
echo "Exit status" $? 

echo -e "\nCommand is not an executable: ./lab3_test.txt"
echo -e "============================="
touch lab3_test.txt
./lab3_test.txt
#Exit status returns 126, because its not an executable.
echo "Exit status" $?
