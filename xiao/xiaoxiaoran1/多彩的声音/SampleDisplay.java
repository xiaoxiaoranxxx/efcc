package xiaoxiaoran1.多彩的声音;

import java.util.Scanner;

public class SampleDisplay {
	public void display(Soundable soundable) {
		soundable.playSound();
		System.out.println("您是否要降低音量？");
		System.out.println("1-是  2-否");
		Scanner in = new Scanner(System.in);
		if (in.nextLine().equals("1")) {
			soundable.decreaseVolume();
		}
		System.out.println("您是否要关机？");
		System.out.println("1-是  2-否");
		Scanner ins = new Scanner(System.in);
		if (ins.nextLine().equals("1")) {
			soundable.stopSound();
		}
		in.close();
		ins.close();

	}
}
