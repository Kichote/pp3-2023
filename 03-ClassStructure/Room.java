public class Room {

    public class Room {
        private int number;
        private int beds;
        private boolean occupied;
        private String guestName;
    
        // Constructor with default beds value of 2
        public Room(int number) {
            this(number, 2);
        }
    
        // Constructor with specified number of beds
        public Room(int number, int beds) {
            this.number = number;
            this.beds = beds;
            this.occupied = false;
            this.guestName = null;
        }
    
        // Method to check in a guest
        public void checkIn(String guestName) {
            if (!occupied) {
                this.guestName = guestName;
                this.occupied = true;
                System.out.println("Guest " + guestName + " checked into Room " + number + ".");
            } else {
                System.out.println("Room " + number + " is already occupied.");
            }
        }
    
        // Method to check out a guest
        public void checkOut() {
            if (occupied) {
                System.out.println("Guest " + guestName + " checked out of Room " + number + ".");
                this.guestName = null;
                this.occupied = false;
            } else {
                System.out.println("Room " + number + " is not occupied.");
            }
        }
    
        // Method to check if the room is occupied
        public boolean isOccupied() {
            return occupied;
        }
    
        // Method to display the status of the room
        public String displayStatus() {
            return "Room " + number + " has " + beds + " bed(s).";
            if (occupied) {
                return "Currently occupied by: " + guestName;
            } else {
                return "Currently unoccupied.";
            }
        }

        // Define toString() method to return information about the room status
        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            result.append("Room ").append(number).append(" has ").append(beds).append(" bed(s).");

            if (occupied) {
                result.append(" Currently occupied by: ").append(guestName);
            } else {
                result.append(" Currently unoccupied.");
            }

            return result.toString();
        }

        // Static method to generate a report of occupied rooms
        public static void generateOccupiedRoomsReport(List<Room> roomList) {
            System.out.println("Occupied Rooms Report:");
            for (Room room : roomList) {
                if (room.isOccupied()) {
                    System.out.println(room);
                }
            }
            System.out.println();
        }

        // Static method to generate a report of available rooms
        public static void generateAvailableRoomsReport(List<Room> roomList) {
            System.out.println("Available Rooms Report:");
            for (Room room : roomList) {
                if (!room.isOccupied()) {
                    System.out.println(room);
                }
            }
            System.out.println();
        }

        // Static method to generate a report of all rooms
        public static void generateAllRoomsReport(List<Room> roomList) {
            System.out.println("All Rooms Report:");
            for (Room room : roomList) {
                System.out.println(room);
            }
            System.out.println();
        }
        
            public static void main(String[] args) {
                // Create an array to store room objects
                Room[] rooms = new Room[6];
        
                // Create three rooms with two beds
                rooms[0] = new Room(101);
                rooms[1] = new Room(102);
                rooms[2] = new Room(103);
        
                // Create two rooms with three beds
                rooms[3] = new Room(201, 3);
                rooms[4] = new Room(202, 3);
        
                // Create one room with one bed
                rooms[5] = new Room(301, 1);
        
                // Example usage
                rooms[0].checkIn("John Doe");
                rooms[2].checkIn("Jane Smith");
                rooms[4].checkIn("Alice Johnson");
        
                rooms[1].displayStatus();
                rooms[3].displayStatus();
        
                rooms[0].checkOut();
                rooms[5].checkIn("Bob Anderson");
        
                rooms[2].displayStatus();
                rooms[0].displayStatus();
            }
        }
}