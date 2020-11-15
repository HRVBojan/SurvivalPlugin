package at.rizesmc;

import at.rizesmc.data.DataHandler;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

/**
 * Created: 15.11.2020
 * Project: SurvivalPlugin
 *
 * @author Bojan
 */
public class Survival extends JavaPlugin {
    public static Survival instance;
    public static final String PREFIX = DataHandler.getInstance().getConfig().getString("prefix");

    @Override
    public void onEnable() {
        instance = this;

        Bukkit.getConsoleSender().sendMessage(getPrefix() + "Das Plugin wurde gestartet");
    }

    @Override
    public void onDisable() {

    }

    public static Survival getInstance() {
        return instance;
    }

    public static String getPrefix() {
        return PREFIX;
    }
}
