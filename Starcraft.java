package Prac;

public class Starcraft {
	  public static void main (String[] args) {
	    
	    Marin marin = new Marin("·¹ÀÌ³Ê", 80);     
	    Medic medic = new Medic("¸ð¶ö·¹½º", 60, 60);
	 
	    marin.stimpack();
	    medic.heal(marin);
	  }
}
	    
 class Marin{
	    
	 int hp;
	 String name;
	      
	 Marin(String n, int h){
	    name = n;
	    hp = h;
	 }
	      
	 public void stimpack(){
	    System.out.printf(name+ "ÀÇ ½ºÆÀÆÑ!!   hp: " + hp + " -> ");
	    hp -= 10;
	    System.out.println(hp);

	 }
	 
	 
	    
}
	    
 class Medic{
	  int hp;
	  int mp;
	  String name;
	      
	  Medic(String n,  int h, int m){
	      name = n;
	      hp = h;
	      mp = m;
	   }
	      
	   public void heal(Marin target){
	      System.out.printf(name + "ÀÇ Ä¡À¯!! ==> " +name +"( "+ target.hp + " ->" + ")");
	      target.hp += 10;
	      System.out.println(target.hp);

	   }	      
}
	    // °´Ã¼ »ý¼º
	    // ¸¶¸°ÀÇ ½ºÆÀÆÑ!
	    // ¸ÞµñÀÇ Èú!
	  
