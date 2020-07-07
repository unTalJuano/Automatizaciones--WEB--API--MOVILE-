package co.com.automatizacion.appium.Questions;


import co.com.automatizacion.appium.screenplay.ui.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ElResultado implements Question<Boolean>{

	private String resulObtenido;
	private int resul;
	
	@Override
	public Boolean answeredBy(Actor actor) {
		
		resulObtenido=Text.of(Home.LBL_RESULTADO).viewedBy(actor).asString();
		
		if (resulObtenido.equals(resul+"")) {
			return true;
		}
		
		return false;
		
	}
	
	public static ElResultado enLaApp() {
		return new ElResultado();
	}
	
	public ElResultado es(int resul) {
		this.resul=resul;
		return this;
	}


	
	

}
