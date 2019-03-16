
import sys
import mygreeting

answers = []
answers.append('G') # README 0
answers.append('N') # README 1
answers.append('S') # README 2
answers.append('K') # README 3
answers.append('R') # README 4
answers.append('S') # README 5
answers.append('E') # README 6
answers.append('Y') # README 7
answers.append('!') # README 8
answers.append('A') # README 9
answers.append('#10') # README 10


# You can ignore the following code :)

encode = [0, 10, 4, 8, 5, -1, 2, 1, 6, 3, 7, 9, -2] 

for i in encode:
  if (i == -1):
    sys.stdout.write (' ') 
  elif (i == -2):
    sys.stdout.write ('!')
  else:
    sys.stdout.write (answers[i])
    
print

