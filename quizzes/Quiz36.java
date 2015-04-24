/*
CS373: Quiz #36 (7 pts)
*/

/* -----------------------------------------------------------------------
 1. Explain the FOUR exceptions in the following.
    (6 pts)

the class can not be cast to an I
the string is not the name of a class
the default constructor of A is not accessible
there is no default constructor of A or A is an interface or abstract class
*/

interface I {}

class A implements I {}

final class Quiz33 {
    public static void main (String[] args) {
        try {
            I x = (I) Class.forName("A").newInstance();}
        catch (ClassCastException e) {
            e.printStackTrace();}
        catch (ClassNotFoundException e) {
            e.printStackTrace();}
        catch (IllegalAccessException e) {
            e.printStackTrace();}
        catch (InstantiationException e) {
            e.printStackTrace();}

        System.out.println("Done.");}}
