package OOPs.HumanInfo;
import static OOPs.HumanFunctions.Functions.greet;

/*
    Why the main function is static
    Because we can access the static variable or functions without creating any object so that's a good reason for why we use static with our Main. and if you right click on screen you will see option of Run Classname.Main ClassName is name of your class
 */

public class Human {
    class PracticeClass{
        String name;
        PracticeClass() {
            this.name="Hello";
        }
    }
    public static void main(String[] args) {
        Main.welcome();
        Main h1 = new Main("Mridul", 12);
        System.out.println(Main.population);
        Main h2 = new Main("Rohit", 22);

//        From the other package
        greet();
        walk();
//        For accessing non-static you need to create class object and then access that
        Human h = new Human();
        PracticeClass p = h.new PracticeClass();
        h.sing();

    }

    static void walk() {
        System.out.println("Hey! see i am walking");
    }

    void sing() {
        System.out.println("I am singing");
        walk();
        talk();
    }

    void talk() {
        System.out.println("Hey, I am talking");
    }
}
