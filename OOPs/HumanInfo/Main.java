package OOPs.HumanInfo;

public class Main {
    String name;
    int age;
    static int population;

    Main(String name, int age) {
        this.name = name;
        this.age = age;
        Main.population += 1;
    }

    static void welcome() {
        System.out.println("Help");
    }
}



