public class GrassPokemon extends Pokemon {

    private String grass;

    private String habbit;


    public GrassPokemon(String name, int level, int hp, String type, String sound, String food, String grass, String habbit) {
        super(name, level, hp, type, sound, food);
        this.grass = grass;
        this.habbit = habbit;
    }

    public String getGrass() {
        return grass;
    }

    public void setGrass(String grass) {
        this.grass = grass;
    }

    public String getHabbit() {
        return habbit;
    }

    public void setHabbit(String habbit) {
        this.habbit = habbit;
    }

    @Override
    public void eat(String food) {
        System.out.println(food);
    }

    public void speaks() {
    }

    public void leafStorm(){
        System.out.println("strike with a leafStorm");
    }

    public String toString() {
        return "My name is " + getName() + " I'm level " + getLevel();
    }





}
