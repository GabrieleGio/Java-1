package package1;

import java.util.LinkedList;
import java.util.Locale;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main  {
	public static void main(String[] args) {
	//Con questo statement indicate il locale da utilizzare
		Locale.setDefault(Locale.US);
		
	Persona p1 = new Persona(1L,"iris",false,45000.0);
	
	String jsonp = """
			{"id":1, "nome":"iris", "femmina":false, "stipendio":45000.0
			""";
	
	System.out.println(p1.SerializeJson());
	
	String serializzata = p1.SerializeJson();
	
	Persona pdeserializzata = p1.DeserializeJson(serializzata);
	System.out.println(pdeserializzata);
	System.exit(0);
	
	LinkedList<Persona> lp = new LinkedList<Persona>();
	lp.add(p1);
	lp.add(new Persona(2L, "Aldo",true,90000.0));
	
	ObjectMapper objectMapper = new ObjectMapper();
	String slp = "";
	try {
		slp = objectMapper.writeValueAsString(lp);
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(slp);
	
	//E ora la ritrasformiamo in lista
	try {
	var lp1 = objectMapper.readValue(slp, new LinkedList<Persona>().getClass());
	System.out.println(lp1);
	} catch (JsonMappingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
