package animalkingdom;

public class Mammals extends Animals {
    public Mammals(String name, String yearDiscovered){
        super(name, yearDiscovered);
    }

    @Override
    public void move(){
        System.out.println(super.name + " is Walking!");
    }

    @Override
    public void breath(){
        System.out.println(super.name + " is Breathing Air!");
    }

    @Override
    public void reproduce(){
        System.out.println(super.name + " is Giving Birth!");
    }

    @Override
    public String toString(){
        return super.name + " " + super.foodAmount;
    }
}
