public class WaterPokemon extends FirePokemon {

    private String water;

    public WaterPokemon(String name, int level, int hp, String type, String sound, String food, String habbit, String song, String water) {
        super(name, level, hp, type, sound, food, habbit, song);
        this.water = water;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    @Override
    public void eat(String food) {
       System.out.println(food);
    }

    public void speaks() {
    }

    public void hydroPunp(){
        System.out.println("strikes with a hydroPump ");
    }
    public void rainDance(){
        System.out.println("attacks with a rainDance ");
    }

    public void printAttacks(){
        hydroPunp();
        rainDance();
    }

}
