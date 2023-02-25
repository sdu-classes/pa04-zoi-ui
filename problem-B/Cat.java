class Cat extends  Animal implements Pet{
    String name;

    Cat(String name){
        super(4);
        this.name = name;
    }
    Cat(){
        this("");
    }
    @Override

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public void play() {
        System.out.println("this cat play");

    }

    @Override
    public void eat() {
        System.out.println("The cat eat fish'");
    }
}
