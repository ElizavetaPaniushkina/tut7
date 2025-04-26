public class Bird extends Animal {
    public double color;
    public Bird(String name, int age, double color) {
        super(name, age);
        this.color = color;
    }
    @Override
    public void makeSound() {
        System.out.println("kar kar");
    }

    @Override
    public void move() {
        System.out.println("kryl'yami op op mashet");
    }

    @Override
    public void naturalHabitat() {
        System.out.println("sky");
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Bird color: " + getColor());
    }
    public double getColor() {
        return color;
    }
}