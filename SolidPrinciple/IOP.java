package SolidPrinciple;    // interface segregation principle

interface Callable{
  void call();
}

interface MusicPlayble{
  void PlayMusic();
}
interface CamerSuported{
  void takecamera();
}

class SmartPhone implements Callable, MusicPlayble, CamerSuported{
  public void call(){
    System.out.println("smart phone calling....");
  }

  public void PlayMusic(){
    System.out.println("smartphone psly music");

  }

  public void takecamera(){
    System.out.println("smartphone take photo");

  }
}

class SmartWatch implements Callable, MusicPlayble{
  public void call(){
    System.out.println("smartwatch calling...");
  }
  public void PlayMusic(){
    System.out.println("smartwatch paly music....");
  }

}

class MusicSpeaker implements MusicPlayble {
  public void PlayMusic(){
    System.out.println(" speaker play music ...");
  }
}
public class IOP {
  public static void main(String[] args) {
    SmartPhone p = new SmartPhone();
    p.call();
    p.PlayMusic();
    p.takecamera();

    SmartWatch w = new SmartWatch();
    w.call();
    w.PlayMusic();

    MusicSpeaker s = new MusicSpeaker();
    s.PlayMusic();

  }
}
