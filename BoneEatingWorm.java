public class BoneEatingWorm extends Animal {
    private float size;

    // Constructor
    public BoneEatingWorm(String name, int age, float size) {
        super(name, age);
        this.size = size;
    }

    // Getters
    public float getSize() {
        return size;
    }

    // Setters
    public void setSize(float size) {
        this.size = size;
    }

    // Implement abstract
    @Override
    public void makeSound() {
        System.out.println(""); // they silent
    }

    // Custom
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Size: " + getSize());
    }

    public void eatBone() {
        System.out.println("Yum!");
    }
}
