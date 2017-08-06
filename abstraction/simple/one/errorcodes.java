package oops.abstraction.simple.one;

import java.util.HashMap;


public class errorcodes {
	public void setcode(int a)
	{
		HashMap<Integer,String> c=new HashMap<>();
		c.put(100 ,"Continue");
		c.put(101 ,"Switching Protocols");
		c.put(200 ,	"OK");
		c.put(201,"Created");
		c.put(202 ,"Accepted");
		c.put(203 ,"Non-authoritative Information");
		c.put(204 ,"No Content");
		c.put(205 ,"Reset Content");
		c.put(206 ,"Partial Content");
		c.put(207 ," Multi-Status" );
		c.put(208,"already reported");
		c.put(226,"IM used");
		c.put(302, "Found");
		c.put(300, "Multiple Choices");
		c.put(301, "Moved Permanently");
		c.put(303, "see other");
		c.put(304, "not modified");
		c.put(305, "use proxy");
		c.put(306, "switch proxy");
		c.put(307, "temporary redirect");
		c.put(308,"permanent redirect");
		System.out.println(c.get(a));
	

	}
}
