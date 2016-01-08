package me.tekkitcommando.jc2.plugin;

import java.util.ArrayList;

/**
 * Created by ethan on 1/7/2016.
 */
public interface PluginFunctions {

    public String getPluginName();

    public ArrayList getCommandNames();

    public void setParameter(int param);

    public int getResult();

    public boolean hasError();
}
