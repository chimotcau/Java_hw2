import java.util.*;

class Zoo {
    private final Map<Integer, Animal> all_animals = new HashMap<>();
    private final Map<Integer, Supervisor> all_supervisors = new HashMap<>();
    private final Map<Integer, Set<Animal>> supervisor_animals = new HashMap<>();

    public Zoo() {

    }

    public Zoo(Collection<? extends Animal> animals) {
        for (Animal animal : animals) {
            add_Animal(animal);
        }
    }

    public void add_Animal(Animal a) {
        all_animals.put(a.getID(), a);
    }

    public void search_Animals(int id) {
        for (Animal animal : all_animals.values()) {
            if (animal.getID() == id) {
                System.out.println(animal);
            }
        }
    }

    public void delete_Animals(int id) {
        for (Animal animal : all_animals.values()) {
            if (animal.getID() == id) {
                all_animals.remove(id);
            }
        }
    }

    public void add_Supervisors(Supervisor s) {
        all_supervisors.put(s.getID(), s);
        supervisor_animals.putIfAbsent(s.getID(), new HashSet<>());
    }

    public void assign_Supervisors(int aId, int sID) {
        Animal animal = all_animals.get(aId);
        Supervisor new_supervisor = all_supervisors.get(sID);

        Supervisor old_supervisor = animal.getSupervisor();

        if (old_supervisor != null) {
            supervisor_animals.get(old_supervisor.getID()).remove(animal);
        }

        animal.setSupervisor(new_supervisor);

        supervisor_animals.putIfAbsent(sID, new HashSet<>());
        supervisor_animals.get(sID).add(animal);

    }

    public void get_Animals_by_SupervisorID(int Id) {
        for (Supervisor supervisor : all_supervisors.values()) {
            if (supervisor.getID() == Id) {
                Set<Animal> animals = supervisor_animals.getOrDefault(supervisor.getID(), Set.of());
                for (Animal animal : animals) {
                    System.out.println(animal);
                }
            }
        }
    }

    public void get_Animals_by_SupervisorName(String name) {
        for (Supervisor supervisor : all_supervisors.values()) {
            if (supervisor.getName().equals(name)) {
                Set<Animal> animals = supervisor_animals.getOrDefault(supervisor.getID(), Set.of());
                for (Animal animal : animals) {
                    System.out.println(animal);
                }
            }
        }
    }

    public void get_Animals_higher(double height) {
        for (Animal animal : all_animals.values()) {
            if (animal.getHeight() > height) {
                System.out.println(animal);
            }
        }
    }

    public void get_Animals_sound() {
        for (Animal animal : all_animals.values()) {
            if (animal instanceof Sound) {
                System.out.println(animal);
            }
        }
    }

    public void get_Animals_same_type(String type) {
        for (Animal animal : all_animals.values()) {
            if (animal.getClass().getSimpleName().equals(type)) {
                System.out.println(animal);
            }
        }
    }

}
