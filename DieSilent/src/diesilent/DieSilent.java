package diesilent;



import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class DieSilent extends JavaPlugin implements Listener{

	@Override
	public void onEnable() 
	{		
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(this,  this);
	}
	
	@EventHandler(priority = EventPriority.NORMAL)
    public void onEntityDeath(EntityDeathEvent event) {
		
		if (event instanceof PlayerDeathEvent) 
		{     	
            PlayerDeathEvent e = (PlayerDeathEvent) event;
            e.setDeathMessage(null);
        }
    }
		
}
