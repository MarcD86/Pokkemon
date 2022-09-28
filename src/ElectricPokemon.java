public class ElectricPokemon extends Pokemon {

    private String lightning;
    private String habbit;

    // constructor(s) ---------------------------------------------------------------------------
    public ElectricPokemon(String name, int level, int hp, String type, String sound, String food, String lightning, String habbit) {
        super(name, level, hp, type, sound, food);
        this.lightning = lightning;
        this.habbit = habbit;
    }

    // gettersNsetters -----------------------------------------------------------------------------

    public String getLightning() {
        return lightning;
    }

    public void setLightning(String lightning) {
        this.lightning = lightning;
    }

    public String getHabbit() {
        return habbit;
    }

    public void setHabbit(String habbit) {
        this.habbit = habbit;
    }

    // methods ----------------------------------------------------------------------------------


    @Override
    public void eat(String food) {
        System.out.println(food);
    }

    public void speaks() {
        System.out.println(getName() + " said " + getFood());
    }

    public void electroBall(){
        System.out.println(getName() + " strikes with a Thunderpunch! ");
    }

    public void voltTackle(){
        System.out.println(getName() + " attacks with a voltTackle ");
    }



    public void printAttacks() {
        voltTackle();
        electroBall();
    }


}
