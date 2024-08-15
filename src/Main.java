class Hero {
    // Приватные поля
    private int health;
    private int damage;
    private String superPower;

    // Конструктор, задающий все поля
    public Hero(int health, int damage, String superPower) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }

    // Конструктор, задающий только здоровье и урон
    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.superPower = "None"; // Если суперспособность не задана, пусть будет значение по умолчанию
    }

    // Геттеры
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperPower() {
        return superPower;
    }
}

class Boss {
    // Приватные поля
    private int health;
    private int damage;
    private String defenseType;

    // Геттеры и сеттеры
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefenseType() {
        return defenseType;
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр босса
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(150);
        boss.setDefenseType("Magical");

        // Выводим информацию о боссе
        System.out.println("Boss Info:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());

        // Создаем героев и выводим их информацию
        Hero[] heroes = createHeroes();
        System.out.println("\nHeroes Info:");
        for (Hero hero : heroes) {
            System.out.println("Hero: Health = " + hero.getHealth() + ", Damage = " + hero.getDamage() + ", Super Power = " + hero.getSuperPower());
        }
    }

    // Метод для создания массива героев
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(300, 50, "Fireball");
        Hero hero2 = new Hero(250, 40);
        Hero hero3 = new Hero(500, 70, "Invisibility");

        return new Hero[]{hero1, hero2, hero3};
    }
}