class Hippo extends Animal implements Sound {
    public Hippo(int id, double height) {
        super(id, height);
    }
    @Override
    public void makesound() {
        System.out.println("Gu Gu");
    }
}