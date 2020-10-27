package animalkingdom;

public class Fish extends Animals {
    public Fish(String name, String yearDiscovered){
        super(name, yearDiscovered);
    }

    @Override
    public void move(){
        System.out.println(super.name + " is swimming!");
    }

    @Override
    public void breath(){
        System.out.println(super.name + " is breathing under the water!");
    }

    @Override
    public void reproduce(){
        System.out.println(super.name + " is laying eggs under water!");
    }

    @Override
    public String toString(){
        return super.name + " is a fish";
    }
}
