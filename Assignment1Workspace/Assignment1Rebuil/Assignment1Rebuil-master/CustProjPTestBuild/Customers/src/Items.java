import java.io.Serializable;

public class Items implements Serializable {
	private static final long serialVersionUID2 = 7526472295622776147L;
	 private Long id2;
	 private static Long COUNTER2 = 0L;
	private String Items;
	
	public Items(){
		Items= new String("");
		id2 = generateId2();
	}
	
	public Items(String Items2){
		Items=Items2;
		id2 = generateId2();
		
	}
		public Items(Long id2, String Items2){
			Items=Items2;
			this.id2 = id2;
		}
		
		public Long getId2() {
			return id2;
		}

	
		public void SetId2(Long id2) {
			this.id2=id2;
		}
		
		public String getItems() {
			return Items;
		}
		public void setItems(String Items) {
			this.Items= Items;
		}
		
		
		public Long generateId2(){
			return COUNTER2++;
		}
		
		
	}


