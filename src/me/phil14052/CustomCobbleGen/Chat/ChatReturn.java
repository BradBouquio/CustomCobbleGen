/**
 * CustomCobbleGen By @author Philip Flyvholm
 * ChatReturn.java
 */
package me.phil14052.CustomCobbleGen.Chat;

import me.phil14052.CustomCobbleGen.API.Tier;
import org.bukkit.entity.Player;

/**
 * @author Philip
 *
 */
public interface ChatReturn {

	public Player getPlayer();
	public void setPlayer(Player p);
	
	public Tier getTier();
	public void setTier(Tier tier);
	
	public ChatReturnType getType();
	public void setType(ChatReturnType type);
	
	public String validInput(String input);
	
}
