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
public class HelpCommand extends JC2Command {

    public HelpCommand(ConsoleView console, String cmdValue) {
        super(console, cmdValue);
        getAliases().add("help");
    }

    @Override
    public void execute() {
        getParentConsole().writeLine("/Info: Gives Info Such as Build Version, Website, and Github Link");
        getParentConsole().writeLine("/Website: Gives The Developers Website");
        getParentConsole().writeLine("/Help: Gives All Commands");
        getParentConsole().writeLine("/Id: get a block id number from its name");
        getParentConsole().writeLine("/Download: request a download for different server softwares.");
        getParentConsole().writeLine("/Stop: Close the console");
    }

}
