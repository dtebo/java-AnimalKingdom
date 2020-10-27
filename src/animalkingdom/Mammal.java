package animalkingdom;

public class Mammal extends Animal {
    public Mammal(String name, int yearDiscovered){
        super(name, yearDiscovered);
    }

    @Override
    public void move(){
        System.out.println("walk");
    }

    @Override
    public void breath(){
        System.out.println("lungs");
    }

    @Override
    public void reproduce(){
        System.out.println("live births");
    }

//     @Override
//     public String toString(){
//         return super.name + " is a mammal";
//     }
}
