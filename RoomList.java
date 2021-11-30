import java.util.ArrayList;
import java.util.List;

/**
 * @author YongxinZhuang 
 * The {@code RoomList} class creates a ArrayList that could store rooms
 */
public class RoomList {
	/**
	 * @param <Room> the type of elements in this list
	 */
	private List<Room> rooms = new ArrayList<>();

	public List<Room> getRooms() {
		return rooms;
	}

	/**
	 * {@code getTotalOccupancy} get the total occupancy for different types of rooms and return as an Array
	 * @return result the total occupancy of different types of rooms
	 */
	public int[] getTotalOccupancy() {
		int[] result = new int[3];
		for (Room r : rooms) {
			String roomType = r.getRoomType();
			if (roomType.contains("Classic")) {
				result[0] += r.getOccupancy();
			} else if (roomType.contains("Executive")) {
				result[1] += r.getOccupancy();
			} else {
				result[2] += r.getOccupancy();
			}
		}
		return result;
	}

	/**
	 * {@code getMaximalOccupancy} get the max occupancy for different types of rooms and returns as an Array
	 * @return result the max occupancy of different types of rooms 
	 */
	public int[] getMaximalOccupancy() {
		int[] result = new int[3];
		for (Room r : rooms) {
			String roomType = r.getRoomType();
			int occ = HotelList.getMaxOccupancy(roomType);
			if (roomType.contains("Classic")) {
				result[0] += occ;
			} else if (roomType.contains("Executive")) {
				result[1] += occ;
			} else {
				result[2] += occ;
			}
		}
		return result;
	}

	/**
	 *{@code add(Room room)} add a room into ArrayList
	 * @param room the room to be added into ArrayList
	 */
	public void add(Room room) {
		rooms.add(room);
	}

	/**
	 * {@code toString} convert an object to String
	 * <p> StringBuilder allows @param sb to be modified easier
	 * @return the room type and occupancy of the room
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Room r : rooms) {
			sb.append(r.toString()); 
		}
		return sb.toString();
	}
	/**
	 * {@code toTextOutput()} get room types and occupancy of rooms that are in ArrayList
	 * @return the room type and occupancy of the room
	 */
	public String toTextOutput() {
		StringBuilder sb = new StringBuilder();
		for (Room r : rooms) {
			sb.append(r.getRoomType());
			sb.append(",");
			sb.append(r.getOccupancy());
			sb.append(",");
		}
		return sb.toString();
	}
}
