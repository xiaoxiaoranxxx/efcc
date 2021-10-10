package xiaoxiaoran1.多彩的声音;

public class MobilePhone implements Soundable {
    @Override
    public void playSound() {
        System.out.println("手机发出来电铃声：叮当 、 叮当");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("已降低手机音量");
    }

    @Override
    public void stopSound() {
        System.out.println("已关闭手机");
    }
}