package xiaoxiaoran1.多彩的声音;

public class Radio implements Soundable{
    @Override
    public void playSound() {
        System.out.println("收音机播放广播：第八套小学生广播体操");
    }
    @Override
    public void decreaseVolume() {
        System.out.println("已降低收音机音量。");
    }

    @Override
    public void stopSound() {
        System.out.println("已关闭收音机。");
    }
}