import java.util.Arrays;

public class HotelRoom {
    private String roomType;
    private int numberOfRooms;
    private int maxOccupancy;
    private int[] rates = new int[7];

    public HotelRoom(String roomType, int numberOfRooms, int maxOccupancy, int[] rates) {
        this.roomType = roomType;
        this.numberOfRooms = numberOfRooms;
        this.maxOccupancy = maxOccupancy;
        this.rates = rates;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public int[] getRates() {
        return rates;
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                "roomType='" + roomType + '\'' +
                ", numberOfRooms=" + numberOfRooms +
                ", maxOccupancy=" + maxOccupancy +
                ", rates=" + Arrays.toString(rates) +
                "}\n";
    }
}
