package edu.sjsu.cmpe282.domain;

public class UserInfo {

	private int userinfoId;
	private String address;
	private String aptNo;
	private String city;
	private String state;
	private String zipCode;

	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserinfoId() {
		return userinfoId;
	}

	public void setUserinfoId(int userinfoId) {
		this.userinfoId = userinfoId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAptNo() {
		return aptNo;
	}

	public void setAptNo(String aptNo) {
		this.aptNo = aptNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "UserInfo [userinfoId=" + userinfoId + ", address=" + address
				+ ", aptNo=" + aptNo + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + "]";
	}

	
	
}
