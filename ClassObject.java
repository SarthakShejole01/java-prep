public class ClassObject {
    // fields (state)
    private String brand;
    private int speed;

    // constructor
    public Car(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    // methods (behaviour)
    public void accelerate(int amount) {
        speed += amount;
    }

    public int getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        Car a = new Car("Tata");   // `new` creates the object on the heap
        Car b = new Car("Honda");  // a second, separate object
        a.accelerate(40);
        System.out.println(a.getSpeed()); // 40
        System.out.println(b.getSpeed());
    }
}

