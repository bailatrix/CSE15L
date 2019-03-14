# Script 1 - Checkerboard
# 
# Name: Marian Passmore  
# PID: A15738170
# Account: cs15xtk  

# ============================== DO NOT CHANGE ============================== #

# Constants used
TILE_BLACK="\033[0;40m  \033[0;0m"    # DO NOT CHANGE
TILE_WHITE="\033[0;47m  \033[0;0m"    # DO NOT CHANGE
SQUARES_PER_LINE=8                    # DO NOT CHANGE
HALF_DIVISOR=2                        # DO NOT CHANGE
NUM_ITERATIONS=4                      # DO NOT CHANGE
ERR="\tERROR: Invalid flag given.\n"  # DO NOT CHANGE
USAGE="USAGE: ./checkerboard.sh [-r]" # DO NOT CHANGE

rotate_flag="f"

# Parse command line arguments
while getopts ":r" arg $@; do
  case $arg in

    # rotation wanted
    r) rotate_flag="t";;

    # Invalid flag provided
   \?) echo; echo -e "$ERR"; echo "$USAGE"; exit 1;;

  esac
done

# Remove parsed option flags
shift $((OPTIND - 1))

# ========================= YOUR CODE STARTS BELOW ========================= #

# FIXME: Write a function that prints one row of the checkerboard. It should
# look at the argument passed in to determine if it will start by printing a
# white or black square. This is an optional method, but will help you
# implement the main method.
function printLine { # One way to define a function
   squares=0
   if [[ $1 == TILE_BLACK ]]; then
      while [ $squares -lt 8 ]; do
	 if [[ $(( $squares % 2 )) == 0 ]]; then
	    echo -ne "$TILE_WHITE"
	 else
	    echo -ne "$TILE_BLACK"
   	 fi
	 let squares+=1
      done
   else
      echo
      while [ $squares -lt 8 ]; do
	 if [[ $(( $squares % 2 )) == 0 ]]; then
	    echo -ne "$TILE_BLACK"
	 else
	    echo -ne "$TILE_WHITE"
	 fi
	 let squares+=1
      done
   echo
   fi
}

main() { # Another way to define a function

  counter=0

  if [ $rotate_flag == "t" ]; then
    # This line creates a loop that will run NUM_ITERATIONS times
    until [ $counter -eq $NUM_ITERATIONS ]; do

	printLine TILE_WHITE
	printLine TILE_BLACK
	let counter+=1

    done
  else
    until [ $counter -eq $NUM_ITERATIONS ]; do
	
	printLine TILE_BLACK
	printLine TILE_WHITE
	let counter+=1
    done
  fi
  echo
}

# ============================== DO NOT CHANGE ============================== #
main # Calls the main function to start the script up
exit 0
