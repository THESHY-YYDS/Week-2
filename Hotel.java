import java.util.ArrayList;
import java.util.List;
/**
 * {@code Hotel} create a ArrayList that store Hotel
 * @author SiweiDai
 *
 */
public class Hotel {

    private List<HotelRoom> listOfRooms = new ArrayList<>();
    /**
     * {@code getListOfRooms} get the ArrayList of rooms
     * @return all rooms as an ArrayList
     */
    public List<HotelRoom> getListOfRooms() {
        return listOfRooms;
    }
    /**
     * {@code getMaxOccupancy} get max occupancy of a specific type of room
     * @param roomType the type of room
     * @return if {@code roomType} equals room type in {@code listofRooms} return the max occupancy
     */
    public int getMaxOccupancy(String roomType) {
        for (HotelRoom hr : listOfRooms) {
            if (hr.getRoomType().equals(roomType)) {
                return hr.getMaxOccupancy();
            }
        }
        return -1;
    }

    /**
     * {@code getNumberOfRooms} get quantity of a specific type of room
     * @param roomType the type of room
     * @return if {@code roomType} equals room type in {@code listoOfRooms} return the quantity 
     */
    public int getNumberOfRooms(String roomType) {
        for (HotelRoom hr : listOfRooms) {
            if (hr.getRoomType().equals(roomType)) {
                return hr.getNumberOfRooms();
            }
        }
        return -1;
    }
    /**
     * {@code getRates} get rates of a specific type of room
     * @param roomType the type of room
     * @return if{@code roomType} equals room type in {@code listOfRooms} return the rates
     */
    public int[] getRates(String roomType) {
        for (HotelRoom hr : listOfRooms) {
            if (hr.getRoomType().equals(roomType)) {
                return hr.getRates();
            }
        }
        return null;
    }

    /**
     * {@code toString} convert a Object to String
     * @return the details of rooms
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (HotelRoom hr : listOfRooms) {
            sb.append(hr.toString());
        }
        return sb.toString();
    }
}
