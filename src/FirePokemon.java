public class FirePokemon extends Pokemon {

    private String fire;
    private String habbit;

    public FirePokemon(String name, int level, int hp, String type, String sound, String food, String habbit, String fire) {
        super(name, level, hp, type, sound, food);
        this.habbit = habbit;
        this.fire = fire;
    }

    public FirePokemon(String name, int level, int hp, String type, String sound, String food) {
        super(name, level, hp, type, sound, food);
    }

    public String getSong() {
        return fire;
    }

    public void setSong(String song) {
        this.fire = song;
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
        System.out.println(getName() + " said " + getFood());
    }

    public void attack() {
        System.out.println(getName() + " strikes with fire");
    }



}
