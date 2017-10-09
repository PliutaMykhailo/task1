package com.plyuta.task1;

import java.io.IOException;

/**
 * @version 1.0.0.0
 * @author Pliuta Mykhailo, mykhailo.pliuta@gmail.com, plyuta.misha@gmail.com
 */
public class Main {

     public static void main(String[] args) throws IOException {

        SayHellow sayHellow;
        if (args.length == 0) {
            System.out.println("There are no arguments.");
        } else if (args.length == 1) {
            sayHellow = new SayHellow(args[0]);
            sayHellow.printHello();
        } else if (args.length == 2) {
            sayHellow = new SayHellow(args[0], args[1]);
            sayHellow.printHello();
        }

    }
}
