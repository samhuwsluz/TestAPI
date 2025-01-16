package ch.ksrminecraft.testAPI;

import org.bukkit.plugin.java.JavaPlugin;

public final class TestAPI extends JavaPlugin {
    TestManager testManager;
    @Override
    public void onEnable() {
        testManager = new TestManager();
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
