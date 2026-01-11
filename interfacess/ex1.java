interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

// Class implementing multiple interfaces
class SmartPhone implements Camera, MusicPlayer {

    public void takePhoto() {
        System.out.println("Photo clicked");
    }

    public void playMusic() {
        System.out.println("Music playing");
    }
}

public class ex1 {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.takePhoto();
        s.playMusic();
    }
}
