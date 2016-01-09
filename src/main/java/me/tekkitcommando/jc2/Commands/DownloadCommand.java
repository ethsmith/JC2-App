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
public class DownloadCommand extends JC2Command {

    public DownloadCommand(ConsoleView console, String cmdValue) {
        super(console, cmdValue);
        getAliases().add("dl");
        getAliases().add("download");
    }

    @Override
    public void execute() {
        if (getParameters().size() < 2) {
            getParentConsole().writeLine(("please type a software name"));
            getParentConsole().setWaitforInput(this);
        } else {
            String software = getParameters().get(2);
           getParentConsole().writeLine("Download for " + software + " is " + JC2.serverList.softwares.get(software.toLowerCase()));
        }

    }
}
