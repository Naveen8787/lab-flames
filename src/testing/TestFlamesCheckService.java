package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import service.FlamesCheckService;

public class TestFlamesCheckService {
	FlamesCheckService fcs = new FlamesCheckService();
	@Test
	public void testFindFlamesMethod() {
		
		String name1 = "nani";
		String name2 = "ammu";
		char temp = 'm';
		assertEquals(temp,fcs.findFlames(name1, name2));
		
		name1 = "Naveen";
		name2 = "Divya";
		temp = 'e';		assertEquals(temp,fcs.findFlames(name1, name2));
		
		name1 = "Varsha";
		name2 = "Naveen";
		temp = 'a';
		assertEquals(temp,fcs.findFlames(name1, name2));
		
		name1 = "Naveen";
		name2 = "Shiri";
	     temp = 'm';
		assertEquals(temp,fcs.findFlames(name1, name2));
		
		name1 = "Sai prasad";
		name2 = "Laddu";
		temp = 'l';
		assertEquals(temp,fcs.findFlames(name1, name2));
		
		name1 = "acxdgjikz";
		name2 = "b";
		temp = 'l';
		assertEquals(temp,fcs.findFlames(name1, name2));
		
		try {
			fcs.findFlames(null, null);
			fcs.findFlames("AAA", null);
			fcs.findFlames(null, "BBB");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
