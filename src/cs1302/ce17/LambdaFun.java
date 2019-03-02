package cs1302.ce17;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Function;

/**
 * This class contains methods related to {@code cs1302-ce17}.
 */
public class LambdaFun {

    /** Standard Input scanner. */
    private static Scanner input = new Scanner(System.in);

    /**
     * Main entry-point into the application.
     * @param args the command-line arguments.
     */
    public static void main(String[] args) {

        String[] myStrings = new String[] {
              "CSCI",        "1302",    "is", "an", "awesome", "course!",
            "Lambda", "expressions", "scare", "me",     "but",       "I",
              "will",   "persevere"
        };

        Email[] inbox = new Email[] {
            new Email("bjb211@uga.edu", "yellowjacket@gatech.edu",
                      LocalDate.of(2019, 2, 4), "Go GA Tech!"),
            new Email("bjb211@uga.edu", "mom@aol.com",
                      LocalDate.of(2019, 2, 5), "Have a good day!"),
            new Email("bjb211@uga.edu", "steve@anyotherschool.edu",
                      LocalDate.of(2019, 2, 6), "I wish I would've chosen UGA"),
            new Email("bjb211@uga.edu", "student1@uga.edu",
                      LocalDate.of(2019, 2, 7), "Thanks for teaching us!"),
            new Email("bjb211@uga.edu", "yellowjacket@gatech.edu",
                      LocalDate.of(2019, 2, 8), "Go GA Tech!")
        };

        LambdaFun.<String>printMatches(myStrings, t -> t.contains("a"));
        System.out.println(LambdaFun.<Email>printArray(inbox, t -> t.getSender()));

        //Print all emails where the sender is not from gatech.edu

        //Print all emails that have certain words in the subject.
        //Print all emails that were sent in the last week.

        //Print all quizzes with a time limit of under 20 minutes

        //Print all bonus quizzes

        //TRICKY: Write a method that takes a generic array, increases its size by 1,
        //and adds a new value from on user input.  Your method can assume that the
        //user inputs a value of the appropriate type.
        //see:
        //http://cobweb.cs.uga.edu/~mec/cs1302-genlistadt-doc/cs1302/genlistadt/GenList.html#toArray-java.util.function.IntFunction-
        //IntFunction

    } // main

    /**
     * Prints the elements of the array that pass the test specified by the given predicate.
     * More formally, this method prints all elements {@code e} in the array referred to by
     * {@code t} such that {@code p.test(e)}. Each element will be printed on its own line.
     *
     * @param <T> the type of the array elements
     * @param t the specified array
     * @param 
     */
    private static <T> void printMatches(T[] t, Predicate<T> p) {
        for (T e: t) {
            if(p.test(e)) {
                System.out.println(e);
            } // if
        } // for
    } //printMatches

    private static <T> String printArray(T[] t, Function<T,String> f, String sep) {
        String returnString = "";
        for (T e: t) {
            returnString += f.apply(e);
            returnString += sep;
        } // for
        return returnString.substring(0, returnString.lastIndexOf(sep));
    } // printArray

    /**
     * If the generic array is full, double its size.
     * Precondition: Empty spots in the array are null. The entries end at the first null value.
     *
     *
     */
    private static <T> T[] addElement(T[] t, IntFunction<T[]> f, Function<String, T> mapper) {
        T[] newT = f.apply(t.length + 1);
        //The program turned me into a newT.  I got better...

        String in = input.nextLine();
        
        newT[t.length] = mapper.apply(in);
        
        return newT;
    } // addElement
    
    
} // LambdaFun
