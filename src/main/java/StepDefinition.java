import cucumber.api.Scenario;
import cucumber.api.java.Before;
import fast.common.glue.BaseCommonStepDefs;
import fast.common.glue.GuiCommonStepDefs;
import fast.common.logging.FastLogger;

public class StepDefinition extends BaseCommonStepDefs {
    public static FastLogger logger= FastLogger.getLogger("StepDefinition");
    GuiCommonStepDefs _guiCommonStepDefs= new GuiCommonStepDefs();

    @Before
    public void beforeScenario(Scenario scenario) throws Exception{
        super.beforeScenario(scenario);
    }
}
