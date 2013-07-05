package net.minecraft.workbench.plugin;

/**
 * This class is extended and filled in by the plugin developer. It will provide the required access
 */
public abstract class Plugin {
    /**
     * This method is called every game tick.
     */
    public void tick()
    {
        // Stub Method
    }
    /**
     * This method is called to determine the name of the plugin.
     * 
     * @return Plugin name.
     */
    public abstract String getName();
}
