abstract class Creature {
    public abstract void produceSound();
}

class Cat extends Creature {
    @Override
    public void produceSound() {
        System.out.println("The cat is meowing: Meow! Meow!");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Creature myPet = new Cat();
        myPet.produceSound();
    }
}
