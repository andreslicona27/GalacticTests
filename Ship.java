public class Ship {
    private String name;
    private int positionX;
    private int positionY;
    private int size;
    private int laser;

    // BUILDER
    public Ship(String name, int positionX, int positionY, int size, int laser) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.size = size;
        this.laser = laser;
    }

    // SETTERS / GETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPositionX() {
        return positionX;
    }
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }
    public int getPositionY() {
        return positionY;
    }
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getLaser() {
        return laser;
    }
    public void setLaser(int laser) {
        this.laser = laser;
    }

    // FUNCTIONS
    

}
