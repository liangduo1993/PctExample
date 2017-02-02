/**
 * Created by ERIC_LAI on 2017-02-02.
 */
public class Customer {

    public static int[] cupSizes;

    private enum DrinkType {Water, Beer}
    public enum CupType {Large, Medium, Small, ExtraSmall}
    private String name;
    private int age;
    private int foot;
    private int inch;
    private double height;
    private CupType cup;
    private DrinkType drink;

    public Customer(String name, int age, int foot, int inch) {
        this.name = name;
        this.age = age;
        this.foot = foot;
        this.inch = inch;
        setHeight();
        setDrink();
        setCupType();
    }

    private void setHeight() {
        this.height = foot + (inch / 12.0);
    }

    private void setCupType() {
        int unit = 0;
        if (cupSizes != null) {
            if (height <= 5) {
                int foot = (int) Math.floor(height);
                unit = foot * 10;
            } else {
                int foot = (int) (Math.floor(height) - 5);
                unit = 5 * 10 + foot * 8;
            }
            if (unit <= cupSizes[0]) this.cup = CupType.ExtraSmall;
            else if (unit <= cupSizes[1]) this.cup = CupType.Small;
            else if (unit <= cupSizes[2]) this.cup = CupType.Medium;
            else this.cup = CupType.Large;
        }
    }

    private void setDrink() {
        if (this.age < 18) this.drink = DrinkType.Water;
        else this.drink = DrinkType.Beer;
    }

    public String getName() {
        return name;
    }

    public CupType getCup() {
        return cup;
    }

    public int getAge() {
        return age;
    }

    public int getFoot() {
        return foot;
    }

    public int getInch() {
        return inch;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return this.name + " " + this.drink + " " + this.cup + " " + this.age + " " + this.foot +
                " " + this.inch;
    }

}
