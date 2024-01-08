
import MyInterfaces.Cat;
import MyInterfaces.Dog;
public class App {
    public static void main(String[] args) throws Exception {
        Dog jojo = new Dog();
        Cat leo = new Cat();

        jojo.eat();
        jojo.sleep();
        jojo.makeSound();
        leo.eat();
        leo.sleep();
        leo.makeSound();
    }
}
