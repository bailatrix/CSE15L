/****************************************************************************

                                                Name(s):
                                                cs15w account(s):
                                                CSE 15L, Winter 2014
                        Lab 2 (hw0)

File Name:      hw0.cpp
Description:    This program's purpose is to be an ideal specimen for
                debugging. It does basic string manipulation, integer math,
                and demonstrates some of the features of C++ such as
                constructors, destructors, virtual methods, friends, and
                operator overloading.
****************************************************************************/
#include <cctype>
#include <string>
#include <iostream>

using namespace std;

/* class DataHolder
 * 
 * Description: Holds an id and a string, can be mutated.
 */
class DataHolder {
  friend ostream &operator <<(ostream &, const DataHolder &);

  int id;
  string data;

  // maintains the total number of outstanding DataHolders
  static int count;

  public:
  // Constructs a DataHolder from a string, increments the total count
  // of outstanding DataHolders
  DataHolder(const char *str) : id(++count), data(str) {}

  // destroys a DataHolder, decrements count of oustanding DataHolders.
  // Declared virtual so that derived classes' destructors will be 
  // called correctly
  virtual ~DataHolder() { count--; }

  void mutate();
};

int DataHolder::count = 0;

/*--------------------------------------------------------------------------
Function Name:  DataHolder::mutate
Purpose:        Perform a mystery operation this DataHolder
Description:    Demonstrates a use of STL iterators.
Parameters:     none
Returns:        void
--------------------------------------------------------------------------*/
void DataHolder::mutate() {
  int integer = 0;

  for(string::iterator it = data.begin(); it != data.end(); it++) {
    *it = (integer++ & 1) ? tolower(*it) : toupper(*it);
  }
}

/*--------------------------------------------------------------------------
This function header is intentionally left blank. Its purpose is
to be deduced from the debugging excercises.
--------------------------------------------------------------------------*/
ostream &operator <<(ostream &out, const DataHolder &holder) {
  return out << "id(" << holder.id << "), data: " << holder.data << endl;
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
int doMath( int arg1, int arg2, int arg3) {
  int result = (arg3 - arg1) * arg2;
  return result;
}

/*--------------------------------------------------------------------------
Function Name:  main
Purpose:        To be debugged.
Description:    Initializes several local variables, performs
                arithmetic on them, calls some functions, creates a 
                DataHolder object and mutates it.
Parameters:     argc - the number of command line arguments passed to
                        the program
                argv - array of strings of command line arguments
Returns:        zero on success, nonzero on failure.
--------------------------------------------------------------------------*/
int main(int argc, const char * const argv[]) {
  int nums[3];
  int math;

  cout << "[C++ version]" << endl;

  // populate the nums array
  nums[0] = 5;
  nums[1] = 6;
  nums[2] = 10;

  math = doMath(nums[0], nums[1], nums[2]);
  math = doMath(nums[1], nums[2], math);
  math = doMath(nums[2], nums[0], math);

  cout << "Result is: " << math << endl;

  // declare a myHolder on the stack and mutate it
  DataHolder myHolder("Hello, world!");
  myHolder.mutate();

  // YOUR CODE GOES HERE

  // need to read argc and argv so they don't get optimized out
  math = argc + long(argv);

  return 0;
}

