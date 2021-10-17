import java.util.HashSet;
public class HASHSET{
     public static void main (String [] args){
		 HashSet hs = new HashSet();
		 hs.add("Java ");
		 hs.add("Angular");
		 hs.add("ReactJS ");
		 hs.add("JavaScript ");
		 hs.add("Python");
		 for (Object object: hs){
			 System.out.println(object);
		 }

	 
	 }
}