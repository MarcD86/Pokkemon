public abstract class Pokemon {

    private String name;
    private int level;
    private int hp;
    private String type;

    private String sound;

    private String food;

    public Pokemon(String name, int level, int hp, String type, String sound, String food) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.type = type;
        this.sound = sound;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public abstract void eat(String food);

    public abstract void speaks();








}
