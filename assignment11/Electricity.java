package assignment11;

public class Electricity {

	private int meterNo;
	private String name;
	private String address;

	public int getMeterNo() {
		return meterNo;
	}

	public void setMeterNo(int meterNo) {
		this.meterNo = meterNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return name + " " + address;
	}

	@Override
	public boolean equals(Object obj) {
		Electricity electricity = (Electricity) obj;
		if (getMeterNo() == electricity.meterNo) {
			return true;
		} else
			return false;

	}

}
