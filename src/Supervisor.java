class Supervisor {
    final int id;
    final String name;

    public Supervisor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getID(){
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + name  ;
    }
}
