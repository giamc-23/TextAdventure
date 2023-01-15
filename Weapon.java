public class Weapon{

    /** A description of this weapon. */
    private String description;

    /** This is weapon's name. */
    private String name;

    /** The value of weapon's damage. */
    private int i;

    /**
     * @param name
     *            This weapon's name.
     * @param i
     *            The value of weapon's damage.
     * @param description
     *            A description of this weapon.
     */
    public Weapon(String name, int i, String description){
            this.name = name;
            this.i = i;
            this.description = description;
    }

    /** Returns the name of the weapon. */
    public String getName(){
        return name;
    }

    /** Returns the damage value of the weapon. */
    public int getDamage(){
        return i;
    }

    /** Returns the description of the weapon. */
    public String getDescription(){
        return description;
    }
}
