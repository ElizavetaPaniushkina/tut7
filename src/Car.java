public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void start() {
        System.out.println("Vehicle started");
        System.out.println("Heated on");
        System.out.println("Number of Seats: " + getNumberOfSeats());
    }

    @Override
    public void stop() {
        System.out.println("Vehicle stopped");
        System.out.println("Heated off");
        System.out.println("Number of Seats: " + getNumberOfSeats());
    }
}