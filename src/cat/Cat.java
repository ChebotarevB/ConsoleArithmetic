package cat;
import animal.Animal;
public class Cat extends Animal {
    @Override
    public void giveVoice(){
        System.out.println("Meow");
    }
}
