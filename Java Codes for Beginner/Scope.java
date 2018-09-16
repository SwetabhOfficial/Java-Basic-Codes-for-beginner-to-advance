/*This program will show scopes in Java
Date - 16 Sep 2018
Author - @swetabhsuman8
ScopeInJava*/
public class Scope {
    //because x is declared outside of any method, it is in Scope to all methods
    //any method can access x
    static int x; //declaring the variable x
    public static void main (String[] args) {
         x = 5; //assigning a value to x
         System.out.println(x);
         
        //Calling doSomething()
        doSomething();
        
        System.out.println(x);
    }
    static void doSomething() {
        x = 10;
    }
    static void doSomethingLocally() {
        /*because is declared to this method, it is local to this method. It means no other methods has access
        to y*/
        int y = 100; //decalring and init the variable y 
    }
    
}
