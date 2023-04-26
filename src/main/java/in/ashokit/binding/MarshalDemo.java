package in.ashokit.binding;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class MarshalDemo {
	
	public static void main(String[] args) throws Exception {
		
		Customer c = new Customer();
		c.setId(101);
		c.setName("Hitesh");
		c.setEmail("appu@gmail.com");
		c.setPhno(1431431431);
		
		JAXBContext context = JAXBContext.newInstance(Customer.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(c,new File("Customer.xml"));
		System.out.println("xml is created");
	}

}
