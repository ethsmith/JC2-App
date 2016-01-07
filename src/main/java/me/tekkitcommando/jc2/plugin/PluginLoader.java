package me.tekkitcommando.jc2.plugin;

import java.io.File;
import java.io.FilenameFilter;
import me.tekkitcommando.jc2.JC2;

/**
 * Created by methane on 1/6/2016.
 */
public class PluginLoader {

    /**
     * Need to add the code for loading plugins made with the JC2 API and need
     * to add code for requiring a plugin description file.
     */
    File pluginDir = new File("plugins");  // Defining Directory/Folder Name  

    public PluginLoader(JC2 parentApp) {
        try {
            if (!pluginDir.exists()) {  // Checks that Directory/Folder Doesn't Exists!  
                boolean result = pluginDir.mkdir();
                if (result) {
                    System.out.println("New Folder created!");
                }
            }
            
            FilenameFilter pluginFilter = (File dir, String name) -> {
                return name.endsWith(".zip") || name.endsWith(".jar");
            };
            
            File[] listOfFiles = pluginDir.listFiles(pluginFilter);
            for (File pluginFile : listOfFiles) {
                System.out.println("Found plugin file " + pluginFile);
            }
            
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
