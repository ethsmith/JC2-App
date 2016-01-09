/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.tekkitcommando.jc2.view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.tekkitcommando.jc2.JC2;

/**
 *
 * @author Phillip
 */
public class ViewControler {

    final public boolean isHeadless;
    final private Map<String, ConsoleWindowView> windows;
    final private Map<String, HeadlessView> headlessViews;

    public ViewControler(JC2 parentApp) {
        windows = new HashMap();
        headlessViews = new HashMap();
        if (!TestHeadless.isReallyHeadless()) {
            ConsoleWindowView consoleWindow = new ConsoleWindowView(this);
            consoleWindow.setVisible(true);
            windows.put("Main", consoleWindow);
            isHeadless = false;
        } else {
            isHeadless = true;
            headlessViews.put("Main", new HeadlessView(System.in, System.out, this));
        }

    }
    public ConsoleView getConsoleView(){
        
        return null;
    }
}
