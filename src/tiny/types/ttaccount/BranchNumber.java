package tiny.types.ttaccount;

final public class BranchNumber {
	final private int branchNumber;

	public BranchNumber(int branchNumber) {
		this.branchNumber = branchNumber;
	}

	public int getBranchNumber() {
		return branchNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + branchNumber;
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
		BranchNumber other = (BranchNumber) obj;
		if (branchNumber != other.branchNumber)
			return false;
		return true;
	}
}