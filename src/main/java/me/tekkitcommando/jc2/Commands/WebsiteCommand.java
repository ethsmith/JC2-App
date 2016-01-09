/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.tekkitcommando.jc2.Commands;

import me.tekkitcommando.jc2.JC2;
import me.tekkitcommando.jc2.JC2Command;
import me.tekkitcommando.jc2.view.ConsoleView;

/**
 *
 * @author Phillip
 */
public class WebsiteCommand extends JC2Command {

    public WebsiteCommand(ConsoleView console, String cmdValue) {
        super(console, cmdValue);
        getAliases().add("website");
        getAliases().add("site");
    }

    @Override
    public void execute() {
        getParentConsole().writeLine("Website: " + JC2.website);
    }

}