package OOPS;

class SoundSystem{
    public void playsound(){
        System.out.println("Making sound Good");
    }
}
class cat extends SoundSystem{
    @Override
    public void playsound(){
        System.out.println("Mewo");
    }
}
class dog extends SoundSystem{
    @Override
    public void playsound(){
        System.out.println("Barking");
    }
}
public class polymorphisum {
    public static void main(String[] args) {
        SoundSystem mycat = new cat();
        SoundSystem dog = new dog();
        mycat.playsound();
        dog.playsound();

    }
}
