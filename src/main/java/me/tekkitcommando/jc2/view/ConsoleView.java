/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.tekkitcommando.jc2.view;

import me.tekkitcommando.jc2.JC2Command;

/**
 *
 * @author Phillip
 */
public interface ConsoleView {
   ViewControler parentViewControler = null;
    public void writeLine(String line);
    public ViewControler getParentViewControler();
    public void setWaitforInput(JC2Command requestingCommand);
        
    
}
