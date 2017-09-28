package com.plyuta.task1;

import java.io.IOException;

/**
 * @version 1.0.0.0
 * @author Pliuta Mykhailo, mykhailo.pliuta@gmail.com, plyuta.misha@gmail.com
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        SayHellow sayHellow = new SayHellow();
        if (args.length == 0) {
            System.out.println("There are no arguments.");
        } else if (args.length == 1) {
            sayHellow.printHello(args[0], sayHellow.getZone(args[0]));
        } else if (args.length == 2) {
            sayHellow.printHello(args[0], args[1]);
        }
    }
}
