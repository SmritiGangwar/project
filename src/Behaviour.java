import java.lang.Math;
abstract class Instrument {
    abstract void play();
}
class Piano extends Instrument{
    void play(){
        System.out.println("Piano is playing tan tan tan");
    }
}
class Guitar extends Instrument{
    void play(){
        System.out.println("Guitar is playing tin tin tin");
    }
}
class Flute extends Instrument{
    void play(){
        System.out.println("Flute is playing toot toot toot");
    }
}
public class Behaviour {
    public static void main(String[] args) {

        Instrument obj2 = new Piano();
        Instrument obj3 = new Flute();
        Instrument obj4 = new Guitar();
        Instrument[] arr = new Instrument[10];
        int min=1;
        int max=10;
        int range=max-min+1;
        for(int i=0;i<10;i++){
            int r = (int)((Math.random()*range)+min);
            switch (r){
                case 1:
                    obj2.play();
                    System.out.println("At index "+i);
                    break;
                case 2:
                    obj3.play();
                    System.out.println("At index "+i);
                    break;
                case 3:
                    obj4.play();
                    System.out.println("At index "+i);
                    break;
            }
        }


    }


}