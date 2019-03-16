# Scripting Project 1: Checkerboard

## Project Description
In this project, you'll be gaining a bit more familiarity with Bash and
scripting by creating a Bash script that outputs a checkerboard to the
terminal. The board should be 8x8 and should alternate between the black and
white tiles. It should also take in an optional command line flag that flips
the colors (i.e. white tiles become black tiles and black tiles become white
tiles).

For this assignment, you'll be expected to use Bash looping constructs to get
the desired output. Do **NOT** just hardcode in the solution (we will check!).

## Provided Files
After running `gethw script1` to get the assignment, you'll find that your
directory has three files: `script1.sh`, `correctoutput_reversed` and
`correctoutput`. You'll write your solution in `script1.sh`.

**Make sure you follow _all_ of the instructions!** In particular, do not edit
anything in the sections that say `DO NOT CHANGE` and make sure your code goes in
the sections labeled `FIXME`.

_Don't forget to put your name and account number where it says FIXME!_

## How to Run
To run the program, you can either type `./script1.sh` to get the normal
output, or `./script1.sh -r` for the reversed output. The `correctoutput`
and `correctoutput_reversed` files are available for you to view to compare your
code's output (`cat correctoutput` or `cat correctoutput_reversed`, respectively).
*Pay special attention to the ordering of the tile colors!*

## Tips

1. Loops in Bash can be written in multiple ways. Some of those ways may or may
not be more useful than others for this assignment (like [this one](https://www.cyberciti.biz/faq/linux-unix-applesox-bsd-bash-cstyle-for-loop/)).

2. The [`diff`](http://man7.org/linux/man-pages/man1/diff.1.html) command can be
used very nicely with other commands to check number of differences between
files (Linux pipes in the wild!)

3. The [online man pages](https://linux.die.net/man/)/regular `man` pages will
definitely come in handy, and feel free to use Piazza to talk with other
students and tutors about the assignment.

4. It will be helpful to know how to do arithmetic inside of Bash if
statements. [This link](https://stackoverflow.com/questions/8304005/how-do-i-do-if-statement-arithmetic-in-bash)
may end up being of use to you.

5. You will be working with functions in this script. You can use
[this](https://ryanstutorials.net/bash-scripting-tutorial/bash-functions.php) as
a reference for how to call functions from within your script. This link will
also assist with using and passing arguments to your scripts.

6. You may run into a problem with if statements saying "unary operator
expected". If so, [this link](https://stackoverflow.com/questions/408975/compare-integer-in-bash-unary-operator-expected)
will definitely be of use to you.

7. If you read through the main function, you'll see an `until` loop. This may
seem strange, but you can think of them conceptually as while loops that check
the opposite condition. A while loop runs while some condition is true; an
until loop runs until some condition is true (or, while the opposite logic of
that condition is false).

## Good luck! Start Early and *Finish* Early!
