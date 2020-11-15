package at.rizesmc.data;

import at.rizesmc.Survival;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

/**
 * Created: 15.11.2020
 * Project: SurvivalPlugin
 *
 * @author Bojan
 */
public class DataHandler {
    private static DataHandler ourInstance = new DataHandler();

    public static DataHandler getInstance() {
        return ourInstance;
    }

    private DataHandler(){
        this.configFile = new File(Survival.getInstance().getDataFolder(), "config.yml");
        if(!this.configFile.exists()){
            try{
                this.configFile.createNewFile();
            } catch (IOException ex){
                ex.printStackTrace();
            }
        }
        this.config = YamlConfiguration.loadConfiguration(this.configFile);
    }

    private File configFile;
    private FileConfiguration config;

    public FileConfiguration getConfig() {
        return config;
    }

    public void saveInfo(){
        try {
            this.config.save(this.configFile);
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
