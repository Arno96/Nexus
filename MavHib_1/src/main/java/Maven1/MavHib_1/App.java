package Maven1.MavHib_1;

import java.util.List;

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
    	//Hero h1=new Hero();
    	//Hero u=new Hero();
    	//u.setId(2);
    	
    	//u.setName("Hanzo");
    	//h1.setName("Dva");
    	//h1.setAge(19);
    	
    	HeroDao daoObj=new HeroDaoImpl();
    	//boolean h3=daoObj.deleteHero(3);
    	Hero h2=daoObj.getHero(2);
    	if(h2==null) {
    		System.out.println("hero doesnt exist");
    	}
    	else {
    		h2.setAge(40);
    		
    	//System.out.println(h2);
    	boolean h4=daoObj.updateHero(h2);
    	if(h4) {
    		System.out.println("hero updated");
    	}
    	else {
    	System.out.println("not updated");	
    	}
    	}
    	//if(h3) {
    	//	System.out.println("hero deleted");
    //	}
    //	else {
    	//	System.out.println("not deleted");
    //	}
    	//boolean r=daoObj.addHero(h1);
    	//if(r){
    	//	System.out.println("Person added");
    	//}
    	//else {
    	//	System.out.println("Person not added");
    	//}
    	List<Hero> hero=daoObj.getAllHeroes();
    	//System.out.println(hero);
    	//for(int i=0;i<hero.size();i++) {
    	//	System.out.println(hero.get(i).getId());
    	//	System.out.println(hero.get(i).getName());
    	//	System.out.println(hero.get(i).getAge());
    	//for(Hero h:hero) {
    	//	System.out.println(h);
    	//}
    	hero.forEach(System.out::println);
    }
}
