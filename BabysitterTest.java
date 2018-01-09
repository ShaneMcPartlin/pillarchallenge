public class BabysitterTest {
	
	//Test 1
	public void BabysitterWorksForOneHourBeforeMidnightAndBedtime() {
		Babysitter bs = new Babysitter();
		assertInt(12,bs.payout(),1);
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
	}
}