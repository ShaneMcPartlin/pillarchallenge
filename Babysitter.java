public class Babysitter {

	//initialize and assign key times
	private int startTime;
	private int endTime;
	private int bedTime;
	Babysitter(int start, int end, int bed) {

		//"if the time is in the AM, add 12 to it for simple iteration"
		startTime = (start < 5) ? start + 12 : start;
		endTime = (end < 5) ? end + 12 : end;
		bedTime = (bed < 5) ? bed + 12 : bed;
	}

	public int payout() {
		int pay = 0;

		//add appropriate hourly wage based on key times
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
		return pay;
	}
}