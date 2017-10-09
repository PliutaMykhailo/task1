package com.plyuta.task1;

import java.io.IOException;

/**
 * @author Pliuta Mykhailo, mykhailo.pliuta@gmail.com, plyuta.misha@gmail.com
 * @version 1.0.0.0
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
