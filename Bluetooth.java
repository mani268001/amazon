package runner_class.org;



import java.awt.AWTException;
import java.io.IOException;

import Amazon_task.org.Amazon2;
import baseclass.org.Baseclass;

public class Bluetooth extends Baseclass{

	public static void main(String[] args) throws IOException, AWTException {
	browser_Launch("Chrome");
	
	url("https://www.amazon.in/");
	implicitlywait(2000);
	
	Amazon2 am=new Amazon2(driver);
	
	am.getAccount().click();
	am.getAp_email().sendKeys("9715957419");
	am.getContinue().click();
	implicitlywait(2000);
	am.getAp_password().sendKeys("9715957419");
	am.getSignInSubmit().click();
	implicitlywait(2000);
	
	
    sendkeys(am.getSerchbox(),"truke Buds s1");	
	implicitlywait(2000);
	robot();
//	//am.getTrukes1_2().click();
//	implicitlywait(2000);
	am.getCart2().click();
	implicitlywait(2000);
	am.getSerchbox().clear();
	implicitlywait(3000);
	
	am.getSerchbox().sendKeys("ptron bassbuds duo in-ear bluetooth 5.1");
	robot();
	//	am.getpTron_3().click();
//	implicitlywait(2000);
	am.getpTron3_cart().click();
	implicitlywait(3000);
	am.getSerchbox().clear();
	implicitlywait(2000);
	
	am.getSerchbox().sendKeys("lava probuds n31 neckband");
	implicitlywait(2000);
	robot();
//	am.getLava4().click();
//	implicitlywait(2000);
	am.getLava_cart().click();
	implicitlywait(3000);
	am.getSerchbox().clear();
	implicitlywait(2000);
	
	implicitlywait(2000);
	am.getALL_cart().click();
	implicitlywait(5000);
	Screenshot("Bluetooth1");
	implicitlywait(2000);
	am.getDelete().click();
	
	am.getSerchbox().sendKeys("oppo A78 5g back cover");
	implicitlywait(2000);
	robot();
//	am.getOppoA78().click();
//	implicitlywait(2000);
	am.getOppo_cart().click();
	implicitlywait(3000);
	am.getSerchbox().clear();
	
	implicitlywait(2000);
	am.getSerchbox().sendKeys("samsung a53 screen guard");
	implicitlywait(2000);
	robot();
//	am.getSamsung().click();
//	implicitlywait(2000);
	am.getSamsung_cart().click();
	implicitlywait(3000);
	am.getSerchbox().clear();
	
	am.getSerchbox().sendKeys("acwo dwots 323 earbuds");
	implicitlywait(2000);
	robot();
//	am.getAcwo().click();
//	implicitlywait(2000);
	am.getAcwo_cart().click();
	implicitlywait(3000);
	am.getSerchbox().clear();
	
	sendkeys(am.getSerchbox(),"boAt Bluetooth v5.");
	implicitlywait(2000);
	robot();
	//am.getBoatv53_1().click();
	implicitlywait(2000);
	am.getAdd_to_cart().click();
	implicitlywait(3000);
	
	am.getALL_cart().click();
	implicitlywait(4000);
	Screenshot("Bluetooth");
	
	
	}	
}
