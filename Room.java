/**
 * 
 * @author SiweiDai
 *
 */
public class Room {
    private String roomType;
    private int occupancy;
/**
 * {@code Room} Room Constructor
 * @param roomType the type of room
 * @param occupancy the occupancy of room
 */
    public Room(String roomType, int occupancy) {
        this.roomType = roomType;
        this.occupancy = occupancy;
    }
/**
 * {@code getRoomType} get the type of room
 * @return the type of room
 */
    public String getRoomType() {
        return roomType;
    }
/**
 * {@code getOccupancy} get the occupancy of room
 * @return the occupancy of room
 */
    public int getOccupancy() {
        return occupancy;
    }

/**
 * {@code toStrig} convert an object to String
 * @return the room type and occupancy
 */
    public String toString() {
        return "Room{" +
                "roomType='" + roomType + '\'' +
                ", occupancy=" + occupancy +
                '}';
    }
}
