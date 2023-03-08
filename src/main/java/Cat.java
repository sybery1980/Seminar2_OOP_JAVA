public class Cat extends Animal implements Say,Eatable{
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }


    @Override
    public void voice() {
        System.out.println("Котик громко мяукает");
    }

    @Override
    public void say() {

    }

    @Override
    public void eat() {
        System.out.println("Киса много чавкает");

    }
}
