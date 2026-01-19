package assignments;

public class NetProfit {

	int numberOfBeetsSold;//2
	int costPricePerBeet;//3
	int sellingPricePerBeet;//4
	
	//Profit() - returns the net profit (returns a negative integer if there is a loss)
	public int NetProfit() {
		int netprofit;
		netprofit = (sellingPricePerBeet - costPricePerBeet) * numberOfBeetsSold;
		return netprofit;
	}
	
	
	public NetProfit(int numberOfBeetsSold,int costPricePerBeet,int sellingPricePerBeet) {
		this.numberOfBeetsSold=numberOfBeetsSold;
		this.costPricePerBeet=costPricePerBeet;
		this.sellingPricePerBeet=sellingPricePerBeet;
	}
	public static void main(String[] args) {
		NetProfit np = new NetProfit(12,13,4);
		System.out.println("Net Profit is: " + np.NetProfit());

	}

}
