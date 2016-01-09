package me.tekkitcommando.jc2.plugin;

import java.io.*;
import java.lang.ClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import com.sun.org.apache.bcel.internal.generic.LoadClass;
import me.tekkitcommando.jc2.JC2;

/**
 * Created by Ethan and Phill on 1/6/2016.
 */
public class PluginLoader extends ClassLoader {

    public static File pluginDir = new File("plugins");  // Defining Directory/Folder Name

    public static void loadPlugins() {

        FilenameFilter pluginFilter = (File dir, String name) -> {
            return name.endsWith(".zip") || name.endsWith(".jar");
        };

        File[] listOfFiles = pluginDir.listFiles(pluginFilter);
        for (File pluginFile : listOfFiles) {
            List<String> classNames = new ArrayList<String>();
            ZipInputStream zip = null;
            try {
                zip = new ZipInputStream(new FileInputStream("/" + pluginDir + "/" + pluginFile));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                for(ZipEntry entry = zip.getNextEntry(); entry != null; entry = zip.getNextEntry()) {
                    if(!entry.isDirectory() && entry.getName().endsWith(".class")) {
                        String className = entry.getName().replace('/', '.');
                        classNames.add(className.substring(0, className.length() - ".class".length()));
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}