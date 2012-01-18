package pkg100379t;

/**
 * @author Tharindu Amila
 */

abstract class Animal{
    private int numberOfLegs;
    private String shout;
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void drink(){
        System.out.println("Animal is Drinking");
    }
    public void shout(){
        System.out.println(shout);
    }
    public void setSound(String sound){
        shout = sound;
    }
    public void setLegs(int leg){
        numberOfLegs = leg;
    }
    public int getLegs(){
        return numberOfLegs;
    }
    public abstract void move();
}


class Dog extends Animal{

    Dog(){
        this.setLegs(4);
        this.setSound("Bow Bow");
    }
    @Override
    public void move() {
        System.out.println("The dog is running with its "+super.getLegs()+" legs");
    }
}


class Bird extends Animal{

    Bird(){
        this.setLegs(2);
        this.setSound("Chirp Chirp");
    }
    @Override
    public void move() {
        System.out.println("The Bird is flying");
    }
}


public class Main {

    public static void main(String[] args) {
        Dog rover = new Dog();
        Bird tutu = new Bird();
        System.out.println("The Dog Class in action");
        rover.shout();
        rover.drink();
        rover.eat();
        rover.move();
        System.out.println("\nThe Bird Class in action");
        tutu.shout();
        tutu.drink();
        tutu.eat();
        tutu.move();
       
    }
}
