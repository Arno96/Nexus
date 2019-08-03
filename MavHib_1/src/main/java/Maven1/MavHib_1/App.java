package Maven1.MavHib_1;

import com.dao.HeroDao;
import com.dao.HeroDaoImpl;
import com.frame.Hero;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Hero h=new Hero();
    	//p.setId(101);
    	h.setName("Genji");
    	h.setAge(35);
    	
    	HeroDao daoObj=new HeroDaoImpl();
    	boolean r=daoObj.addHero(h);
    	if(r){
    		System.out.println("Person added");
    	}
    	else {
    		System.out.println("Person not added");
    	}
    }
}
