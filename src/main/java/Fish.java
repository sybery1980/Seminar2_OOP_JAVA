public class Fish extends Animal implements Swimmable{
    public Fish(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void voice() {

    }

    @Override
    public void say() {

    }


    @Override
    public void swim() {
        System.out.println("Рыбка плывёт");

    }

    @Override
    public void eat() {

    }
}

