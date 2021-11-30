/**
 * 
 * @author YongxinZhuang
 * 
 *
 */
public class HotelList {

    private static Hotel hotel3Star;
    private static Hotel hotel4Star;
    private static Hotel hotel5Star;
    /**
     * {@code HotelList} HotelList Constructor
     * @param hotel3Star the name of 3 star hotel
     * @param hotel4Star the name of 4 star hotel
     * @param hotel5Star the name of 5 star hotel
     */
    public HotelList(Hotel hotel3Star, Hotel hotel4Star, Hotel hotel5Star) {
        HotelList.hotel3Star = hotel3Star;
        HotelList.hotel4Star = hotel4Star;
        HotelList.hotel5Star = hotel5Star;
    }
    /**
     * {@code getMaxOccupancy} get the max occupancy of a specific room type
     * @param roomType the type of room
     * @return the max occupancy of a specific room type
     */
    static int getMaxOccupancy(String roomType) {
        if (roomType.contains("Deluxe")) {
            return hotel5Star.getMaxOccupancy(roomType);
        } else if (roomType.contains("Executive")) {
            return hotel4Star.getMaxOccupancy(roomType);
        } else {
            return hotel3Star.getMaxOccupancy(roomType);
        }
    }
    
    /**
     * {@code getNumberOfRooms}	get the quantity of a specific type of room
     * @param	roomType the type of room
     * @return	the quantity of a specific type of room
     */
    static int getNumberOfRooms(String roomType) {
        if (roomType.contains("Deluxe")) {
            return hotel5Star.getNumberOfRooms(roomType);
        } else if (roomType.contains("Executive")) {
            return hotel4Star.getNumberOfRooms(roomType);
        } else {
            return hotel3Star.getNumberOfRooms(roomType);
        }
    }
    
    /**
     * {@code getRates}	get the rates of a specific type of room
     * @param	roomType the type of room
     * @return	the rates of a specific type of room
     */
    static int[] getRates(String roomType) {
        if (roomType.contains("Deluxe")) {
            return hotel5Star.getRates(roomType);
        } else if (roomType.contains("Executive")) {
            return hotel4Star.getRates(roomType);
        } else {
            return hotel3Star.getRates(roomType);
        }
    }
    
    /**
     * {@code showAllRooms} print details of all hotels
     */
    public void showAllRooms() {
        showRooms3StarHotel();
        showRooms4StarHotel();
        showRooms5StarHotel();
    }
    /**
     * {@code showRooms3StarHotel} print details of 3 star hotels
     */
    public void showRooms3StarHotel() {
        System.out.println("Here is our 3-star hotel:");
        System.out.println(hotel3Star.toString());
    }
    /**
     * {@code showRooms4StarHotel} print details of 4 star hotels
     */
    public void showRooms4StarHotel() {
        System.out.println("Here is our 4-star hotel:");
        System.out.println(hotel4Star.toString());
    }
    /**
     * {@code showRooms5StarHotel} print details of 5 star hotels
     */
    public void showRooms5StarHotel() {
        System.out.println("Here is our 5-star hotel:");
        System.out.println(hotel5Star.toString());
    }
}
