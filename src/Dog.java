class Dog extends Animal implements Sound {
    public Dog(int id, double height) {
        super(id, height);
    }
    @Override
    public void makesound() {
        System.out.println("GO GO");
    }
}