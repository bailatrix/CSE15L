
# Homework 1

Name: Marian Passmore  
PID: A15738170  
Account: cs15xtk  

## Getting Started

Login to your cs15xzz account either from a lab machine or via `ssh`. From your
home directory, enter the following commands:

```
$ gethw hw1
$ cd ~/homework/hw1
$ vim hw1.md
```

_Don't forget to change the file header!_

1. `vimtutor` is a helpful tool available with every installation of Vim for
getting started on the arts of Vim. Knowing that `vimtutor` is a program that
shows you how to use Vim, what is the full command that tells you about the
details on how you can use `vimtutor`? **(1 point)**

        'man vimtutor' will redirect to the vimtutor instructions

2. The command from Question 1 should come with an interesting fact that you
can launch `vimtutor` in different languages, if you specify that language by
passing in its two-letter name. Knowing that `/usr/share/vim/vim74/tutor`
contains all files used by `vimtutor`, including the text files of the entire
content in all languages supported by vimtutor, what is a command that shows
you the content of that directory, so you can see what languages `vimtutor`
supports? **(1 point)**

        'ls /usr/share/vim/vim74/tutor'

3. For some unknown reason, you feel the urge to translate `vimtutor` into pig
Latin. Since you won't have the permission to modify the files inside
`/usr/share/vim/vim74/tutor`, you will need to create a copy of the English
tutor file within your own directory. What is one single command that will copy
the English tutor file (`/usr/share/vim/vim74/tutor/tutor`) under your home
directory with a new file name `tutor.piglatin`? _Note:_
`/usr/share/vim/vim74/tutor/tutor` may not be in the home directory.
**(1 point)**

        'cp /usr/share/vimm/vim74/tutor/tutor ~/tutor.piglatin'

4.  Even though you barely started to translate the tutorial you will be using
to teach yourself to use Vim, you still decided to use Vim to conduct the
translation. In the midst of your work, you accidentally managed to delete an
entire line under your cursor.

    1. What is a command that could have caused this accident? **(1 point)**

            'dd'

    2. Give a single command to undo this mistake. **(1 point)**

            'u'

5. Assume that you have successfully finished your pig-Latin translation of
`vimtutor`. Now it's time to teach yourself to use Vim! The first thing you
want to learn is how to perform searches in Vim so you can jump to the section
where it teaches you how to perform searches in Vim. What is the Vim command to
use to search for the word `earchsay`? _Note: Do not include the question mark
in the search._ **(1 point)**

        '/earchsay'

6. You suddenly noticed that the `vimtutor` files in all other languages follow
the same naming convention that ends with the language's two-letter name, and
you want to follow that same convention. What is the command to rename
`tutor.piglatin` to `tutor.pg` in the _current_ directory? **(1 point)**

        'mv tutor.piglatin tutor.pg'

7. With your new file `tutor.pg`, you want to create a new folder called
`piglatin` and move `tutor.pg` into the newly created folder.

    1. Give the single command to create a new directory called `piglatin`.
    **(1 point)**

            'mkdir piglatin'

    2. Give the single command to move `tutor.pg` into `piglatin`.
    **(1 point)**

            'mv tutor.pg piglatin'

    3. Give the single command to go into the folder `piglatin`. **(1 point)**

            'cd piglatin'


8. List a Vim command that you learned from `vimtutor` which follows each
requirement below, and in one sentence, describe what the command does:

    1. A single-letter command **(1 point)**

            'i' opens Insert mode to insert text into file.

    2. A CTRL-prefix command **(1 point)**

            'CTRL-r' redoes the most recent action that has been undone

    3. A colon command (commands that follow a : ) **(1 point)**

            ':wq' writes the changes to the file, saves, and quits vim.

## Turnin Procedure:
Be sure your `hw1.md` file is saved on your cs15xzz account in the directory
`~/homeworks/hw1`. When logged into your cs15xzz account, enter the following
commands:
```
$ cd ~/homework/hw1
$ turnin
```
Follow the Autograder prompts, using your UC San Diego email login credentials,
and you should be good to go! Make sure you get the confirmation email from
Autograder. Additionally, you can log in to Autograder to verify your submission.
