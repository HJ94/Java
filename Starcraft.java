package Prac;

public class Starcraft {
	  public static void main (String[] args) {
	    
	    Marin marin = new Marin("���̳�", 80);     
	    Medic medic = new Medic("�������", 60, 60);
	 
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
	    System.out.printf(name+ "�� ������!!   hp: " + hp + " -> ");
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
	      System.out.printf(name + "�� ġ��!! ==> " +name +"( "+ target.hp + " ->" + ")");
	      target.hp += 10;
	      System.out.println(target.hp);

	   }	      
}
	    // ��ü ����
	    // ������ ������!
	    // �޵��� ��!
	  
