/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.tekkitcommando.jc2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import me.tekkitcommando.jc2.plugin.PluginLoader;
import me.tekkitcommando.jc2.servers.ServerList;
import me.tekkitcommando.jc2.view.ConsoleViewer;
import me.tekkitcommando.jc2.view.TestHeadless;

/**
 * @author Phillip
 * @author Ethan
 */
public class JC2 {

    // Specifies Version
    final static String version = "1.0.0 - SNAPSHOT";
    // Specifies Website
    final static String website = "www.tekkitcommando.me";
    // Specifies Github Repo
    final static String github = "https://github.com/TekkitCommando/JC2";

    static IDManager idManager = new IDManager();
    static ServerList serverList = new ServerList();
    static List<JC2> appsList = new ArrayList();
    PluginLoader pluginLoader;
    List<ConsoleViewer> windowList = new ArrayList();

    public static void main(String[] args) {

        JC2 mainApp;
        mainApp = new JC2();

        appsList.add(mainApp);
        mainApp.run();
    }

    public void run() {
        //Initialize main loop
        boolean runLoop;
        runLoop = true;

        Scanner scanner = new Scanner(System.in);
        String currentCommand;
        
        if (! TestHeadless.isReallyHeadless()){
            ConsoleViewer consoleWindow = new ConsoleViewer();
            consoleWindow.setVisible(true);
            windowList.add(consoleWindow);
        }
        
        pluginLoader = new PluginLoader(this);
    
        System.out.println("Info: Type /info to get the build version!");
        System.out.println("Info: Type /help to get a list of availble commands!");

        while (runLoop) { //loop untill /stop command
            currentCommand = scanner.nextLine().toLowerCase();

            if (currentCommand.contains("/info")) {
                System.out.println("Build Version: " + version);
                System.out.println("Website: " + website);
                System.out.println("View on Github: " + github);

            } else if (currentCommand.contains("/website") || currentCommand.contains("/site")) {
                System.out.println("Website: " + website);

            } else if (currentCommand.contains("/help")) {
                System.out.println("/Info: Gives Info Such as Build Version, Website, and Github Link");
                System.out.println("/Website: Gives The Developers Website");
                System.out.println("/Help: Gives All Commands");
                System.out.println("/Id: get a block id number from its name");
                System.out.println("/Download: request a download for different server softwares.");
                System.out.println("/Stop: Close the console");

            } else if (currentCommand.contains("/stop") || currentCommand.contains("/quit") || currentCommand.contains("/exit") || currentCommand.contains("/close")) {
                System.out.println("Stopping");
                runLoop = false;

            } else if (currentCommand.contains("/id")) {
                String blockName = "";
                String[] idParams = currentCommand.split(" ");
                if (idParams.length > 1) {
                    blockName = idParams[1];
                } else {
                    while (blockName.equals("")) {
                        System.out.println("please type a block");
                        blockName = scanner.nextLine();
                    }
                }
                System.out.println("ID for block " + blockName + " is " + idManager.blockInfo.get(blockName.toLowerCase()));

            } else if (currentCommand.contains("/download")) {
                String software = "";
                String[] idParams = currentCommand.split(" ");
                if (idParams.length > 1) {
                    software = idParams[1];
                } else {
                    while (software.equals("")) {
                        System.out.println("please type a software");
                        software = scanner.nextLine();
                    }
                }
                System.out.println("Download for " + software + " is " + serverList.softwares.get(software.toLowerCase()));
            }
        }
    }
}