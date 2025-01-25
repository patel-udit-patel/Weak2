package Day5.hybrid_inheritance.resturant_management_system;

// Subclass Chef inheriting from Person and implementing Worker
class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking delicious meals.");
    }
}
