/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.tekkitcommando.jc2.view;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Phillip
 */
public class HeadlessView implements ConsoleView {

    final private Scanner scanner;
    final private InputStream in;
    final private PrintStream out;
    final private ViewControler parentViewControler;

    public HeadlessView(InputStream inStream, PrintStream outStream, ViewControler viewControler) {
        parentViewControler = viewControler;
        in = inStream;
        out = outStream;
        scanner = new Scanner(in);
    }

    public String getInput(String prompt) {
        if (!prompt.isEmpty()) {
            out.println(prompt);
        }
        return scanner.nextLine();
    }
}
