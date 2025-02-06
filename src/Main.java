public class Main {
    public static void main(String[] args) {
        Person sakura = new Person("Sakura",18);
        Soda sakuraSoda = new Soda("Saki's Soda", 23, false);
        System.out.println(sakuraSoda);
        Soda amethystAurora = new Soda("Amethyst Aurora", 45, true);
        sakuraSoda.drink();
        sakura.drinkSoda(amethystAurora);
        amethystAurora.setBrandName("Amethyst Aurora~");
        sakura.drinkSoda(amethystAurora);
    }
}