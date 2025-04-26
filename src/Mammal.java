public class Mammal extends Animal {
    private String prideName;
    public Mammal(String name, int age,String prideName) {
        super(name, age);
        this.prideName = prideName;
    }
    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    @Override
    public void move() {
        System.out.println("Runs on four legs");
    }

    @Override
    public void naturalHabitat() {
        System.out.println("Savannas and grasslands");
    }
    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println(prideName);
    }
    public String getPrideName() {
        return prideName;
    }
}
