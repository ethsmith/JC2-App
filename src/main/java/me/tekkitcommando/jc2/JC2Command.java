/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.tekkitcommando.jc2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Phillip
 */
public class JC2Command {
   public final String name;
   private final  ArrayList<String> parameters;
   private Exception error = null;
   private final JC2 parentConsole;
   public JC2Command (JC2 console, String cmdValue) {
       if(cmdValue.isEmpty() || console == null){
           throw new IllegalArgumentException();
       }
       parameters = new ArrayList(Arrays.asList(cmdValue.split(" ")));
       name = parameters.get(0);
       parentConsole = console;
       
       
   }
   
   public void execute() {
    
   }
   
   public Exception getError(){
       return error;
   }
    public boolean hasError(){
       return error == null;
   }
    
    public void resetError(){
        error = null;
    }
   
    public JC2 getParentConsole() {
        return parentConsole;
    }
}

