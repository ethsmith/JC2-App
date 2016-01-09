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
public class IDCommand extends JC2Command {

    public IDCommand(ConsoleView console, String cmdValue) {
        super(console, cmdValue);
        getAliases().add("id");
        getAliases().add("blockinfo");
    }

    @Override
    public void execute() {
        if (getParameters().size() < 2) {
            getParentConsole().writeLine(("please type a block name"));
            getParentConsole().setWaitforInput(this);
        } else {
            String blockName = getParameters().get(2);
            getParentConsole().writeLine(("ID for block " + blockName + " is " + JC2.idManager.blockInfo.get(blockName.toLowerCase())));
        }

    }
}
