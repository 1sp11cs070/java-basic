//
// Read more about Exceptions at
// https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html
//

public class UserDefineException {

  public static void main(String[] args) {

    // We can create our own execeptions
    // It's actually a class which is derived from Exception
    user_defined_exception_example();

  }

  public static void user_defined_exception_example() {
    try {
      throw new CupertiniiException();
    }
    catch(Exception e) {
      System.out.println( "CupertiniiException caught" );
    }
    finally {
      System.out.println( "Finally executed." );
    }
  }

}

// Here's my Exception class
 class CupertiniiException extends Exception {
  public CupertiniiException() {
    System.out.println( "CupertiniiException thrown" );
  }
}
