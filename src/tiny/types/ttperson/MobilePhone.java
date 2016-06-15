package tiny.types.ttperson;

final public class MobilePhone {
	final private int mobilePhone;

	public MobilePhone(int mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public int getMobilePhone() {
		return mobilePhone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mobilePhone;
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
		MobilePhone other = (MobilePhone) obj;
		if (mobilePhone != other.mobilePhone)
			return false;
		return true;
	}
}