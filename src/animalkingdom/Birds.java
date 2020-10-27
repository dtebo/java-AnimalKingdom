package animalkingdom;

public class Birds extends Animals {
    public Birds(String name, String yearDiscovered){
        super(name, yearDiscovered);
    }

    @Override
    public void move(){
        System.out.println(super.name + " is flying!");
    }

    @Override
    public void breath(){
        System.out.println(super.name + " is breathing air while flying!");
    }

    @Override
    public void reproduce(){
        System.out.println(super.name + " is laying eggs!");
    }

    @Override
    public String toString(){
        return super.name + " is a bird";
    }
}
