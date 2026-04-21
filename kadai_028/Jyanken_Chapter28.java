package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	HashMap<String,String> jyanken = new HashMap<String,String>();
	
	public Jyanken_Chapter28() {
	
	
	jyanken.put("r","グー");
	jyanken.put("s","チョキ");
	jyanken.put("p","パー");
	
	
	}
	
	
	
	  public String getMyChoice() {
		  
		  
		  System.out.println("自分のじゃんけんの手を入力しましょう");
		  System.out.println("グーはrockのrを入力しましょう");
		  System.out.println("チョキはscissorsのsを入力しましょう");
		  System.out.println("パーはpaperのpを入力しましょう");
		  
		  Scanner scanner = new Scanner(System.in);
		  

		  
		  String jibun= scanner.next();
		  
		  
		  
		  if(jibun.equals("s") || jibun.equals("r") || jibun.equals("p")){
			  
			  return jibun;
			  
		  } else {
			  
			  System.out.println("不正な入力です");
			  
		  }
		
		  scanner.close();
		  
		  return jibun;
				  
		  
		  
		  
		
	}
	
	  public String getRandom(){
		  
		  int number = (int) (Math.floor(Math.random()*3));
		  
		  String aite = switch (number) {
		  case 0 ->"r";
		  case 1 ->"s";
		  case 2 ->"p";
		  default ->"エラー";
		  };
		  
		  return aite;
	
	}
	
	  
	  public void playGame() {
		  
		  String jibun =getMyChoice();
		  String aite =getRandom();
		  
		  
		  
		  if((jibun.equals(aite))) {
			  System.out.println("自分の手は"+ jyanken.get(jibun) + "相手の手は" + jyanken.get(aite));
			  System.out.println("あいこです");
			  
		  } else if (jibun.equals("r") && aite.equals("s") ) {
			  
			  System.out.println("自分の手は"+ jyanken.get(jibun) + "相手の手は" + jyanken.get(aite));
			  System.out.println("自分の勝ちです");
			  
		  } else if (jibun.equals("r") && aite.equals("p") ) {
			  
			  System.out.println("自分の手は"+ jyanken.get(jibun) + "相手の手は" + jyanken.get(aite));
			  System.out.println("自分の負けです");
			  
		  } else if (jibun.equals("s") && aite.equals("r") ) {
			  
			  System.out.println("自分の手は"+ jyanken.get(jibun) + "相手の手は" + jyanken.get(aite));
			  System.out.println("自分の負けです");
			  
		  } else if(jibun.equals("s") && aite.equals("p") ) {
			  
			  System.out.println("自分の手は"+ jyanken.get(jibun) + "相手の手は" + jyanken.get(aite));
			  System.out.println("自分の勝ちです");
			  
		  } else if(jibun.equals("p") && aite.equals("r") ) {
			  
		  
			  System.out.println("自分の手は"+ jyanken.get(jibun) + "相手の手は" + jyanken.get(aite));
			  System.out.println("自分の勝ちです");
			  
		  } else if(jibun.equals("p") && aite.equals("s") ) {
			  
			  System.out.println("自分の手は"+ jyanken.get(jibun) + "相手の手は" + jyanken.get(aite));
			  System.out.println("自分の負けです");
	}	
}
		  
}



	

	 

