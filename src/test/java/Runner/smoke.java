package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       features="src/test/resources/Features/FBLogin.feature",
        glue = "Steps",
        dryRun =false,
        monochrome = true,
        tags = "@login",
        plugin = {"pretty", "html:target/cucumber.html"}

)
public class smoke {
}
