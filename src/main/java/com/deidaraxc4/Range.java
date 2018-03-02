package com.deidaraxc4;

public interface Range {
    
    /**
     * Deals basic attack based on strength
     * @return int the amount of damage, in negative integer
     */
    int basicAttack();

    /**
     * Gets the type of entity
     * 1: Melee 2. Magic 3. Range
     */
    int getType();

} // Range