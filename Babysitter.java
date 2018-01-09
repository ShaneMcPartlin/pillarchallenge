public class Babysitter {
	private int startTime;
	private int endTime;
	private int bedTime;
	Babysitter(int start, int end, int bed) {
		startTime = (start < 5) ? start + 12 : start;
		endTime = (end < 5) ? end + 12 : end;
		bedTime = (bed < 5) ? bed + 12 : bed;
	}

	public int payout() {
		int pay = 0;
		for (int i=startTime; i<endTime; ++i) {
			if (i < bedTime) {
				pay += 12;
			}
			else if (i >= bedTime) {
				if (i < 12)
					pay += 8;
				else
					pay += 16;
			}
		}
		System.out.println("Total: " + pay);
		return pay;
	}
}