package Tugas;

public abstract class Zombie implements Destroyable{
    protected int health;
    protected int level;

    abstract public void heal();

    abstract public void destroyed();

    public String getZombieInfo(){
        
        return "-- Zombie Identification --\n" 
        + "Health status: " + this.health +"\n"
        + "Level status: " + this.level;
    }
}