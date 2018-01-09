public class BabysitterTest {
	
	//Test 1
	public void BabysitterWorksForOneHourBeforeMidnightAndBedtime() {
		Babysitter bs = new Babysitter(5,6,9);
		assertInt(12,bs.payout(),1);
	}

	//Test 2
	public void BabysitterWorksForMutipleHoursBeforeMidnightAndBedtime() {
		Babysitter bs = new Babysitter(5,8,9);
		assertInt(36,bs.payout(),2);
	}

	//Test 3
	public void BabysitterWorksForMultipleHoursWithBedtimeInTheMiddle() {
		Babysitter bs = new Babysitter(5,10,9);
		assertInt(56, bs.payout(),3);
	}

	//custom assert function
	public void assertInt(int a, int b, int testIndex) {
		if (a != b)
			System.out.println("Test case at index "+testIndex+" failed!");
		else
			System.out.println("Test case at index "+testIndex+" passed!");
	}

	public static void main(String [] args) {
		BabysitterTest bst = new BabysitterTest();
		bst.BabysitterWorksForOneHourBeforeMidnightAndBedtime();
		bst.BabysitterWorksForMutipleHoursBeforeMidnightAndBedtime();
		bst.BabysitterWorksForMultipleHoursWithBedtimeInTheMiddle();
	}
}