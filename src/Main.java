public class Main {


    public static void main(String[] args) {

      GrassPokemon Maractus = new GrassPokemon("Maractus", 1, 45, "GrassPokemon", "Maracas shaking rhythm", "Pokebrocks", "Mariachi song", "Dancing");
      WaterPokemon Squirtle = new WaterPokemon("Squirtle", 1, 44, "WaterPokemon", "Water splashing sound", "SpongBob", "Swimming", "Water", "Watery things");
      FirePokemon Charmander = new FirePokemon("Charmander", 1, 39, "Firepokemon", "Fire crackling sound", "Lava Cake", "Burning stuff", "Inferno");
      ElectricPokemon Pikachu = new ElectricPokemon("Pikachu", 1, 45, "ElectricPokemon", "Pika Pika", "Pokebrocks", "lightning strike", "Talking");



        System.out.println("name: " + Squirtle.getName() + "\nhabbit: " + Squirtle.getHabbit());
        Squirtle.rainDance();
        System.out.println();

        System.out.println("name: " + Maractus.getName() + "\nhabbit: " + Maractus.getHabbit());
        Maractus.leafStorm();
        System.out.println();

        System.out.println("name: " + Charmander.getName() + "\nhabbit: " + Charmander.getHabbit());
        Charmander.attack();
        System.out.println();

        System.out.println("name: " + Pikachu.getName() + "\nhabbit: " + Pikachu.getHabbit());
            Pikachu.electroBall();




    }
}
