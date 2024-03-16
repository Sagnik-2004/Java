interface Player{
    void play();
}
class Child implements Player{
    public void play(){
        System.out.println("Child plays Football");
    }
}
class Actor implements Player{
    public void play(){
        System.out.println("Actor plays Character");
    }
}
class Musician implements Player{
    public void play(){
        System.out.println("Musician plays Guiter");
    }
}
public class Demonstrate{
    public static void main(String args[]){
        Child ch = new Child();
        Actor ac = new Actor();
        Musician mc = new Musician();
        System.out.println("Showing Child : ");
        ch.play();
        System.out.println("Showing Actor : ");
        ac.play();
        System.out.println("Showing Musician : ");
        mc.play();
    }
}