package abstraction;

public class MyPlayer implements Sound,Video{
    @Override
    public void playSound() {
        System.out.println("plyaing sound");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video");
    }

    public static void main(String[] args) {
        MyPlayer mp=new MyPlayer();
        mp.playSound();
        mp.playVideo();}
}
