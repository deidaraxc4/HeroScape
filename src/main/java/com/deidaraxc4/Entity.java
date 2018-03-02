package com.deidaraxc4;

public class Entity {
    private int health;
    private int strength;
    private int mana;
    
    /**
     * Default constructor
     */
    public Entity() {
	this.health = 0;
	this.strength = 0;
	this.mana = 0;
    } // Entity
    
    /**
     * Checks status of health
     * @return true if health greater than 0
     */
    public boolean isAlive() {
	if(health>0) return true;
	
	return false;
    } // isAlive

    // Getters Setters

    public int getHealth() {
	return this.health;
    } // getHealth

    public int getStrength() {
	return this.strength;
    } // getStrength

    public int getMana() {
	return this.mana;
    } // getMana

    public void setHealth(int n) {
	this.health += n;
    } // setHealth

    public void setStrength(int n) {
	this.strength += n;
    } // setStrength

    public void setMana(int n) {
	this.mana += n;
    } // setMana

    

} // Entity