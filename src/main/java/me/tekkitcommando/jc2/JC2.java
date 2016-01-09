/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.tekkitcommando.jc2;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import me.tekkitcommando.jc2.plugin.PluginLoader;
import me.tekkitcommando.jc2.servers.ServerList;
import me.tekkitcommando.jc2.view.ViewControler;

/**
 * @author Phillip
 * @author Ethan
 */
public class JC2 {

    // Specifies Version
    final public static String version = "1.0.0 - SNAPSHOT";
    // Specifies Website
    final public static String website = "www.tekkitcommando.me";
    // Specifies Github Repo
    final public static String github = "https://github.com/TekkitCommando/JC2";

    final public static IDManager idManager = new IDManager();
    final public static ServerList serverList = new ServerList();
    final static List<JC2> appsList = new ArrayList();
    final private File workingDir;
    final private Map<String, ViewControler> viewControlers;
    final private List<JC2Command> commandQue;
    final private PluginLoader pluginLoader;
    private boolean runLoop;

    public static void main(String[] args) {

        JC2 mainApp;
        mainApp = new JC2(".");

        appsList.add(mainApp);
        if (mainApp.getViewControler("Main").isHeadless) {
            mainApp.run();
        }

    }

    public JC2(String filePath) {
        viewControlers = new HashMap();
        workingDir = new File(filePath);
        commandQue = new ArrayList();
        pluginLoader = new PluginLoader(this);
        viewControlers.put("Main", new ViewControler(this));

    }

    public void run() {

        //Initialize main loop
        if (viewControlers.get("Main").isHeadless) {

            runLoop = true;

            System.out.println("Info: Type /info to get the build version!");
            System.out.println("Info: Type /help to get a list of availble commands!");
            while (runLoop) { //loop untill /stop command

            }

            
        }
    }

    public ViewControler getViewControler(String controlerName) {
        if (controlerName.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return viewControlers.get(controlerName);
    }

    public void stop() {
        runLoop = false;

    }
}
