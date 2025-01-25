package Day5.hybrid_inheritance.resturant_management_system;

// Subclass Manager inheriting from Person and implementing Worker
class Manager extends Person implements Worker {
    public Manager(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is overseeing restaurant operations.");
    }
}