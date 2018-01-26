import java.util.Timer;
import java.util.TimerTask;

public class DigitalClock1 extends MyTime implements NewInterface {
	
	public static void main(String[] args) {
		final DigitalClock1 dc1 = new DigitalClock1();
		Timer clock = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				dc1.display();
			}
		};
		dc1.display();
		clock.scheduleAtFixedRate(tt, 1000, 1000);
	}


	public void first() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("first() is not finished");
	}


	public String second(int x) {
		// TODO Auto-generated method stub
		return null;
	}

	public void display() {
		// TODO Auto-generated method stub
		String dt = MyTime.getDate();
		String tm = MyTime.getTime();
		String time = dt + " ~ " + tm;
		System.out.println(time);
	}
}
