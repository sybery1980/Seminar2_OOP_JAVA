public class Tiger extends Animal implements   Eatable {
        private int weight;

    public Tiger(String name, int age, String color,int weight) {
        super(name, age, color);
        this.weight = weight;
    }

    public  int getWeight(){
        return weight;
    }

    public  void setWeight(){
        this.weight = weight;
    }
    @Override
    public void voice() {
        System.out.println("Тигр рычит");
    }

    @Override
    public void say() {
        System.out.println("Добрый вечер");
    }


    @Override
    public void eat() {
        System.out.println("Тигр ест");
    }
}

