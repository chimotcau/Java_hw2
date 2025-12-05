class Horse extends Animal implements Sound {
    public Horse(int id, double height) {
        super(id, height);
    }
    @Override
    public void makesound() {
        System.out.println("HI HI");
    }
}