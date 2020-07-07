package co.com.automatizacion.appium.screenplay.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class Home extends PageObject {
	
	public static final Target APP_CALCULADORA= Target.the("app calculadora")
			.located(By.xpath("(//android.widget.TextView[@content-desc=\"Calculator\"])[1]"));
	
	public static final Target SIMBOLO_SUMA= Target.the("simbolo suma")
			.located(By.id("com.android.calculator2:id/op_add"));
	
	public static final Target SIMBOLO_RESTA= Target.the("simbolo resta")
			.located(By.id("com.android.calculator2:id/op_sub"));
	
	public static final Target SIMBOLO_MULTIPLICA= Target.the("simbolo multiplica")
			.located(By.id("com.android.calculator2:id/op_mul"));
	
	public static final Target SIMBOLO_DIVIDE= Target.the("simbolo divide")
			.located(By.id("com.android.calculator2:id/op_div"));
	
	public static final Target SIMBOLO_IGUAL= Target.the("simbolo igual")
			.located(By.id("com.android.calculator2:id/eq"));
	
	public static final Target LBL_RESULTADO= Target.the("Se muestra el resultado")
			.located(By.id("com.android.calculator2:id/result"));
		

}
