
public class Store {

	
	
	public String manager;
	public int numberOfWorkers;
	public String department;
	public int aisle;
	public int section;
	public int itemBarcode;
		
		
	public Store(String manager, int numberOfWorkers, String department,  int section, int aisle, int itemBarcode) 
	{
		this.manager = manager;
		this.numberOfWorkers = numberOfWorkers;
		this.department = department;
		this.aisle = aisle;
		this.section = section;
		this.itemBarcode = itemBarcode;
		
	}
	
	




	public String getmanager() {		return manager; 	}
	public int getnumberOfWorkers() { 		return numberOfWorkers;	}
	public String getdepartment() {	return department;	}
	public int getaisle() {		return aisle;	}
	public int getsection() {		return section;	}
	public int getitemBarcode() {		return itemBarcode; }
	
	
	
	
	
}
