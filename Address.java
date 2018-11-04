class Address{
	int strNumber;
	String aptName;
	String city;
	int pinCode;
	Address(){
		this.strNumber = strNumber;
		this.aptName = aptName;
		this.city = city;
		this.pinCode = pinCode;
	}
	void setStrNumber(int strNumber){
		this.strNumber = strNumber;
	}
	void setAptName(String aptName){
		this.aptName = aptName;
	}
	void setCity(String city){
		this.city = city;
	}
	void setPinCode(int pinCode){
		this.pinCode = pinCode;
	}
	int getStrNumber(){
		return this.strNumber;
	}
	String getAptName(){
		return this.aptName;
	}
	String getCity(){
		return this.city;
	}
	int getPinCode(){
		return this.pinCode;
	}
	void display(){
		System.out.println("StrNumber :"+this.strNumber);
		System.out.println("AptName :"+this.aptName);
		System.out.println("City :"+this.city);
		System.out.println("PinCode :"+this.pinCode);
	}
}