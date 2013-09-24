package app.macro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import app.common.CommonConstants;
import app.macro.framework.MacroBase;

public class CreateMacro extends MacroBase {

	private int rojinaX, rojinaY;
	private int basyaX, basyaY;
	private int renkinX, renkinY;
	private int item1X, item1Y;
	private int item2X, item2Y;
	private int skipX, skipY;

	public CreateMacro(){

	}

	public void init(int item) {
		try {
			System.out.println("初期化中...");
			robot = new Robot();
			this.item = item;
			this.rojinaX = 945;
			this.rojinaY = 380;
			this.basyaX = 525;
			this.basyaY = 160;
			this.renkinX = 570;
			this.renkinY = 255;
			this.skipX = 975;
			this.skipY = 635;

			switch(item){
			case CommonConstants.JOU_YAKUSOU:
				this.item1X = 700;
				this.item1Y = 270;
				this.item2X = this.item1X;
				this.item2Y = this.item1Y;
				break;
			case CommonConstants.TOKU_YAKUSOU:
				this.item1X = 700;
				this.item1Y = 300;
				this.item2X = this.item1X;
				this.item2Y = this.item1Y;
				break;
			default:
				break;
			}
			System.out.println("初期化完了");
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public void start() {
		try {
			System.out.println("処理開始");
			// 画面切り替え用待ち時間
			waitTime(5000);

			clickMouse(this.renkinX, this.renkinY);

			// 画面切り替え用待ち時間 (馬車⇒錬金ボックス)
			waitTime(8000);

			for(int i = 0; i < 49; i++){
				// 錬金アイテム連打
				renda(this.item1X, this.item1Y, 60);
				// スキップからの「はい」連打
				renda(this.skipX, this.skipY, 60);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void end() {
		// 今は何もしない
		return;
	}


	private void waitTime(int ms) throws Exception{
		System.out.println("待機"+ms+"ms");
		robot.delay(ms);
		System.out.println("待機完了");
	}

	private void clickMouse(int x, int y) throws Exception{
		System.out.println("クリック("+x+", "+y+")");
		robot.mouseMove(x, y);
		robot.delay(50);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.delay(50);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}

	private void renda(int x, int y, int times) throws Exception{
		System.out.println("連打("+x+", "+y+") "+times+"回");
		robot.mouseMove(x, y);
		for(int i = 0; i < times; i++){
			robot.delay(25);
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.delay(25);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
		}
	}
}
