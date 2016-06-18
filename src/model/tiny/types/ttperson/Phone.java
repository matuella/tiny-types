package model.tiny.types.ttperson;

final public class Phone {
	final private int phone;

	public Phone(int phone) {
		this.phone = phone;
	}

	public int getPhone() {
		return phone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + phone;
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
		Phone other = (Phone) obj;
		if (phone != other.phone)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Phone [phone=" + phone + "]";
	}
}