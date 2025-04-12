package dev.bluenightfury46.strongerCreaking;

import org.bukkit.EntityEffect;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntitySpawnEvent;

public class CreakingEvent implements Listener {

    @EventHandler
    public void event(EntityDamageEvent e){

        try{



            if(e.getDamageSource().getCausingEntity().getType().equals(EntityType.CREAKING)){
                e.setDamage((e.getDamage()*StrongerCreaking.damage)+StrongerCreaking.addition);

            }




        }catch(NullPointerException ex){

        }
    }
}
