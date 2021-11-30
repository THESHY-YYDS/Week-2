import java.time.*;

/*A Reservation Object*/
public class Reservation {

    private String resType, name;
    private double totalCost;
    private LocalDate checkIn, checkOut;
    private int numOfRoom;
    private int refNo;
    private RoomList roomList;

    public Reservation(int refNo, String name, String resType, LocalDate checkIn, LocalDate checkOut,
                       int numOfRoom, RoomList roomList, double totalCost){
        this.refNo = refNo;
        this.name = name;
        this.resType = resType;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numOfRoom = numOfRoom;
        this.roomList = roomList;
        this.totalCost = totalCost;
    }

    public String getResType() {
        return resType;
    }

    public String getName() {
        return name;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public int getNumOfRoom() {
        return numOfRoom;
    }

    public int getRefNo() {
        return refNo;
    }

    public RoomList getRoomList() {
        return roomList;
    }

//    public int getOccupancy() {
//        return occupancy;
//    }

    public double getTotalCost() {
        return totalCost;
    }

    public int[] getTotalOccupancy() {
        return roomList.getTotalOccupancy();
    }

    public int[] getMaximalOccupancy() {
        return roomList.getMaximalOccupancy();
    }

    //    /*Reservation Constructor*/
//    public Reservation(String name, String type, String roomType, String checkIn, String checkOut, int occupancy, String filePath) throws Exception {
//        if (available(roomType, checkIn, checkOut, occupancy)) {
//            this.name = name;
//            this.resType = type;
//            this.roomType = roomType;
//            this.checkIn = checkIn;
//            this.checkOut = checkOut;
//            this.occupancy = occupancy;
//            bookings++;
//            refNo = bookings;
//            addRes();
//            this.filePath = filePath;
//        }
//    }

//    /*Adds reservation to reservation.csv file*/
//    public void addRes() {
//        try (FileWriter fw = new FileWriter(filePath, true);
//             BufferedWriter bw = new BufferedWriter(fw);
//             PrintWriter out = new PrintWriter(bw)) {
//            out.println(name + ", " + refNo + ", " + resType + ", " + roomType + ", " + checkIn + ", " + checkOut + ", " + getTotal());
//        } catch (IOException e) {
//
//        }
//    }

//    /*Checks if selected room is available for those dates by checking the amount not available in reservation list*/
//    public boolean available(String roomType, String checkIn, String checkOut, int occupancy) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
//        LocalDate checkIn1 = LocalDate.parse(checkIn, formatter);
//        LocalDate checkOut1 = LocalDate.parse(checkOut, formatter);
//        File file = new File(filePath);
//        FileReader fr = null;
//
//        try {
//            fr = new FileReader(file);
//        } catch (FileNotFoundException e) {
//        }
//
//        BufferedReader br = new BufferedReader(fr);
//        String line;
//        String[] parts;
//        int taken = 0;
//
//        try {
//            while ((line = br.readLine()) != null) {
//                parts = line.split(", ");
//                String roomType2 = parts[3];
//                LocalDate checkIn2 = LocalDate.parse(parts[4], formatter);
//                LocalDate checkOut2 = LocalDate.parse(parts[5], formatter);
//
//                if (roomType2.equals(roomType)  && (checkIn1.isBefore(checkIn2) && checkOut1.isBefore(checkIn2)) ||
//                        (checkIn1.isBefore(checkIn2) && checkOut1.isEqual(checkIn2)) ||
//                        (checkIn1.isAfter(checkOut2) && checkOut1.isAfter(checkOut2)) ||
//                        (checkIn1.isEqual(checkOut2) && checkOut1.isAfter(checkOut2))) {
//
//                } else {
//                    taken++;
//                }
//            }
//        } catch (IOException e) {
//        }
//
//        if (taken < RoomList.getRooms(roomType) && occupancy <= roomList.getOccupancy(roomType)) {
//            return true;
//        }
//
//        return false;
//    }

//    /*Calculates the total cost of the booking
//      @return double*/
//    public double getTotal() {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
//        LocalDate checkIn1 = LocalDate.parse(checkIn, formatter);
//        LocalDate dateCopy = LocalDate.parse(checkIn, formatter);
//        LocalDate checkOut1 = LocalDate.parse(checkOut, formatter);
//        Double[] rates = RoomList.getRates(roomType);
//        double total = 0;
//        while (dateCopy != checkOut1) {
//            int index = dateCopy.getDayOfWeek().getValue() - 1;
//            total = total + rates[index];
//            dateCopy = dateCopy.plusDays(1);
//        }
//        if (resType == "AP") {
//            total = total * 0.95;
//        }
//        return total;
//    }

    @Override
    public String toString() {
        return "Reservation {" +
                "resType='" + resType + '\'' +
                ", name='" + name + '\'' +
                ", totalCost=" + totalCost +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", numOfRoom=" + numOfRoom +
                ", refNo=" + refNo +
                ", " + roomList.toString() + '}';
    }

    @Override
    public boolean equals(Object res2) {
        if (res2 instanceof Reservation) {
            if (this.refNo == ((Reservation) res2).refNo) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

