
# cs1302-ce17 Generic Method Implementation

> TBD

This class exercise explores functional interfaces and lambda expressions in
conjunction with generic methods and interfaces. In this exercise, only the generic
method signatures will be provided. Implementation details are left to the student.

## References and Prerequisites

* [`ArrayUtility` API Documentation](http://cobweb.cs.uga.edu/~mec/cs1302/cs1302-ce16-api/index.html)
* [Oracle: Generic Methods](https://docs.oracle.com/javase/tutorial/extra/generics/methods.html)
* [Oracle: Bounded Type Parameters](https://docs.oracle.com/javase/tutorial/java/generics/bounded.html)

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are 
logged into the Nike server. 

**NOTE:** If a step requires you to enter in a command, please provide in your notes the full 
command that you typed to make the related action happen. If context is necessary (e.g., the 
command depends on your present working directory), then please note that context as well.

### Getting Started

1. Use Git to clone the repository for this exercise onto Nike into a subdirectory called `cs1302-ce17`:

   ```
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-ce17.git
   ```

1. Change into the `cs1302-ce17` directory that was just created and look around. There should be
   multiple Java files contained within the directory structure. To see a listing of all of the 
   files under the `src` subdirectory, use the `find` command as follows:
   
   ```
   $ find src
   ```

### Exercise Steps

1. `LambdaFun.java` contains method signatures and documentation for three generic methods. We will implement
    and test these methods in the order that they appear in the Java program, starting with `printMatches`. The
    exact signature for this method is:
             `private static <T> void printMatches(T[]t, Predicate<T> p)`
    Answer the following questions about this method in your notes:
    * What is the generic type parameter?
    * Specifically, what types of references can replace `T`?
    * In order to call this method, we need an reference to an object of a class that implements `Predicate<T>`. 
      `Predicate<T>` is a functional interface. Write the full method signature of the single, abstract method
      of this class in your notes. Pay careful attention to the return type and the type of the formal parameter.
1. Implement the `printMatches` method in `LambdaFun.java`.
1. In the main method of `LambdaFun`, create an object of type `Predicate<String>` and initialize the object using
   a lambda expression. The lambda expression should provide an implementation for the single abstract method of
   `Predicate<T>`. This method should return `true` if the string argument contains the letter 'a'.
1. Call `printMatches` by passing in array `myStrings` along with your newly created `Predicate<String>` object.  
   You will know if everything is working correctly if the method only prints strings containing the letter 'a'.
1. Create additional `String` arrays to further test your implementation. Make sure to provide sufficient output
   so that it will be easy to convince your TA or instructor that everything is working properly.
   
1. Stage and commit all changes.

**CHECKPOINT**
   
1. 

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
