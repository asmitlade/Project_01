class College{
	public static void main(String[] args){
	Student s1 = new Student(101,"Asmit",new String[]{"Core Java","Adv. Java"},1000); 
	s1.display();
	s1.setEmail("asmitlade.system@gmail.com");
	s1.setMobile(9049166535L);
	s1.setAltMobile(9082289635L);
	Address addr = new Address();
	addr.setStrNumber(1);
	addr.setAptName("CDAC Building");
	addr.setCity("Ameerpet-Hyderabad");
	addr.setPinCode(500062);
	s1.setAddress(addr);
	s1.display();
	//Changing Address value
	//1. retriving Address object rom s1
	Address oldAddrObj = s1.getAddress();
	//2.changing strNumber and aptName values
	oldAddrObj.setStrNumber(2);
	oldAddrObj.setAptName("Reliance Building");
	s1.display();
	}
}
