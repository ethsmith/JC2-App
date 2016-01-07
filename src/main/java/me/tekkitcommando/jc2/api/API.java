package me.tekkitcommando.jc2.api;

import java.util.Scanner;

/**
 * Created by ethan on 1/6/2016.
 */
public class API {

    /**
     * More of a test api method.
     * @param x is the first number
     * @param y is the second number
     * @param addition for adding the x and y value
     * @param division for dividing the x and y value
     * @param subtraction for subtraction the x and y value
     * @param multiplication for multiplying the x and y value
     * @return returns the answer to the equation.
     */
    public static int math(int x, int y, boolean addition, boolean division, boolean subtraction, boolean multiplication) {
        if(addition == true) {
            return x + y;
        } else if(division == true) {
            return x / y;
        } else if(subtraction == true) {
            return x - y;
        } else if(multiplication == true) {
            return x * y;
        }
        return x + y;
    }

    /**
     * Need to get back to this.
     * @param cmd must be equal to the command being executed.
     */
    public static Scanner commandRegister(String cmd) {
        return null;
    }
}
