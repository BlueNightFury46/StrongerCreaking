package dev.bluenightfury46.strongerCreaking;

import org.bukkit.plugin.java.JavaPlugin;
import org.yaml.snakeyaml.error.YAMLException;

public final class StrongerCreaking extends JavaPlugin {

   public static StrongerCreaking plugin;

   public static double damage = 1.0;
   public static double addition = 0.0;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        plugin.saveDefaultConfig();

        try{
            damage = this.getConfig().getDouble("damage-multiplier");
            if(damage == 0){
                damage = 1;
            }
        } catch(NullPointerException e){
            this.getLogger().info("Error! Failed to load damage-multiplier property in config.yml");

        } catch (YAMLException e){
            this.getLogger().severe("Encountered YAML exception " + e);
        }
        try{
            addition = this.getConfig().getDouble("addition-multiplier");
        } catch(NullPointerException e){
            this.getLogger().info("Error! Failed to load addition-multiplier property in config.yml");

        } catch (YAMLException e){
            this.getLogger().severe("Encountered YAML exception " + e);
        }



        this.getServer().getPluginManager().registerEvents(new CreakingEvent(), this);




    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
