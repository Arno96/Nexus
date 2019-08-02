package p;
import java.util.Arrays;

import proxies.PersonS;
import proxies.PersonSvc;
import proxies.PersonSvcImplService;

public class Test {
public static void main(String[] args) {
		
		PersonSvcImplService serviceImpl = new PersonSvcImplService();
		
		PersonSvc service = serviceImpl.getPersonSvcImplPort();
		
		PersonS p1 = new PersonS(); p1.setName("Pankaj"); p1.setId(1); p1.setAge(30);
        PersonS p2 = new PersonS(); p2.setName("Meghna"); p2.setId(2); p2.setAge(25);
        
        System.out.println("Add Person Status="+service.addPerson(p1));
        System.out.println("Add Person Status="+service.addPerson(p2));
        
      //get person
        System.out.println("\n"+service.getPerson(1).toString());
         
        //get all persons
        System.out.println("\n"+Arrays.asList(service.getAllPersons()));
        System.out.println(service.toString());
         
        //delete person
        System.out.println("\n"+"Delete Person Status="+service.deletePerson(2));
         
        //get all persons
        System.out.println("\n"+Arrays.asList(service.getAllPersons()));
        System.out.println(service.toString());
        
	}
	

}
