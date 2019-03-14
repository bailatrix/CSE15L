/****************************************************************************

                                                Name(s):
                                                cs15w account(s):
                                                CSE 15L, Winter 2014
                        Lab 2 (hw0)


****************************************************************************/


/**  
 * This program's purpose is to be an ideal specimen for
 * debugging. It does basic string manipulation, integer math,
 * and demonstrates some of the features of java, such as
 * classes and member methods.
 *
 * @author Tracker 
 *
 */
public class hw0 {
  /**
   * Initializes several local variables, performs
   * arithmetic on them, calls some functions, creates a 
   * DataHolder object and mutates it.
   *
   * @param args The command line arguments passed to this program
   */
  public static void main(String args[]) {
    System.out.println("[Java version]");

    int num1 = 5;
    int num2 = 6;
    int num3 = 10;

    int math = doMath(num1, num2, num3);
    math = doMath(num2, num3, math);
    math = doMath(num3, num1, math);

    System.out.println("Result is: " + math);

    DataHolder myHolder = new DataHolder("Hello, world!");

    System.out.println(myHolder);
  }

  /** Performs some basic integer arithmetic on its arguments and
   *  returns the result.
   * 
   * @param arg1 the first operand
   * @param arg2 the second operand
   * @param arg3 the third operand
   * 
   * @return The result of a mathmatical expression on its arguments
   */
  public static int doMath(int arg1, int arg2, int arg3) {
    int result = (arg3 - arg1) * arg2;
    return result;
  }
}

/**
 * Holds an id and a string, can be mutated.
 *
 * @author Tracker 
 *
 */
class DataHolder {
  /** 
   * counts how many DataHolders have been created
   */
  static int count = 0;

  String data;
  int id;

  /** Constructs a DataHolder from a string, assigns a unique id.
   * 
   * @param the string with which to initialize this DataHolder.
   */
  public DataHolder(String str) {
    data = str;
    id = ++count;
  }

  /**
   * This function header is intentionally left blank.
   * Its purpose is to be deduced from the debugging excercises.
   */
  public void mutate() {
    char working[] = data.toCharArray();
    for(int integer = 0; integer < data.length(); integer++) {
      working[integer] = ((integer & 1) == 0) ? 
        Character.toUpperCase(working[integer]) :
        Character.toLowerCase(working[integer]);
    }
    data = new String(working);
  }

  /**
   * @return a string representation of this class
   */
  public String toString() {
    return data;
  }
}

