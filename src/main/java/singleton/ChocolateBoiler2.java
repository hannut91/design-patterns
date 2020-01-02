package singleton;

public class ChocolateBoiler2 {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler2 uniqueInstance;

    private ChocolateBoiler2() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler2 getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler2();
        }

        return uniqueInstance;
    }

    public void fill() {
        if (empty) {
            empty = false;
            boiled = false;
        }
    }

    public void boil() {
        if (!empty && !boiled) {
            boiled = true;
        }
    }

    public void drain() {
        if (!empty && boiled) {
            empty = true;
        }
    }
}
