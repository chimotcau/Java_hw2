class Cat extends Animal implements Sound {
    public Cat(int id, double height) {
        super(id, height);
    }
    @Override
    public void makesound() {
        System.out.println("Meow Meow");
    }
}