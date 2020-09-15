import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class employee {
	public static void main(String[] args) {
	List<LinkedHashMap<String, String>> emp = new ArrayList<LinkedHashMap<String, String>>();
	
	LinkedHashMap<String, String> m1 = new LinkedHashMap<String, String>();
	m1.put("Name", "Gopi");
	m1.put("email", "Gopi@gmail.com");
	m1.put("course", "Java");
	
	LinkedHashMap<String, String> m2 = new LinkedHashMap<String, String>();
	m2.put("Name", "Ram");
	m2.put("email", "Ram@gmail.com");
	m2.put("course", "Selenium");
	
	LinkedHashMap<String, String> m3 = new LinkedHashMap<String, String>();
	m3.put("Name", "Mani");
	m3.put("email", "mani@gmail.com");
	m3.put("course", "python");
	
	LinkedHashMap<String, String> m4 = new LinkedHashMap<String, String>();
	m4.put("Name", "Ravi");
	m4.put("email", "Ravi@gmail.com");
	m4.put("course", "Rest Assured");
	
	emp.add(m1);
	emp.add(m2);
	emp.add(m3);
	emp.add(m4);
	
	LinkedHashMap<String, String> e = emp.get(3);
	String s = e.get("course");
	System.out.println(s);
	}

}

