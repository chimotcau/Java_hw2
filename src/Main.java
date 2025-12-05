public class Main{
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        Supervisor supervisor1 = new Supervisor(1, "Khoa");
        Supervisor supervisor2 = new Supervisor(2, "Vo");
        Supervisor supervisor3 = new Supervisor(3, "Nguyen");

        zoo.add_Supervisors(supervisor1);
        zoo.add_Supervisors(supervisor2);
        zoo.add_Supervisors(supervisor3);

        Cat cat = new Cat(1, 10);
        Dog dog = new Dog(2, 20);
        Hippo hippo = new Hippo(3, 30);
        Horse horse = new Horse(4, 40);
        Fish fish = new Fish(5,5);

        zoo.add_Animal(cat);
        zoo.add_Animal(dog);
        zoo.add_Animal(hippo);
        zoo.add_Animal(horse);
        zoo.add_Animal(fish);

        zoo.assign_Supervisors(1,1);
        zoo.assign_Supervisors(2,1);
        zoo.assign_Supervisors(3,2);
        zoo.assign_Supervisors(4,3);
        zoo.assign_Supervisors(5,3);

        zoo.search_Animals(2);

        zoo.get_Animals_by_SupervisorID(1);

        zoo.get_Animals_by_SupervisorName("Vo");

        zoo.get_Animals_higher(20);

        zoo.get_Animals_sound();

        zoo.get_Animals_same_type("Cat");

    }
}
