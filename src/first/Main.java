package first;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("You're not entered any animal");
        } else {
            var animal = getAnimalByName(args[0]);
            System.out.println(animal.getDescription());
        }
    }

    private static Animal getAnimalByName(String name) {
        switch (name.toLowerCase()) {
            case "cat":
                return new Animal("Cat", () -> "meow", () -> "catching mice");
            case "dog":
                return new Animal("Dog", () -> "woof", () -> "protecting house");
            case "hedgehog":
                return new Animal("Hedgehog", () -> "frr", () -> "catching mice");
            default:
                return new Animal("Unknown animal", () -> "arrrrrr", () -> "tigdin-tigdin");
        }
    }
}
