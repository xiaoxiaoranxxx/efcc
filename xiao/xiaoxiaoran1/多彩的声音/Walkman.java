package xiaoxiaoran1.多彩的声音;

public class Walkman implements Soundable {
    @Override
    public void playSound() {
        System.out.println("正在播放歌曲：七里香");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("已降低随身听音量");
    }

    @Override
    public void stopSound() {
        System.out.println("已关闭随身听");
    }
}