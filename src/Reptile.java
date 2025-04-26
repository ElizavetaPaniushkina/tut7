public class Reptile extends Animal {
    public int length;
    public Reptile(String name,int age, int length) {
        super(name,age);
        this.length = length;
    }
    @Override
    public void makeSound() {
        System.out.println("shhhhh");
    }

    @Override
    public void move() {
        System.out.println("op op tuda suda");
    }

    @Override
    public void naturalHabitat() {
        System.out.println("vezde");
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Reptile length: " + getLength());
    }
    public int getLength() {
        return length;
    }
}