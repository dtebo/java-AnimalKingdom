package animalkingdom;

public class Fish extends Animal {
    public Fish(String name, int yearDiscovered){
        super(name, yearDiscovered);
    }

    @Override
    public void move(){
        System.out.println("swim");
    }

    @Override
    public void breath(){
        System.out.println("gills");
    }

    @Override
    public void reproduce(){
        System.out.println("eggs");
    }

    // @Override
    // public String toString(){
    //     return super.name + " is a fish";
    // }
}
