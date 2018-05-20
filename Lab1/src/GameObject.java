public class GameObject {

    int x;
    int y;
    int velocity;
    boolean state;
    int rotation;

    public GameObject(int x, int y, int velocity, boolean state, int roatation)
    {
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        this.state = state;
        this.rotation = rotation;
    }
    public int getX() { return x; }
    public int getY() { return y; }
    public int getVelocity() { return velocity; }
    public boolean getState() { return state; }
    public int getRotation() { return rotation; }

}
