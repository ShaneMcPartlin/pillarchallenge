public class Babysitter {
	private int startTime;
	private int endTime;
	Babysitter(int start, int end) {
		startTime = start;
		endTime = end;
	}

	public int payout() {
		return (endTime - startTime) * 12;
	}
}