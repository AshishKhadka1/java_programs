class Animal{

    String name;
    Animal(String name){
        this.name = name;
    }
 void makeSound(){
    System.out.println(name +"makes a sound.");
 }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
    }
void makeSound(){
    System.out.println(name +"barks.");
}
void wagTail() {
    System.out.println(name + "wags it's tail");
 }
}

public class InheritanceP {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Generic Animal ");
        myAnimal.makeSound();
        Dog mydog = new Dog("Buddy ");
        mydog.makeSound();
        mydog.wagTail();
    }
}

