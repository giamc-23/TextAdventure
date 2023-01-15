import java.util.ArrayList;

public class Room {

    /** A description of the room. */
    private String description;

    /** This is the room's name. */
    private String name;

    /** This tells you the directions you can go to exit the room */
    private ArrayList<String> exits;

    /** This tells you the monster in the room */
    private Monster monster;

    /** This tells you the neighbors of room */
    private ArrayList<Room> neighbors;

    /** This tells you the treasure in the room */
    private Treasure treasure;

    /** This tells you the weapon in the room */
    private Weapon weapon;

    /**
     * @param name
     *            This is the room's name.
     * @param description
     *            A description of the room.
     */
    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        neighbors = new ArrayList<Room>(0);
        exits = new ArrayList<String>(0);
    }

    /**
     * @return it returns the name of the room
     */
    public String getName() {
        return name;
    }

    /**
     * @return it returns the description of the room
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param direction
     *            the direction that you want to add a neighbor too in the room
     * @param room
     *            the room that's being added a neighbor to
     *
     * This method adds a room name to neighbors arraylist and direction to exits arraylist
     */
    public void addNeighbor(String direction, Room room){
        neighbors.add(room);
        exits.add(direction);
    }

    /**
     * @param direction
     *                 the direction that you want to go to
     *
     * @return it returns room that corresponds with the direction
     */
    public Room getNeighbor(String direction) {
        int e = exits.indexOf(direction);
        return neighbors.get(e);

    }

    /**
     *The point of this method is to tell you what directions are avaliable for each room.
     *
     * @return it returns the directions in exits in a string
     */
    public String listExits() {
        return exits.toString();
    }

    /**
     *The point of this method is to get the monster you want
     *
     * @return it returns the monster that was set
     */
    public Monster getMonster() {
        return monster;
    }

    /**
     *The point of this method is to set the monster
     *
     */
    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    /**
     *The point of this method is to get the weapon you want
     *
     * @return it returns the weapon that was set
     */
    public Weapon getWeapon() {
        return weapon;
    }

    /**
     *The point of this method is to set the weapon
     *
     */
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    /**
     *The point of this method is to get the treasure you want
     *
     * @return it returns the treasure that was set
     */
    public Treasure getTreasure() {
        return treasure;
    }

    /**
     *The point of this method is to set the treasure
     *
     */
    public void setTreasure(Treasure treasure) {
        this.treasure = treasure;
    }


}
