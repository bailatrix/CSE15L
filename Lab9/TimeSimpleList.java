public class TimeSimpleList {

  public static void main(String args[]) {
      if (args.length != 4) {

        System.out.println("Usage: java TimeSimpleList initSize increment maxSize trials");

        System.exit(1);

      }

      int S = Integer.parseInt(args[0]);
      int I = Integer.parseInt(args[1]);
      int M = Integer.parseInt(args[2]);
      int T = Integer.parseInt(args[3]);

  }
  
  for( int j = S; j < M + 1; j+=I) {
	IntegerList myList = new IntegerList(j);
	double executionTime[] = new double[T];
	int elements = j/2;

	for(int k = 0; k < T; k++) {
		
}
