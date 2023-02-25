class Fish extends  Animal implements Pet{


     Fish() {
        super(0);
    }


    @Override
    public void walk() {
        System.out.println("Fish can't walk and don't have legs");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {


    }

    @Override
    public void play() {
        System.out.println("His is not play");

    }

    @Override
    public void eat() {
        System.out.println("Fish eats plankton");
    }
}
