public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Вася", 1, "Черно-оранжевый",40);
        Cat cat = new Cat("Петя", 1,"Серебрянный");
        Fish fish = new Fish("Рыбонька",1,"Черный");

        tiger.voice();
        tiger.eat();
        cat.voice();
        cat.eat();
        fish.swim();
    }
}
