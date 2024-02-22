package minggu02;

public class DragonMain07 {
    public static void main(String[] args) {

        Dragon07 dragon1 = new Dragon07(11, 11, 10, 10);
        dragon1.printPosition();
        dragon1.moveLeft();
        dragon1.printPosition();
        dragon1.moveRight();
        dragon1.printPosition();
        dragon1.moveUp();
        dragon1.printPosition();
        dragon1.moveDown();
        dragon1.printPosition();
        dragon1.detectCollision();

    }
}
