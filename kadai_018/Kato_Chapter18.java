package kadai_018;

abstract public class Kato_Chapter18 {
	
	String familyName = "加藤";
	
	String givenName = "";
	
	String address ="東京都中野区○×";
	
	public void setGivenName() {
		
	}
	
	 public void commonIntroduce() {
		
		 System.out.println("名前は" + this.familyName + this.givenName + "です");
		 System.out.println("住所は"+ this.address +"です");
		 
	}
	
	 abstract void eachIntroduce();
	
	 void execIntroduce() {
		 commonIntroduce ();
		 eachIntroduce();
	 }
	 
	 
}
	


