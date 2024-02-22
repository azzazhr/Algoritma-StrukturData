package minggu02;

public class Dragon07 {
    int x, y, width, height;

    public Dragon07(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }

    void moveLeft() {
        if (x > 0 || x < width) {
            x--;
        }

    }

    void moveRight() {
        if (x > 0 || x < width) {
            x++;
        }
    }

    void moveUp() {
        if (y > 0 || x < height) {
            y--;
        }
    }

    void moveDown() {
        if (y > 0 || x < height) {
            y++;
        }
    }

    void printPosition() {
        System.out.println("Posisi Dragon: (" + x + ", " + y + ")");

    }

    void detectCollision() {
        System.out.println("Game Over ");
    }
}
