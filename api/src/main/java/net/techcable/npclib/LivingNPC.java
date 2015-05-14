package net.techcable.npclib;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

/**
 * Represents a living non-player controlled entity
 *
 * @author Techcable
 * @version 2.0
 * @since 2.0
 */
public interface LivingNPC extends NPC {

    /**
     * Set the current name of the npc
     * @param name the new name
     */
    public void setName(String name);

    /**
     * Retrieve the name of this npc
     * @return this npc's name
     */
    public String getName();

    /**
     * Get the entity associated with this npc
     *
     * @return the entity
     */
    @Override
    public LivingEntity getEntity();

    /**
     * The npc's head will look in this direction
     * @param toFace the direction to look
     */
    public void faceLocation(Location toFace);

    /**
     * Returns if the implementation of the npc is able to walk
     *
     * @return if the implementation of the npc is able to walk
     */
    public boolean isAbleToWalk();

    /**
     * Walk to the specified location
     *
     * @throws java.lang.UnsupportedOperationException if unsupported
     * @param l the location to walk to
     */
    public void walkTo(Location l);

}