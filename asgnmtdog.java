package january18;
class Dog {
    public void speak() {
        System.out.println("woof!");
    }
}
class Beagle extends Dog{
    public void speak(){
        System.out.println("arf arf");
    }
}
public class asgnmtdog{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.speak();
        
        Dog d1 = new Beagle();
        d1.speak();
    }
}
