import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Javastreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ArrayList<String> a=new ArrayList<String>();
		a.add("fuck");
		a.add("suck");
		a.add("suckoo");
		a.add("suckgg");
		a.add("ouckww");
		a.add("Fuckrr");
		*/
		
		
	/*	int g=0;
		for(int i=0;i<a.size();i++)
		{
			String s=a.get(i);
			if(s.startsWith("s"))
			{
				
				g++;
			}
			
		
			
		}
		System.out.println(g);
		*/
		
		//System.out.println(a.stream().filter((s)->s.equalsIgnoreCase("fuck")).count());
		
		//long l=a.stream().filter((s)->s.length()==6).count();
		//System.out.println(l);
		
		//a.stream().filter((s)->s.length()==6).forEach(s->System.out.println(s));
		
		//a.stream().filter(s->s.endsWith("o")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		List<String> names=Arrays.asList("fuck","suck","suckoo","suckgg","ouckww","Fuckrr");
		
		names.stream().filter(s->s.startsWith("s")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
}

	
}
