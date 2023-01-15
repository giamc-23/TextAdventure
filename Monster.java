public class Monster {

    /** A description of this monster. */
    private String description;

    /** This is monster's name. */
    private String name;

    /** The value of Monster's armor. */
    private int i;

    /**
     * @param name
     *            This Monster's name.
     * @param i
     *            The value of Monster's armor.
     * @param description
     *            A description of this Monster.
     */
    public Monster(String name, int i, String description) {
        this.name = name;
        this.i = i;
        this.description = description;
    }

    /** Returns the name of the monster. */
    public String getName() {
        return name;
    }

    /** Returns a value of the monster's armor. */
    public int getArmor() {
        return i;
    }

    /** Returns a description of this Monster. */
    public String getDescription() {
        return description;
    }
}
