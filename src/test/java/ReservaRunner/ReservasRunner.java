package ReservaRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith; 

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/reserva.feature"
				,glue={"ReservaSteps"} 
		 )

public class ReservasRunner {


	

	
}
