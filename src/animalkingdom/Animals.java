package animalkingdom;

public abstract class Animals {
    protected static int maxID = 0;
    protected int id;
    protected int foodAmount = 0;
    protected String name;
    protected String yearDiscovered;

    public Animals(String name, String yearDiscovered){
        maxID++;
        this.id = maxID;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public int getFoodAmount(){
        return this.foodAmount;
    }

    public String getName(){
        return this.name;
    }

    public String getYearDiscovered(){
        return this.yearDiscovered;
    }

    public void setFoodAmount(int amt){
        this.foodAmount = amt;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setYearDiscovered(String yearDiscovered){
        this.yearDiscovered = yearDiscovered;
    }

    public void eat(int amt){
        this.foodAmount += amt;
    }
    
    public void move(){
        System.out.println(this.name + " is moving!");
    }

    public void breath(){
        System.out.println(this.name + " is breathing!");
    }

    public void reproduce(){
        System.out.println(this.name + " is reproducing!");
    }

    @Override
    public String toString(){
        return this.name + " " + this.yearDiscovered;
    }
}
