package person;

import account.TTAccount;
import tiny.types.ttperson.Age;
import tiny.types.ttperson.FirstName;
import tiny.types.ttperson.LastName;
import tiny.types.ttperson.MobilePhone;
import tiny.types.ttperson.Phone;

public class TTPerson {

	private FirstName firstName;
	private LastName lastName;
	private Age age;
	private Phone phone;
	private MobilePhone mobilePhone;
	private TTAccount ttAccount;

	public TTPerson(FirstName firstName, LastName lastName, Age age, Phone phone, MobilePhone mobilePhone,
			TTAccount ttAccount) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phone = phone;
		this.mobilePhone = mobilePhone;
		this.ttAccount = ttAccount;
	}

	public FirstName getFirstName() {
		return firstName;
	}

	public void setFirstName(FirstName firstName) {
		this.firstName = firstName;
	}

	public LastName getLastName() {
		return lastName;
	}

	public void setLastName(LastName lastName) {
		this.lastName = lastName;
	}

	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public MobilePhone getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(MobilePhone mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public TTAccount getTtAccount() {
		return ttAccount;
	}

	public void setTtAccount(TTAccount ttAccount) {
		this.ttAccount = ttAccount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((mobilePhone == null) ? 0 : mobilePhone.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((ttAccount == null) ? 0 : ttAccount.hashCode());
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
		TTPerson other = (TTPerson) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mobilePhone == null) {
			if (other.mobilePhone != null)
				return false;
		} else if (!mobilePhone.equals(other.mobilePhone))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (ttAccount == null) {
			if (other.ttAccount != null)
				return false;
		} else if (!ttAccount.equals(other.ttAccount))
			return false;
		return true;
	}
}