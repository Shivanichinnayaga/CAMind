package Runner;

import org.testng.annotations.Test;

import Pageobject.Bookshelf;
import Pageobject.Giftcards;
import Pageobject.Sale;
import Pageobject.Shoerocks;
import Pageobject.Sign;
import Pageobject.Storage;
import Pageobject.Tvunit;
import Pageobject.collection;
import Pageobject.contactus;
import Pageobject.decor;
import Reusability.Parentclass;
import Utilities.Baseclass;

public class Objectclass extends Baseclass{
	@Test
	public void Object() throws Exception {
        
		
		Sign sg = new Sign(driver);
		sg.person1().click();
		sg.login1().click();
		Thread.sleep(5000);
		sg.email1().sendKeys("shivaniyaga@gmail.com");
		Thread.sleep(5000);
		sg.password1().sendKeys("1234@shivu");
		sg.loginid1().click();

		Bookshelf bs = new Bookshelf(driver);
		bs.Bookshelf1().sendKeys("Bookshelf");
		bs.searchicon1().click();
		

		Shoerocks sr = new Shoerocks(driver);
		sr.shoe1().click();
		sr.helpsearch1().sendKeys("How do I cancel order?");
		sr.icon1().click();
		
		Sale s = new Sale(driver);
		s.sale1().click();
		Thread.sleep(2000);
		s.sofa1().click();

		contactus cu = new contactus(driver);
		Thread.sleep(2000);
		cu.contactus1().click();

		decor d = new decor(driver);
		d.decor1().click();
		Thread.sleep(2000);
		d.carpets1().click();

		Storage sgg = new Storage(driver);
		sgg.Storage1().click();
		Thread.sleep(2000);
		sgg.cupboards2().click();

	    collection cc = new collection(driver);
		cc.collection1().click();
		Thread.sleep(2000);
		cc.gakurange1().click();
		
		Tvunit tv=new Tvunit(driver);
		tv.Book1().click();
		
		Giftcards tw = new Giftcards(driver);
		tw.gift1().click();
		tw.house1().click();
		
		

	}
}
