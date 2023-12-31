package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "C:\\Users\\I.Xhahili\\IdeaProjects\\INPS\\src\\test\\resources\\features",
        glue= {"Step_Definitions"},
        plugin = { "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "pretty", "json:target/cucumber-reports/Cucumber.json",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",},
       // monochrome = true,
        tags = "@LavoroINPS"
        // @Regression
        // publish = false
        //  @TestAnpal
        // @Ricerca
        // @LavoroINPS
        // @zerobank
        // @RicercaTestNegativo
        //  @CarateriSpeziali
        //  @RicercaCon3Valori
        //   @Notizie
        //  @Lettere_Verifica
        // test -Dcucumber.filter.tags="@smoke"
)
public class TestRunner {

}
