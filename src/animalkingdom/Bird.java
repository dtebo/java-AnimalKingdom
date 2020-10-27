package animalkingdom;

public class Bird extends Animal {
    public Bird(String name, String yearDiscovered){
        super(name, yearDiscovered);
    }

    @Override
    public void move(){
        System.out.println("fly");
    }

    @Override
    public void breath(){
        System.out.println("lungs");
    }

    @Override
    public void reproduce(){
        System.out.println("eggs");
    }

    // @Override
    // public String toString(){
    //     return super.name + " is a bird";
    // }
}
