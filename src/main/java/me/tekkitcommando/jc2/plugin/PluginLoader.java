package me.tekkitcommando.jc2.plugin;

import java.io.FileInputStream;
import java.lang.ClassLoader;
import java.io.File;
import java.io.FilenameFilter;
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
            // Don't worry about this for rn, I have a plan.
        }

        List<String> classNames = new ArrayList<String>();
        ZipInputStream zip = new ZipInputStream(new FileInputStream("/path/to/jar/file.jar")); // Will be changed
        for (ZipEntry entry = zip.getNextEntry(); entry != null; entry = zip.getNextEntry()) {
            if (!entry.isDirectory() && entry.getName().endsWith(".class")) {
                // This ZipEntry represents a class. Now, what class does it represent?
                String className = entry.getName().replace('/', '.'); // including ".class"
                classNames.add(className.substring(0, className.length() - ".class".length()));
            }
        }
    }
}