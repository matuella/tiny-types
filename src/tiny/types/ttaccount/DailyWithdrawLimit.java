package tiny.types.ttaccount;

final public class DailyWithdrawLimit {
	final private double dailyWithdrawLimit;

	public DailyWithdrawLimit(double dailyWithdrawLimit) {
		this.dailyWithdrawLimit = dailyWithdrawLimit;
	}

	public double getDailyWithdrawLimit() {
		return dailyWithdrawLimit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(dailyWithdrawLimit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DailyWithdrawLimit other = (DailyWithdrawLimit) obj;
		if (Double.doubleToLongBits(dailyWithdrawLimit) != Double.doubleToLongBits(other.dailyWithdrawLimit))
			return false;
		return true;
	}
}