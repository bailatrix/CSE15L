
# Homework 2

Name: Marian Passmore  
PID: A15738170  
Account: cs15xtk  

## Getting Started

Login to your cs15xzz account either from a lab machine or via `ssh`. From your
home directory, enter the following commands:

```
$ gethw hw2
$ cd ~/homework/hw2
$ vim hw2.md
```

Answer these questions in the `hw2.md` file you now have open.

_Don't forget to change the file header!_

1. What is the command that shows you the full path of your current working
directory? **(1 point)**

        'pwd' shows the full path of the current working directory.

2. Now please take a look at the code in `hw2.c`. You may use this code to
answer questions 2 through 7. (_hint:_ you can compile this code by typing
`gcc -o hw2 hw2.c`, and you can run it by typing `./hw2`. For this question,
let's assume you're taking CSE 12 and the PA is due in 25 minutes. Yikes! When
you run your program with command: `./cse15`, the output is not what you
expect. Instead, it prints the opposite of what you expect. You can try this on
your own!

    1. Which file descriptor is “expected: 53” sent to? **(0.5 points)**
    
           stderr 
    
    2. Which file descriptor is “output: -53” sent to? **(0.5 points)**

           stdout
   
3. What is the command to debug `hw2.c` using GDB, assuming that the
corresponding executable is named `hw2`? **(1 point)**

        'gdb hw2'

4. You want to set a breakpoint in the function `main`.

    1. What is one way to set a breakpoint in `main`? **(0.5 points)**

            'break main'

    2. What is another way to set a breakpoint, different from the solution you
    provided in part 1? **(0.5 points)**

            'break 1'

5. At some point during debugging, you see the following being printed after
you typed in "next": `15 input = -53;`. What will be printed if you enter `print input`? **(1 point)**

        '-53'

6. Which is the next line to execute if you enter `next`? **(1 point)**

        line 16, 'output = my_abs(input);'

7. Say you are on this line: `16 output = my_abs(input);`. What is a command in
GDB that will bring your debugging INTO the function `my_abs()`? (_hint:_ this is different than staying within the `main` method) **(1 point)**

        'where'

8. Now quit GDB. Now let's say you've fixed the bug in your code. Nice! Now you
want to save the output printed by your program in order to compare with a
reference solution. What is a command to use in order to redirect the output of `./hw2` to a file named `my_solution`? **(1 point)**

        './hw2 >> my_solution'

9. Assume that you have a reference solution file named `ref_solution` that
contains the expected output of this PA. What is the command to help you check
whether `my_solution` and `ref_solution` have any differences? **(1 point)**

        'diff my_solution ref_solution'

10. Your solution looks perfect. Good job! Now, you are worried if your program
has any memory violations, so there are yet more things to check. What is the
complete command that can help you check for any potential memory issues, like
memory leaks or invalid memory accesses in your `hw2` executable? (_hint:_ it
is not simply  `make valgrind`!) **(1 point)**

       'valgrind -v ./hw2.c' 

11. You have a file called `bigfile.txt` that contains over a million lines,
but you are only interested in lines that contain the phrase `CSE 15L`. For the
following questions, consider making a small tester file to make sure your
commands work!

    1. What is the command that display all the lines and their corresponding
    line numbers containing the phrase `CSE 15L` in `bigfile.txt`?
    **(0.5 points)**
    
            'grep -ni CSE 15L ./bigfile.txt'

    2. Building from part 1, we now want to count the number of lines that
    contain the phrase `CSE 15L`. What command does this? **(0.5 points)**

            'grep -c CSE 15L ./bigfile.txt'

## Turnin Procedure:
Be sure your `hw2.md` file is saved on your cs15xzz account in the directory
`~/homework/hw2`. When logged into your cs15xzz account, enter the following
commands:
```
$ cd ~/homework/hw2
$ turnin
```
Follow the Autograder prompts, using your UC San Diego email login credentials,
and you should be good to go! Make sure you get the confirmation email from
Autograder. Additionally, you can log in to Autograder to verify your submission.
