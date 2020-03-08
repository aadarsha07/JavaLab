interface gamers{
	public String setName();
}

class interfaceDemo implements gamers{
	String name;
	public String setName(){
		name = "Chocotaco";
		return name;
	}

	public static void main(String[] args){
		interfaceDemo iD1 = new interfaceDemo();
		System.out.println(iD1.setName());
	}
}