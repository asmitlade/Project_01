class Student{
	int sno;
	String sname;
	String[] course;
	double fee;
	String email;
	long mobile;
	long altMobile;
	Address addr;
	Student(int sno, String sname, String[] course, double fee){
		this.sno = sno;
		this.sname = sname;
		this.course = course;
		this.fee = fee;
	}
	void setSno(int sno){
		this.sno = sno;
	}
	void setSname(String sname){
		this.sname = sname;
	}
	void setCourse(String[] course){
		this.course = course;
	}
	void setFee(double fee){
		this.fee = fee;
	}
	void setEmail(String email){
		this.email = email;
	}
	void setMobile(long mobile){
		this.mobile = mobile;
	}
	void setAltMobile(long altMobile){
		this.altMobile = altMobile;
	}
	void setAddress(Address addr){
		this.addr = addr;		
	}
	int getSno(){
		return this.sno;
	}
	String getSname(){
		return this.sname;
	}
	String[] getCourse(){
		return this.course;
	}
	double getFee(){
		return this.fee;
	}
	String getEmail(){
		return this.email;
	}
	long getMobile(){
		return this.mobile;
	}
	long getAltMobile(){
		return this.altMobile;
	}
	Address getAddress(){
		return this.addr;
	}
	void display(){
		System.out.println("Personal Detail :");
		System.out.println("Sno :"+this.sno);
		System.out.println("Sname :"+this.sname);
		System.out.println("Course :"+java.util.Arrays.toString(this.course));
		System.out.println("Fee :"+this.fee);
		System.out.println("Email :"+this.email);
		System.out.println("Mobile :"+this.mobile);
		System.out.println("Alt Mobile :"+this.altMobile);
		System.out.println("Address Details :");
		if(addr == null){
			System.out.println("Address not given.....");
		}
		else{
			this.addr.display();
		}
		System.out.println("=======================================");
	}
}
