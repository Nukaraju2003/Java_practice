// import package.name.Class;  // Import a single class
// import package.name.*;   // Import the whole package

import java.util.*;
import java.util.Scanner; // example 


class MyClass {
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter username");

        String username = myobj.nextLine();
        System.out.println("Username is: " + username);
    }

}