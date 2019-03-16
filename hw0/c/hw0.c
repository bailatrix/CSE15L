/****************************************************************************

                                                Name(s):
                                                cs15w account(s):
                                                CSE 15L, Winter 2014
                        Lab 2 (hw0)


File Name:      hw0.c
Description:    This program's purpose is to be an ideal specimen for
                debugging. It does basic string manipulation, integer math,
                dynamic memory allocation, and simulated object-oriented
                programming with the DataHolder "class." This program also
                contains some common memory errors that can be easily 
                detected with valgrind.
****************************************************************************/
#include <string.h>
#include <malloc.h>
#include <stdio.h>
#include <ctype.h>

/* struct DataHolder
 * 
 * Description: A simple "class" for demonstrating object-oriented
 *      programming in C.
 * 
 * Data members:
 *      data - a dynamically allocated string
 *      id - a unique id for this DataHolder
 * 
 * Public functions:
 *      new_DataHolder
 *      mutate_DataHolder
 *      DataHolder_delete
 */
typedef struct {
  char *data;
  int id;
} DataHolder;

/*--------------------------------------------------------------------------
Function Name:  new_DataHolder
Purpose:        Initialize a DataHolder structure to a known state (like
                a constructor).
Description:    Copies the string parameter str to the member data and
                assigns the object a unique id based on the total number
                of DataHolders that have been initialized. This
                should be the first function called on a DataHolder. When
                you are done with a DataHolder, always call DataHolder_delete
                on it to clean up any dynamically allocated resources.
Parameters:     this_DataHolder - a pointer to the DataHolder to initialize,
                        can be in data, bss, stack or heap
                str - the string to store in this DataHolder. A
                        copy of this string is stored.
Returns:        void
Side Effects:   Memory is dynammically allocated, always call
                DataHolder_delete() when done with a DataHolder.
--------------------------------------------------------------------------*/
void new_DataHolder(DataHolder *this_DataHolder, const char *str) {
  /* how many DataHolders have been initialized? */
  static int count = 0;

  /* how long was the passed-in string? Remember +1 for the
   * null-termination character */
  size_t len = strlen(str) + 1;

  /* allocate memory for and make a copy of str */
  this_DataHolder->data = (char *)malloc(sizeof(*this_DataHolder->data) * len);
  strncpy(this_DataHolder->data, str, len);

  /* assign this DataHolder a unique id */
  this_DataHolder->id = ++count;
}

/*--------------------------------------------------------------------------
Function Name:  DataHolder_delete
Purpose:        Delete all resources associated with this DataHolder.
Description:    Frees the string that was dynamically allocated in the
                constructor and zeros out the structure. Does not free the
                structure itself because it could have been allocated on the
                stack. If you manually allocated this DataHolder on the heap,
                you must free it with a call to free() after you call
                DataHolder_delete on it.
Parameters:     this_DataHolder - a pointer to the DataHolder you wish
                        to uninitialize.
Returns:        void
--------------------------------------------------------------------------*/
void DataHolder_delete(DataHolder *this_DataHolder) {
  free(this_DataHolder->data);
  memset(this_DataHolder, 0, sizeof(*this_DataHolder));
}

/*--------------------------------------------------------------------------
This function's header is not present because its purpose is meant to be
vague for this debugging exercise. Normally you would need to write a header
here.
--------------------------------------------------------------------------*/
void mutate_DataHolder(DataHolder *this_DataHolder) {
  /* traversal pointer, points to the current char in the string */
  char *character;
  int integer;

  for(character = this_DataHolder->data, integer = 0; *character; character++,
      integer++) {
    *character = (integer&1) ? tolower(*character) : toupper(*character);
  }
}

/*--------------------------------------------------------------------------
Function Name:  doMath
Purpose:        Perform basic integer arithmetic.
Description:    Performs basic integer arithmetic on its arguments and
                returns the result.
Parameters:     arg1 - the first operand
                arg2 - the second operand
                arg3 - the third operand
Returns:        The result of a simple mathmatical expression on its
                arguments.
--------------------------------------------------------------------------*/
int doMath( int arg1, int arg2, int arg3 ) {
  int result = (arg3 - arg1) * arg2;
  return result;
}

/*--------------------------------------------------------------------------
Function Name:  main
Purpose:        To be debugged.
Description:    Initializes (or fails to) several local variables, performs
                arithmatic on them, calls some functions, creates a 
                DataHolder object and mutates it.
Parameters:     argc - the number of command line arguments passed to
                        the program
                argv - array of strings of command line arguments
Returns:        zero on success, nonzero on failure.
--------------------------------------------------------------------------*/
int main(int argc, const char * const argv[]) {
  int nums[4];
  int math;

  /* declare a DataHolder on the stack */
  DataHolder myHolder;

  /* populate the nums array */
  nums[1] = 5;
  nums[2] = 6;
  nums[3] = 10;

  printf("[c version]\n");

  /*  YOUR CODE GOES HERE  */

  printf("nums[0] = %d\n", nums[0]);

  math = doMath(nums[1], nums[2], nums[3]);
  math = doMath(nums[2], nums[3], math);
  math = doMath(nums[3], nums[1], math);

  printf("Result is: %d\n", math);

  /* initialize and mutate myHolder */
  new_DataHolder(&myHolder, "Hello, world!");
  mutate_DataHolder(&myHolder);

  /* YOUR CODE GOES HERE */

  /* read argc and argv to prevent them from being optimized out */
  math = argc + (int)argv;

  return 0;
}
