public class ZooManagement {
    public static void main(String[] args) {
        Lion lion = new Lion("Leo", 5, "Golden Pride");
        Eagle eagle = new Eagle("Eddy", 3, 2);
        Snake snake = new Snake("Shhhhnake", 2, 3);

        lion.displayInformation();
        lion.move();

        eagle.displayInformation();
        eagle.move();

        snake.displayInformation();
        snake.move();
    }
}
