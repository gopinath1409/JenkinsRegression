import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class sample {
	public static void main(String[] args) throws IOException, ParseException {
		JSONParser p = new JSONParser();
		FileReader reader = new FileReader("C:\\Users\\GOPINATH-PC\\eclipse-workspace\\APITesting\\src\\test\\resources\\Travel\\travel.json");
		Object o = p.parse(reader);
		
		
		JSONObject j = (JSONObject) o;
		Object V1 = j.get("page");
		System.out.println(V1);
		Object V2 = j.get("per_page");
		System.out.println(V2);
		Object V3 = j.get("total");
		System.out.println(V3);
		Object V4 = j.get("total_pages");
		System.out.println(V4);
		
		Object V5 = j.get("data");
		JSONArray a1 = (JSONArray)V5;
		Object V6 = a1.get(0);
		JSONObject j1 = (JSONObject) V6;
		Object V7 = j1.get("id");
		System.out.println(V7);
		Object V8 = j1.get("email");
		System.out.println(V8);		
		Object V9 = j1.get("first_name");
		System.out.println(V9);
		Object V10 = j1.get("last_name");
		System.out.println(V10);
		Object V11 = j1.get("avatar");
		System.out.println(V11);
		
		Object V12 = j.get("data");
		JSONArray a2 = (JSONArray)V12;
		Object V13 = a2.get(1);		
		JSONObject j2 = (JSONObject) V13;
		Object V14 = j2.get("id");
		System.out.println(V14);
		Object V15 = j2.get("email");
		System.out.println(V15);		
		Object V16 = j2.get("first_name");
		System.out.println(V16);
		Object V17 = j2.get("last_name");
		System.out.println(V17);
		Object V18 = j2.get("avatar");
		System.out.println(V18);
		
		Object V19 = j.get("data");
		JSONArray a3 = (JSONArray)V19;
		Object V20 = a3.get(2);		
		JSONObject j3 = (JSONObject) V20;
		Object V21 = j3.get("id");
		System.out.println(V21);
		Object V22 = j3.get("email");
		System.out.println(V22);		
		Object V23 = j3.get("first_name");
		System.out.println(V23);
		Object V24 = j3.get("last_name");
		System.out.println(V24);
		Object V25 = j3.get("avatar");
		System.out.println(V25);
		
		Object V26 = j.get("data");
		JSONArray a4 = (JSONArray)V26;
		Object V27 = a4.get(3);		
		JSONObject j4 = (JSONObject) V27;
		Object V28 = j4.get("id");
		System.out.println(V28);
		Object V29 = j4.get("email");
		System.out.println(V29);		
		Object V30 = j4.get("first_name");
		System.out.println(V30);
		Object V31 = j4.get("last_name");
		System.out.println(V31);
		Object V32 = j4.get("avatar");
		System.out.println(V32);
		
		Object V33 = j.get("data");
		JSONArray a5 = (JSONArray)V33;
		Object V34 = a5.get(4);		
		JSONObject j5 = (JSONObject) V34;
		Object V35 = j5.get("id");
		System.out.println(V35);
		Object V36 = j5.get("email");
		System.out.println(V36);		
		Object V37 = j5.get("first_name");
		System.out.println(V37);
		Object V38 = j5.get("last_name");
		System.out.println(V38);
		Object V39 = j5.get("avatar");
		System.out.println(V39);
		
		Object V40 = j.get("data");
		JSONArray a6 = (JSONArray)V40;
		Object V41 = a6.get(5);		
		JSONObject j6 = (JSONObject) V41;
		Object V42 = j6.get("id");
		System.out.println(V42);
		Object V43 = j6.get("email");
		System.out.println(V43);		
		Object V44 = j6.get("first_name");
		System.out.println(V44);
		Object V45 = j6.get("last_name");
		System.out.println(V45);
		Object V46 = j6.get("avatar");
		System.out.println(V46);
		
		Object V47 = j.get("ad");
		
		JSONObject j7 = (JSONObject) V47;
		Object V48 = j7.get("company");
		System.out.println(V48);
		Object V49 = j7.get("url");
		System.out.println(V49);
		Object V50 = j7.get("text");
		System.out.println(V50);
		
		
		
		
	}

}
