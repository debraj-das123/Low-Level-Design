package DesignPattern.DecoratorPattern;
// interface 

interface MusicPlayer{
  String getDescription();
  int getCost();
}
class BasicPlayer implements MusicPlayer{
  public String  getDescription(){
    return "music play";
  }

  public int getCost(){
    return 300;
  }
}

abstract class MusicPlayerDecorator implements MusicPlayer{
  protected MusicPlayer musicplayer;

  public MusicPlayerDecorator(MusicPlayer musicPlayer){
    this.musicplayer = musicPlayer;
  }

}

class BaseBoostMusic extends MusicPlayerDecorator{
  public BaseBoostMusic(MusicPlayer musicPlayer){
    super(musicPlayer);
  }

  public String getDescription(){
    return musicplayer.getDescription() + " +base boost add";
  }

  public int getCost(){
    return musicplayer.getCost() + 100;
  }
}

class SurrooundMusic extends MusicPlayerDecorator{
  public SurrooundMusic(MusicPlayer musicPlayer){
    super(musicPlayer);
  }

  public String getDescription(){
    return musicplayer.getDescription() + " + surround soound  add";
  }

  public int getCost(){
    return musicplayer.getCost() + 300;
  }
}

class NoiseMusic extends MusicPlayerDecorator{
  public NoiseMusic(MusicPlayer musicPlayer){
    super(musicPlayer);
  }

  public String getDescription(){
    return musicplayer.getDescription() + " + noise less add";
  }

  public int getCost(){
    return musicplayer.getCost() + 70;
  }
}
public class DecoratorPattern2 {
  public static void main(String[] args) {
    MusicPlayer m = new BasicPlayer();

    // add features
    m = new BaseBoostMusic(m);
    m = new SurrooundMusic(m);
    m = new NoiseMusic(m);
    System.out.println(m.getDescription());
    System.out.println("Total cost of music :" + m.getCost());
  }
}
