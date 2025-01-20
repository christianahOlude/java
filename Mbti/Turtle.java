public class Turtle {

    public int x;
    public int y;
    public PenState penstate;
    public Orientation orientation;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void move(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void moveRight() {}

    public void moveLeft() {}

    enum PenState {
        UP, DOWN
    }

    enum Orientation {
        NORTH, EAST, SOUTH, WEST
    }
}