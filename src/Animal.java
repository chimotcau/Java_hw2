abstract class Animal {
    final int id;
    final double height;
    Supervisor supervisor;

    protected Animal(int id, double height) {
        this.id = id;
        this.height = height;
    }

    public int getID() {
        return id;
    }

    public double getHeight() {
        return height;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

}
