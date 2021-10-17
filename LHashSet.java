import java.util.LinkedHashSet;
public class LHashSet{
     public static void main (String [] args){
		 LinkedHashSet hs = new LinkedHashSet();
		 hs.add("Java ");
		 hs.add("Angular");
		 hs.add("ReactJS ");
		 hs.add("JavaScript ");
		 hs.add("Python");
		 System.out.println(hs.hashCode());
		 for (Object object: hs){
			 System.out.println(object);
		 }

	 
	 }
}