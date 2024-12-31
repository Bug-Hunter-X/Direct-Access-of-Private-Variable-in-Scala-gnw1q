# Direct Access of Private Variable in Scala

This example demonstrates the issue of trying to directly access a private variable of a class from outside the class definition in Scala.  Private members, by design, are only accessible within the class in which they are defined.  Attempting to access them from elsewhere will result in a compilation error.

The `bug.scala` file contains the code that shows this behavior, resulting in a compilation error. The `bugSolution.scala` file offers a corrected approach, using the provided methods to interact with the private variable.

## Solution:

Use the provided methods (`updatePrivateVar` and `accessPrivateVar`) to modify and access the private variable, ensuring encapsulation and proper object interaction. 