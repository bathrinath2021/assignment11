package assignment11;

public class Test {
	public static void main(String[] args) {
		Electricity electricity = new Electricity();
		electricity.setMeterNo(321);
		electricity.setName("Sekar");
		electricity.setAddress("Mogappair East");
		
		Electricity electricity2 = new Electricity();
		electricity2.setMeterNo(321);
		electricity2.setName("Sekar");
		electricity2.setAddress("Mogappair East");
		
		System.out.println(electricity);
		System.out.println(electricity.equals(electricity2));
	}
}
