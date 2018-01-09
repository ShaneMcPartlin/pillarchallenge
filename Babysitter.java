public class Babysitter {
	private int startTime;
	private int endTime;
	private int bedTime;
	Babysitter(int start, int end, int bed) {
		startTime = start;
		endTime = end;
		bedTime = bed;
	}

	public int payout() {
		int pay = 0;
		for (int i=startTime; i<endTime; ++i) {
			if (i<bedTime)
				pay += 12;
			else
				pay += 8;
		}
		return pay;
	}
}